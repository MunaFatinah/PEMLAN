// package praktic.geometry.shapes
package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.TwoDimensional;

/**
 * Class Square untuk persegi 2D
 */
public class Square extends Shape implements TwoDimensional {
    private double side;
    
    public Square() {
        // Constructor default
        setName("Square");
    }
    
    public Square(double side) {
        this();
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return side * side;
    }
    
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Name            : " + getName());
        System.out.println("Area            : " + getArea());
        System.out.println("Perimeter       : " + getPerimeter());
    }
}