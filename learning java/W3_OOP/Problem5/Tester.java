public class Tester{
    public static void main(String[] args) {
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", 101);
        Book b2 = new Book("Java for Beginners", "Dr. Coder", 202);
        Book b3 = new Book("A Brief History of Time", "Stephen Hawking", 303);
        Book.addbook(b1);
        Book.addbook(b2);
        Book.addbook(b3);
        Book.showbookcollection();
        System.out.println("==========");
        Book.deletebook(1);
        Book.showbookcollection();


        
    }
}