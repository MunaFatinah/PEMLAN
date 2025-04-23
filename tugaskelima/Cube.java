// package praktic.geometry.shapes
package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;

/**
 * Class Cube untuk kubus 3D
 */
public class Cube extends Shape implements ThreeDimensional, Weightable {
    private double edge;
    private double mass;
    
    public Cube() {
        // Constructor default
        setName("Cube");
    }
    
    public Cube(double edge, double mass) {
        this();
        this.edge = edge;
        this.mass = mass;
    }
    
    @Override
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }
    
    @Override
    public double getVolume() {
        return edge * edge * edge;
    }
    
    @Override
    public double getWeight() {
        return mass * g;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Name            : " + getName());
        System.out.println("Surface area    : " + getSurfaceArea());
        System.out.println("Volume          : " + getVolume());
        System.out.println("Weight          : " + getWeight());
    }
}