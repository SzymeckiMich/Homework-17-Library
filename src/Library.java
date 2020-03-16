import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> allBooks = new ArrayList<>();
    private List<Person> users = new ArrayList<>();

    public void addBookToStock(Book book) {
        allBooks.add(book);
    }

    public void registerUser(Person person) {
        users.add(person);
    }


    public void borrowBook(Person person, Book book) {
        if (book.getAvailability() > 0) {
            person.getBorrowedBooks().add(book);
            book.setAvailability(book.getAvailability() - 1);
            System.out.println("Książka została wypożyczona i przypisana do konta użytkownika");
        } else {
            System.out.println("Książka chwilowo niedostępna");
        }
    }


    public void returnBook(Person person, Book book) {
        if (person.getBorrowedBooks().contains(book)) {
            person.getBorrowedBooks().remove(book);
            book.setAvailability(book.getAvailability() + 1);
            System.out.println("Książka została zwrócona i usunięta z konta użytkownika");
        } else {
            System.out.println("Dana osoba nie może oddać tej książki");
        }
    }

    public void showBorrowedBooks(Person person) {
        if (person.getBorrowedBooks().isEmpty()) {
            System.out.println("Brak wypożyczonych książek");
        } else {
            System.out.println(person.borrowedBooks.toString());
        }
    }

    public void howMuchBooks(Book book) {
        System.out.println(book.getAvailability());
    }

    public void showBooksWithAvailability() {
        for (int i = 0; i < allBooks.size(); i++) {
            System.out.println(allBooks.get(i).toString() + " [" + allBooks.get(i).getAvailability() + " szt.]");
        }
    }


}