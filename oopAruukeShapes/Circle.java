class Circle extends Shape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }


    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}