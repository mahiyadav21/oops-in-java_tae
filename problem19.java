19. A library wants to store details of multiple books.
Question:
Create a class Book with attributes:
 title
 author
 price
Create an array of Book objects and display the details of all books.
Here is the Java code (without comments):


class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book("Java Basics", "Amit", 299);
        books[1] = new Book("OOP Concepts", "Neha", 399);
        books[2] = new Book("Data Structures", "Rahul", 499);

        for (Book b : books) {
            b.display();
        }
    }
}
```
Here is the Java code (without comments):

```java id="m4k8qs"
class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book("Java Basics", "Amit", 299);
        books[1] = new Book("OOP Concepts", "Neha", 399);
        books[2] = new Book("Data Structures", "Rahul", 499);

        for (Book b : books) {
            b.display();
        }
    }
}

