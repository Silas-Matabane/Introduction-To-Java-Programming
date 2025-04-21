/*  The program contains two classes. The first of these, TestSimpleCircle, is the main class.
    Its sole purpose is to test the second class, SimpleCircle. Such a program that uses the class
    is often referred to as a client of the class. When you run the program, the Java runtime system
    invokes the main method in the main class.
    You can put the two classes into one file, but only one class in the file can be a public class.
    Furthermore, the public class must have the same name as the file name. Therefore, the file
    name is TestSimpleCircle.java, since TestSimpleCircle is public. Each class in the source
    code is compiled into a .class file. When you compile TestSimpleCircle.java, two class files
    TestSimpleCircle.class and SimpleCircle.class are generated, as shown in Figure 9.5.*/


class TestSimpleCircle{

    /*main method*/
    public static void main(String[] args){

        SimpleCircle circle1 = new SimpleCircle();
        // Create a circle with radius 1
        System.out.println("The area of the circle 1 of the radius "+ circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        // Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
              System.out.println("The area of the circle of radius "
                        + circle3.radius + " is " + circle3.getArea());
        // Modify circle radius
        circle2.radius = 100; // or circle2.setRadius(100)
        System.out.println("The area of the circle of radius  "+ circle2.radius + " is " + circle2.getArea());
    }

}

class SimpleCircle {

    /*The radius of the circle*/
    double radius;
    SimpleCircle(){
        radius = 1;
    }
    /** Construct a circle object */
    SimpleCircle(double newRadius){
      radius = newRadius;
    }
    /*Return the perimeter of the circle*/
    double getPerimeter(){
     return 2 * radius * Math.PI;
    }
    double getArea(){
      return radius * radius * Math.PI;
    }
    /*Set new radius for this circle*/
    void setRadius(double newRadius){
      radius = newRadius;
    }
}
