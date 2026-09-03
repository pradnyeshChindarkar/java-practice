package DesignPatterns.ObjectCreational.FactoryMethod;

interface Shape{
    void draw();
}

// Circle's own implementation
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
// Square's own implementation
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

// Rectangle's own Implementation
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Shape Factory Interface
interface ShapeFactory{
    Shape createShape();
}

// Factory method that helps create objects
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}

class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

// ShapeFactory circleShape = new <The Class which implements 'ShapeFactory' i.e. CircleFactory, SquareFactory>
// As interface ShapeFactory has method createShape() that returns an Shape(interface)
// The ShapeFactory implemented Factory Class will return the class which implements Shape interface. E.g. Circle, Rectangle, Sqaure.
public class FactoryMethodMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new CircleFactory();
        Shape shape = shapeFactory.createShape();
        shape.draw();

        ShapeFactory shapeFactory2 = new RectangleFactory();
        Shape shape2 = shapeFactory2.createShape();
        shape2.draw();

        ShapeFactory shapeFactory3 = new SquareFactory();
        Shape shape3 = shapeFactory3.createShape();
        shape3.draw();
    }
}
