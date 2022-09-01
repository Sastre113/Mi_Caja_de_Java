package main.Laboratorio.design.patterns.creational.factory.example;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1 sept 2022, 20:50:59
 */
public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(ShapeType shapeType) {
		if (shapeType == null) {
			throw new IllegalArgumentException();
		}
		
		switch(shapeType) {
			case CIRCLE:
				return new Circle();
				break;
			case RECTANGLE:
				break;
			case SQUARE:
				break;
			default:
				break;
		}
		
		
		if (shapeType.equals(ShapeType.CIRCLE)) {
			return new Circle();

		} else if (shapeType.equals(ShapeType.RECTANGLE)) {
			return new Rectangle();

		} else if (shapeType.equals(ShapeType.SQUARE)) {
			return new Square();
		}

		return null;
	}
}
