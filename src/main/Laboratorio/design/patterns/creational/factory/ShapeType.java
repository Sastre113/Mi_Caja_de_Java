package main.Laboratorio.design.patterns.creational.factory;

import java.lang.reflect.InvocationTargetException;

/**
 * 
 * @author Miguel �. Sastre <sastre113@gmail.com>
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

		throw new IllegalArgumentException("Par�metro no reconocido");
	}
	
	public static Shape getInstanceOf(String shape) {
		return ShapeType.getInstanceOf(ShapeType.getShapeType(shape));
	}
	
	public static Shape getInstanceOf(ShapeType shape) {
		return shape.getInstanceOf();
	}
 
	public Shape getInstanceOf() {
		try {
			return this.getClazz().getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			throw new RuntimeException(e.getCause());
		}
	}

	public Class<? extends Shape> getClazz() {
		return clazz;
	}
}
