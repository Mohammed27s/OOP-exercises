
//This is the exercises number 1
//Create a Java class named Car with attributes like make, model, and year. Instantiate an object
// of this class and set values using a constructor.

public class Car {

    // Car attributes

    public String name;
    public String model;
    public String countryMade;
    public String year;

    //constructor
    public Car(String carName, String carModel, String carMade, String carYear){

        this.name = carName;
        this.model = carModel;
        this.countryMade = carMade;
        this.year = carYear;

    }

    //getter

    public String getName(){

        return name;
    }

    public String getModel(){

        return model;
    }

    public String getMade(){

        return countryMade;
    }

    public String getYear(){

        return year;
    }




    public static void main(String[] args){


        Car carInformation = new Car("Nissan", "78663mlp","China", "1998");

        System.out.println("The car name is: "+carInformation.getName());
        System.out.println("The car model is: "+carInformation.getModel());
        System.out.println("The car made in: "+carInformation.getMade());
        System.out.println("The year of production of the car: "+carInformation.getYear());



    }


}
