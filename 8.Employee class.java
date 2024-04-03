import javax.swing.text.html.StyleSheet;

//Create a Java class named Employee with private attributes for name, position, and salary.
// Write a method to display the employee's details.
public class Employee {


    private String name;
    private String job;
    private Double salary;


    //Constructor
    public Employee(String name, String job, Double salary){

        this.name = name;
        this.job = job;
        this.salary = salary;

    }

    //getter

    public String getName(){

        return name;
    }

    public String getJob(){

        return job;
    }

    public Double getSalary(){

        return salary;
    }


    public void employeeDetails(){

        System.out.println("The employee name: "+getName()+"\n");
        System.out.println("His/her job name "+getJob()+"\n");
        System.out.println("The total salary: "+getSalary());

    }





    public static void main(String[] args){

        Employee employee = new Employee("Mohammed", "Software Development", 5000.0);

        System.out.println("*** The employee information *** "+"\n");
        employee.employeeDetails();

    }

}
