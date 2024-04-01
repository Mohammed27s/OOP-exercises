
//Write a Java class called Student with private attributes for name, age,
// and grade. Include a method to display the student's information.
public class Student {

    private String name;
    private Integer age;
    private Double grade;

    public Student(String name,Integer age, Double grade){

        this.name = name;
        this.age = age;
        this.grade = grade;

    }



    public static void main(String[] args){

        Student studentInfo = new Student("Mohammed", 25, 75.9);

        System.out.println("The student name "+studentInfo.name+", his/her age "+studentInfo.age+" and his/her mark = "+studentInfo.grade);
    }




}
