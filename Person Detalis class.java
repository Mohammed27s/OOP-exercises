
//Write a Java class named PersonDetails with private attributes for firstName and lastName.
// Include a method to concatenate and return the full name.
public class PersonDetails {


   private String firstName;
   private String lastName;


   public PersonDetails(String firstName, String lastName){

       this.firstName = firstName;
       this.lastName = lastName;

   }

   //getter

    public String getFirstName(){

       return firstName;
    }

    public String getLastName(){

       return lastName;
    }


    //This method for concatenate two first and last name

    public String fullNameConcat(){


       return firstName.concat(lastName);
    }




    public static void main(String[] args){

       PersonDetails person = new PersonDetails("Mohammed", " Salim");

       System.out.println("My full name is "+person.fullNameConcat());



    }

}
