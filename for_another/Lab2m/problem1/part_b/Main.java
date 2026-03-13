public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997, 500);


        System.out.println(book1);


        book1.setTitle("Harry Potter and the Philosopher's Stone");
        book1.setNumberOfPages(520);

        
        System.out.println("Updated: " + book1);

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getPublicationYear());
        System.out.println("Pages: " + book1.getNumberOfPages());
    }
}