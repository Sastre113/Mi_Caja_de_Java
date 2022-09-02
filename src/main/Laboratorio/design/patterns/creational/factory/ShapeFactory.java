package main.Laboratorio.design.patterns.creational.factory;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1 sept 2022, 20:50:59
 */
public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		return ShapeType.getInstanceOf(shapeType);
	}
}
