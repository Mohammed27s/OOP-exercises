
//Develop a program that demonstrates the use of constructors in a class named Book,
// initializing attributes like title, author, and publicationYear.
public class Book {

    private String title;
    private String author;
    private String publicationYear;


    public Book(String title, String author, String publicationYear){

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;

    }



    public static void main(String[] args){


        Book book = new Book("The power of favor", "Mohammed", "1990");

        //I use this to display all the information about the book
        System.out.println("The book information "+"\n");
        System.out.println("The name of the book(title): "+book.title+"\n"+" the author name: "+book.author+"\n"+
                " the year of publication: "+book.publicationYear);




    }
}
