
//Implement a class called Circle with private attributes for radius and color.
// Include a method to calculate the area of the circle.
public class Circle {


    private Double radius;
    private String color;


    public Circle(double radius, String color){

        this.radius = radius;
        this.color = color;

    }

    //getter

    public Double getRadius(){

        return radius;
    }

    public String getColor(){

        return color;
    }

    // this method for getting the value of the area of the circle
    public Double areaOfCircle(){

        return 3.14 * Math.pow(radius, 2);
    }


    public static void main(String[] args){

        System.out.println("calculating the area of the circle"+"\n");

        Circle circleArea = new Circle(4.5, "red");

        System.out.println("The area of the "+circleArea.getColor()+" circle = "+circleArea.areaOfCircle());




    }

}
