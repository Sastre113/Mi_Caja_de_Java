package main.Laboratorio.design.patterns.creational.factory.example;

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

	public static <T extends Shape> T getInstanceOf(String shape) {
		if (shape == null) {
			throw new IllegalArgumentException("El parámetro de entrada no puede ser nulo");
		}
		
		ShapeType shapeType = getShapeType(shape);
		
		
		return shapeType.getInstanceOf(shape);
	}

	public static ShapeType getShapeType(String shape) {
		for (ShapeType shapeType : ShapeType.values()) {
			if (shapeType.name().equals(shape)) {
				return shapeType;
			}
		}

		throw new IllegalArgumentException("Parámetro no reconocido");
	}

	public Class<? extends Shape> getClazz() {
		return clazz;
	}
	
}
