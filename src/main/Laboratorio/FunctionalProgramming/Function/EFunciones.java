/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 5 sept 2022, 21:24:05
 */
public enum EFunciones implements IFx{

	FX{
		@Override
		public void ejecutar() {
			// TODO Auto-generated method stub
			super.getId();
			System.out.println("Ejecutando FX...");
		}
		
	},
	GX{
		@Override
		public void ejecutar() {
			// TODO Auto-generated method stub
			System.out.println("Ejecutando  GX...");
		}
		
	},
	HX{

		@Override
		public void ejecutar() {
			// TODO Auto-generated method stub
			System.out.println("Ejecutando  HX...");
		}
		
	};
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
