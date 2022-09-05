/**
 * 
 */
package main.Laboratorio.String;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 4 sept 2022, 18:00:14
 */
public final class Comparador {
	
	public static int comparaString(String str1, String str2) {
		String strLim = (str1.length() < str2.length()) ? str1 : str2;
		
		for(int i = 0; i < strLim.length(); i++) {
			if(str1.codePointAt(i) != str2.codePointAt(i)) {
				return convertToOneOrZero(str2.codePointAt(i) - str1.codePointAt(i));
			}
		}
		
		return convertToOneOrZero(str2.length() - str1.length());
	}
	
	private static int convertToOneOrZero(int number) {
		if(number != 0) {
			return number > 0 ? 1:-1;			
		}
		
		return number;
	}
}
