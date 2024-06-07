package bootcamp10.Assignments.GLAB303_10_2;

public class myRunner {
    public static void main(String args[]) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());

        // Example of Object type casting
        // declaration of object var obj of the Shape class
        Shape sObj = new Shape();
        sObj.displayshapName();
        System.out.println(sObj instanceof Shape);  // true

        // object creation of the Circle class
        System.out.println("++++++++++");

        // it's fine because a Circle is a Shape by inheritance
        Shape shapeCircleObj = new Circle(100); // Upcasting
        shapeCircleObj.displayshapName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);     // Run circle's toString()

        // Use instanceof operator for Validation
        System.out.println(shapeCircleObj instanceof Circle);   // true
        System.out.println(sObj instanceof Circle); // false because Shape is not a Circle

        System.out.println("---------");
        Shape shapeRectangleObj = new Rectangle("Red");     // Upcasting
        shapeRectangleObj.displayshapName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(2);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);      // Run Rectangle's toString()

        // Use instanceof operator for validation
        System.out.println(shapeRectangleObj instanceof Rectangle); // true
        System.out.println(sObj instanceof Rectangle);  // false because Shape is not a Rectangle
        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue"); //UpCasting shapeTriangleObj.displayshapName();
        shapeTriangleObj.setHeight(2);
        shapeTriangleObj.setBase(3);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);   // Run Triangle's toString()

        // Use instanceof operator for Validation
        System.out.println(shapeTriangleObj instanceof Triangle); // true
        System.out.println(sObj instanceof Triangle); // false because Shape is not a Triangle
        System.out.println("--------------------");

        Cylinder cylinderShape = new Cylinder(3); //UpCasting cylinderShape.displayshapName();
        cylinderShape.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinderShape.getVolume());
        System.out.println(cylinderShape); // Run cylinderShape's toString()
    }
}

//Area of Circle 31415.926535897932
//I am a Shape
//true
// ++++++++++
// Drawing a Circle of radius 100.0
// Area of Circle 31415.926535897932
// Circle[ radius = 100.0Shape[color=null]]
// true
// false
// ---------
// I am a Rectangle
// Area of Rectangle is 4.0
// Rectangle[height=2.0,width=2.0,Shape[color=Red]]
// true
// false
// --------------------
// Area of Triangle is 3.0
// Triangle]base3.0,height=2.0,Shape[color=Blue]]
// true
// false
// --------------------
// Area of Cylinder is 84.82300164692441
// radius is: 3.0height is : 3.0
