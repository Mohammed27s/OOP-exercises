package RectangleCalculate;
//Develop a program that defines a class named Rectangle with private attributes
// for length and width. Include methods to calculate the area and perimeter of the rectangle

public class RectangleRead {

    private Double length;
    private Double width;

    //This calculating the area
    public Double calArea(Double lengthArea, Double widthArea){

        this.length = lengthArea;
        this.width = widthArea;

        return  lengthArea * widthArea;
    }

    //This is calculating the width
    public Double calWidth(Double lengthPerimeter, Double widthPerimeter){

        this.length = lengthPerimeter;
        this.width = widthPerimeter;

        return  2 * (lengthPerimeter + widthPerimeter);

    }





    public static void main(String[] args){

        RectangleRead cal = new RectangleRead();

        System.out.println("This is calculate the area and perimeter of the rectangle"+"\n");

        Double totalArea = cal.calArea(23.1, 230.3);
        Double totalWidth = cal.calWidth(88.3, 903.2);

        System.out.println("The total of area rectangle = "+totalArea);
        System.out.println("The total of width rectangle = "+totalWidth);





    }

}
