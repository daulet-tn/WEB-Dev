public class Main {
        public static void main(String[] args) {

        // массив
        Shape3D[] shapes = new Shape3D[3];

        shapes[0] = new Cylinder(3, 5);
        shapes[1] = new Sphere(4);
        shapes[2] = new Cube(2);

        // тест
        for (Shape3D shape : shapes) {

            System.out.println("Shape: " + shape.getClass().getSimpleName());

            System.out.println("Volume: " + shape.volume());

            System.out.println("Surface Area: " + shape.surfaceArea());

            System.out.println("----------------------");
        }

    }
}