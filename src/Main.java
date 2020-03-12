public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Person person1 = new Person("Piotr", "Bajerant");
        Person person2 = new Person("Jan", "Kowalski");
        Person person3 = new Person("Paweł", "Nowak");


        Book book1 = new Book("Fiasko", "Stanisław Lem");
        Book book2 = new Book("Futu.re", "Dmitry Glukhovsky");
        Book book3 = new Book("Sztywny", "Michał Gołkowski");

        library.allBooks.add(book1);
        library.allBooks.add(book2);
        library.allBooks.add(book3);

        library.users.add(person1);
        library.users.add(person2);
        library.users.add(person3);

        library.borrowBook(person1, book1);
        library.borrowBook(person1, book2);
        library.borrowBook(person3, book3);
        library.borrowBook(person2, book3);

        library.showBooksWithAvailability();

        library.returnBook(person1, book3);



    }
}
