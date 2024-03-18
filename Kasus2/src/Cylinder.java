public class Cylinder extends Shape{
    private double radius;
    private double height;

    public Cylinder(double r, double h){
        super("Cylinder");
        radius = r;
        height = h;
    }

    public double area(){
        return radius*2*Math.PI*height;
    }

    public String toString(){
        return super.toString() + " of radius "+radius+", of height "+height;
    }
}
