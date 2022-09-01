package main.Laboratorio.design.patterns.creational.factory.example;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

import javax.management.RuntimeErrorException;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1 sept 2022, 21:00:26
 */
public enum ShapeType {
	
	CIRCLE   (Circle.class),
	RECTANGLE(Rectangle.class), 
	SQUARE   (Square.class);
	
	private Class<? extends Shape> clazz;

	private ShapeType(Class<? extends Shape> clazz) {
		this.clazz = clazz;
	}

	public static ShapeType getShapeType(String shape) {
		for (ShapeType shapeType : ShapeType.values()) {
			if (shapeType.name().equals(shape)) {
				return shapeType;
			}
		}

		throw new IllegalArgumentException("Parámetro no reconocido");
	}
	
	public static <T extends Shape> T getInstanceOf(String shape) {
		return ShapeType.getInstanceOf(ShapeType.getShapeType(shape));
	}
	
	public static <T extends Shape> T getInstanceOf(ShapeType shape) {
		return shape.getInstanceOf();
	}
 
	public <T extends Shape> T getInstanceOf() {
		try {
			return (T) this.getClazz().getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	public Class<? extends Shape> getClazz() {
		return clazz;
	}
}
