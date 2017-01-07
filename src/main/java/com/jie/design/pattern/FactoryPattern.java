package com.jie.design.pattern;

public class FactoryPattern {

	public interface Shape {
		void draw();
	}

	public class Circle implements Shape {

		@Override
		public void draw() {
			System.out.println("Inside Circle::draw() method.");
		}
	}

	public class Rectangle implements Shape {

		@Override
		public void draw() {
			System.out.println("Inside Rectangle::draw() method.");
		}
	}

	public class Square extends Rectangle {

		@Override
		public void draw() {
			System.out.println("Inside Square::draw() method.");
		}
	}

	public interface Color {
		void fill();
	}

	public class Red implements Color {

		@Override
		public void fill() {
			System.out.println("Inside Red::fill() method.");
		}
	}

	public class Green implements Color {

		@Override
		public void fill() {
			System.out.println("Inside Green::fill() method.");
		}
	}

	public class Blue implements Color {

		@Override
		public void fill() {
			System.out.println("Inside Blue::fill() method.");
		}
	}

	public abstract class AbstractFactory {
		abstract Color getColor(String color);

		abstract Shape getShape(String shape);
	}

	public class ShapeFactory extends AbstractFactory {

		@Override
		public Shape getShape(String shapeType) {

			if (shapeType == null) {
				return null;
			}

			if (shapeType.equalsIgnoreCase("CIRCLE")) {
				return new Circle();

			} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
				return new Rectangle();

			} else if (shapeType.equalsIgnoreCase("SQUARE")) {
				return new Square();
			}

			return null;
		}

		@Override
		Color getColor(String color) {
			return null;
		}
	}

	public class ColorFactory extends AbstractFactory {

		@Override
		public Shape getShape(String shapeType) {
			return null;
		}

		@Override
		Color getColor(String color) {

			if (color == null) {
				return null;
			}

			if (color.equalsIgnoreCase("RED")) {
				return new Red();

			} else if (color.equalsIgnoreCase("GREEN")) {
				return new Green();

			} else if (color.equalsIgnoreCase("BLUE")) {
				return new Blue();
			}

			return null;
		}
	}

	public class FactoryProducer {
		public AbstractFactory getFactory(String choice) {

			if (choice.equalsIgnoreCase("SHAPE")) {
				return new ShapeFactory();

			} else if (choice.equalsIgnoreCase("COLOR")) {
				return new ColorFactory();
			}

			return null;
		}
	}

	public static void main(String[] args) {
		// get shape factory
		AbstractFactory shapeFactory = new FactoryPattern().new FactoryProducer()
				.getFactory("SHAPE");

		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// call draw method of Shape Circle
		shape1.draw();

		// get an object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// call draw method of Shape Rectangle
		shape2.draw();

		// get an object of Shape Square
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// call draw method of Shape Square
		shape3.draw();

		// get color factory
		AbstractFactory colorFactory = new FactoryPattern().new FactoryProducer()
				.getFactory("COLOR");

		// get an object of Color Red
		Color color1 = colorFactory.getColor("RED");

		// call fill method of Red
		color1.fill();

		// get an object of Color Green
		Color color2 = colorFactory.getColor("Green");

		// call fill method of Green
		color2.fill();

		// get an object of Color Blue
		Color color3 = colorFactory.getColor("BLUE");

		// call fill method of Color Blue
		color3.fill();
	}
}
