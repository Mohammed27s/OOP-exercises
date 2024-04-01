
//This is the exercise 2
//Implement a class called Person with private attributes for name and age.
// Write public methods to get and set these attributes.
public class Person {

    private String name;
    private Integer age;

    //Getter
    public String getName(){

        return name;
    }

    public Integer getAge(){

        return age;
    }

    //Setter

    public void name(String name){

        this.name = name;
    }

    public void age(Integer age){

        this.age = age;
    }

    //Constructor

    public Person(String name, Integer age){

        this.name = name;
        this.age = age;
    }


    public static void main(String[] args){

        System.out.println("This is personal information "+"\n");

        Person personInfo = new Person("Mohammed", 25);

        //Getting all values
        System.out.println("The name is: "+personInfo.getName());
        System.out.println("The age is: "+personInfo.getAge());

        //modifying the values

        personInfo.name("John");
        personInfo.age(44);

        

    }


}
