import java.util.Arrays;

class Book {
    int bookId;
    String title, author;

    Book(int id, String t, String a) {
        bookId = id;
        title = t;
        author = a;
    }

    public String toString() {
        return bookId + " | " + title + " | " + author;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Algorithms", "CLRS"),
            new Book(2, "Java Basics", "James"),
            new Book(3, "DSA", "Narendra")
        };

        // Linear search
        String searchTitle = "DSA";
        for (Book b : books) {
            if (b.title.equals(searchTitle)) {
                System.out.println("Found: " + b);
            }
        }

        // Binary search (sorted by title)
        Arrays.sort(books, (a, b) -> a.title.compareTo(b.title));
        int low = 0, high = books.length - 1;
        String target = "Java Basics";
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareTo(target);
            if (cmp == 0) {
                System.out.println("Found (Binary Search): " + books[mid]);
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
