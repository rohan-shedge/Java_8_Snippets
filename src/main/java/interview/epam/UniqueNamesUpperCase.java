package interview.epam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNamesUpperCase {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        // Adding Books
        final Author peter = new Author("Peter", "peter@yahoo.com", 25);
        bookList.add(new Book("Java Basics", peter, 1000.50));

        bookList.add(new Book("Mysql Basics",
                new Author("Steve", "steve@yahoo.com", 35), 2000.0));

        bookList.add(new Book("Oracle Basics",
                new Author("John", "john@yahoo.com", 45), 3000.0));

        bookList.add(new Book("Angular Basics",
                new Author("Dave", "dave@yahoo.com", 55), 3000.0));

        bookList.add(new Book("Jquery Basics",
                new Author("Dave", "dave@yahoo.com", 55), 1000.0));


        List<String> names = bookList.stream()
                .filter(b -> b.getAuthor().getAge()>= 30)
                .sorted(Comparator.comparing(b ->b.getAuthor().getAge()))
                .limit(2)
                .map(b -> b.getAuthor().getName())
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toList());
        names.forEach(System.out::println);



    }
}
    class Author
    {
        private String name;
        private String email;
        private int age;

        public Author(String name, String email, int age)
        {
            super();
            this.name = name;
            this.email = email;
            this.age = age;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getEmail()
        {
            return email;
        }

        public void setEmail(String email)
        {
            this.email = email;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

    }

    class Book {

        private String name;
        private Author author;
        private double price;

        public Book(String name, Author author, double price) {
            super();
            this.name = name;
            this.author = author;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }