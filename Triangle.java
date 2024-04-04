public class Triangle extends Shape {
    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    
    }

    public double GetArea() {
        return 0.5 * base * height;
    }

}
