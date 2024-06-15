public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    {
        totalBooks++;
    }
    Book( String isbn,String title, String author){
      this.title = title;
      this.author = author;
      this.isbn = isbn;
    }

    Book(String isbn){
        this("Unkown", "Unkown", isbn);
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed!");
        } else{
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed reading the book");
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("8", "Five feet Apart","JK Rowling");
        Book book2 = new Book("1");
        System.out.println(Book.getTotalBooks());
        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook();
    }
}



