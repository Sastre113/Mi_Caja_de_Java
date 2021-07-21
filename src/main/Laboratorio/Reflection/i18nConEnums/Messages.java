/**
 * 
 */
package main.Laboratorio.Reflection.i18nConEnums;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author Miguel
 *
 */
public class Messages {
	private static final String BUNDLE_NAME = "resource.messages";

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
