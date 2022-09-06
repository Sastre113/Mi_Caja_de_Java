/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function;

/**
 * @author Miguel �. Sastre <sastre113@gmail.com>
 * @version 5 sept 2022, 21:24:05
 */
public enum EFunciones implements IFx{

	FX{
		@Override
		public void ejecutar(String id) {
			// TODO Auto-generated method stub
			super.auxiliarFx();
		}
	},
	GX{
		@Override
		public void ejecutar(String id) {
			// TODO Auto-generated method stub
			
		}
	},
	HX{
		@Override
		public void ejecutar(String id) {
			// TODO Auto-generated method stub
			this.auxiliarHX();
		}
		
		private void auxiliarHX() {
			System.out.println("M�todo propio de HX");
		}
	};
	
	private void auxiliarFx() {
		System.out.println("M�todo com�n en EFunciones");
	}
}
