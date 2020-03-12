import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    List<Book> borrowedBooks = new ArrayList<>();

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}


