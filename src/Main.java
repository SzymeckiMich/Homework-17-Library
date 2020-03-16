public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Person person1 = new Person("Piotr", "Bajerant");
        Person person2 = new Person("Jan", "Kowalski");
        Person person3 = new Person("Paweł", "Nowak");


        Book book1 = new Book("Fiasko", "Stanisław Lem");
        Book book2 = new Book("Futu.re", "Dmitry Glukhovsky");
        Book book3 = new Book("Sztywny", "Michał Gołkowski");
        Book book4 = new Book("Cujo", "Stephen King");
        Book book5 = new Book("Martin Eden", "Jack London");

        library.addBookToStock(book1);
        library.addBookToStock(book2);
        library.addBookToStock(book3);
        library.addBookToStock(book4);
        library.addBookToStock(book5);

        library.registerUser(person1);
        library.registerUser(person2);
        library.registerUser(person3);

        library.borrowBook(person1, book1);
        library.borrowBook(person1, book2);
        library.borrowBook(person2, book1);
        library.borrowBook(person2, book3);
        library.borrowBook(person3, book1);
        library.borrowBook(person3, book4);

        library.showBooksWithAvailability();

        library.returnBook(person1, book3);



    }
}
