/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Runnable;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23 sept 2022, 0:42:41
 */
public class Demo {

	public static void main(String[] args) {
		Runnable miRunnable = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Ejecutando miRunnable");
			}
		};
		miRunnable.run();
	
		 
		Runnable runnableLambda = () -> System.out.println("Ejecutando runnableLambda");
		runnableLambda.run();
		
		Runnable runnableMethodReference = Demo::ejecutarMethodReference;
		runnableMethodReference.run();
	}
	
	private static void ejecutarMethodReference() {
		System.out.println("Ejecutando runnableMethodReference");
	}
}
