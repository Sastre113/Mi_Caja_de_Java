/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function.Method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 4 sept 2022, 16:19:09
 */
public enum EUsaMethod {

	FX("fx"), GX("gx");

	private String nameMethod;
	private Method metodo;

	EUsaMethod(String nameMethod) {
		this.nameMethod = nameMethod;
		try {
			this.metodo = ClaseConFunciones.class.getMethod(nameMethod);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new IllegalArgumentException(e);
		}

	}
	
	public void invokedMethod() {
		ClaseConFunciones miClazz = new ClaseConFunciones();
			try {
				this.getMetodo().invoke(miClazz);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public String getNameMethod() {
		return nameMethod;
	}

	public void setNameMethod(String nameMethod) {
		this.nameMethod = nameMethod;
	}

	public Method getMetodo() {
		return metodo;
	}

	public void setMetodo(Method metodo) {
		this.metodo = metodo;
	}
}
