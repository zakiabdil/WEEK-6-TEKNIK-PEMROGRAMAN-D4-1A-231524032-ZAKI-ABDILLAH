abstract public class Shape {
    protected String shapeName;

    public Shape(String name){
        shapeName = name;
    }

    public abstract double area();

    public String toString(){
        return "Shape name: "+shapeName;
    }
}
