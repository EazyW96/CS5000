package Project;

/**
 *
 * @author ciaon
 */
import java.util.InputMismatchException;
import java.util.Scanner;

class Date {
    int nYear;
    int nMonth;
    int nDay;
}

public class LibraryManager {
    private static final int MAX_BOOKS = 100;
    private Book[] book = new Book[MAX_BOOKS];
    private int bookCount = 0;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.displayMainMenu();
    }

    private void displayMainMenu() {
        int choice;
        do {
            System.out.println("Main Menu:");
            System.out.println("1. Add a new book");
            System.out.println("2. Remove a book");
            System.out.println("3. Check out a book");
            System.out.println("4. Check in a book");
            System.out.println("5. Display all book details");
            System.out.println("6. Display all available book details");
            System.out.println("7. Display all checked-out books");
            System.out.println("8. Exit program");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    checkoutBook();
                    break;
                case 4:
                    checkinBook();
                    break;
                case 5:
                    displayAllBooks();
                    break;
                case 6:
                    displayAvailableBooks();
                    break;
                case 7:
                    displayCheckedOutBooks();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);
    }

    private void addBook() {
        try {
            if (bookCount >= MAX_BOOKS) {
                throw new RuntimeException("Cannot add more books. Library is full.");
            }

            System.out.println("\nEnter book details");
            System.out.print("Has an ISBN (10 digits): e.g. 1023456789\t\t\t  ");
            String ISBN = scanner.nextLine();

            // Check if the ISBN has exactly 10 digits
            if (ISBN.length() != 10) {
                throw new RuntimeException("ISBN must have exactly 10 digits.");
            }

            // Check if the ISBN already exists
            if (isISBNExists(ISBN)) {
                throw new RuntimeException("Book with this ISBN already exists in the library.");
            }

            System.out.print("Has title (string): e.g. Java Programming\t\t  ");
            String title = scanner.nextLine();
            System.out.print("Has a Type (string): e.g. textbook, magazine, journal etc  ");
            String type = scanner.nextLine();
            System.out.print("Has a Publisher (string): e.g., TAMUC ");
            String publisher = scanner.nextLine();
            System.out.print("Has Page information (how many pages) (integer): e.g., 506 ");
            int pages = scanner.nextInt();
            System.out.print("Has Price (float): e.g., 20.00 ");
            float price = scanner.nextFloat();
            System.out.print("Has Publication Year (integer): e.g., 2013 ");
            int publicationYear = scanner.nextInt();

            // Create a new Book object and add it to the array
            book[bookCount++] = new Book(ISBN, title, type, publisher, pages, price, publicationYear);
            System.out.println("Book added successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format. Please enter a valid input.");
            scanner.nextLine(); // Clear the input buffer
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean isISBNExists(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (book[i].getISBN().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }

    private void removeBook() {
        if (bookCount == 0) {
            System.out.println("\nError: No books entered yet.\n");
            return;
        }

        System.out.print("Enter ISBN of the book to remove: ");
        String ISBN = scanner.nextLine();

        int index = findBookIndex(ISBN);
        if (index == -1) {
            System.out.println("Book with ISBN " + ISBN + " not found.");
            return;
        }

        // Shift elements to fill the gap
        for (int i = index; i < bookCount - 1; i++) {
            book[i] = book[i + 1];
        }
        bookCount--;

        System.out.println("Book removed successfully.");
    }

    private int findBookIndex(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (book[i].getISBN().equals(ISBN)) {
                return i;
            }
        }
        return -1; // Not found
    }

    private void checkoutBook() {
        if (bookCount == 0) {
            System.out.println("\nError: No books entered yet.\n");
            return;
        }

        try {
            System.out.print("Enter ISBN of the book to check out: ");
            String ISBN = scanner.nextLine();

            int index = findBookIndex(ISBN);
            if (index == -1) {
                System.out.println("Book with ISBN " + ISBN + " not found.");
                return;
            }

            if (book[index].getStatus() == 1) {
                System.out.println("Book is already checked out.");
                return;
            }

            System.out.print("Enter name of the person checking out: ");
            String checkedOutBy = scanner.nextLine();

            Date dueDate = new Date(); // Create a new Date object
            System.out.print("Enter due date (Year Month Day): ");
            dueDate.nYear = scanner.nextInt();
            dueDate.nMonth = scanner.nextInt();
            dueDate.nDay = scanner.nextInt();

            book[index].setStatus(1); // Set status to checked-out
            book[index].setCheckedOutBy(checkedOutBy);
            book[index].setDueDate(dueDate);

            System.out.println("Book checked out successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format for due date. Please enter a valid input.");
            scanner.nextLine(); // Clear the input buffer
        }
    }

    private void checkinBook() {
        if (bookCount == 0) {
            System.out.println("\nError: No books entered yet.\n" + "Please select choice 1(add new book)");
            return;
        }

        System.out.print("Enter ISBN of the book to check in: ");
        String ISBN = scanner.nextLine();

        int index = findBookIndex(ISBN);
        if (index == -1) {
            System.out.println("Book with ISBN " + ISBN + " not found.");
            return;
        }

        if (book[index].getStatus() == 0) {
            System.out.println("Book is already checked in.");
            return;
        }

        book[index].setStatus(0); // Set status to available
        book[index].setCheckedOutBy("");
        book[index].setDueDate(null);

        System.out.println("Book checked in successfully.");
    }

    private void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("\nError: No books entered yet.\n" + "Please select choice 1(add new book)");
            return;
        }

        try {
            System.out.println("\nAll Book Details:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println("ISBN: " + book[i].getISBN());
                System.out.println("Title: " + book[i].getTitle());
                System.out.println("Type: " + book[i].getType());
                System.out.println("Publisher: " + book[i].getPublisher());
                System.out.println("Pages: " + book[i].getPages());
                System.out.println("Price: " + book[i].getPrice());
                System.out.println("Publication Year: " + book[i].getPublicationYear());
                System.out.println("Status: " + (book[i].getStatus() == 0 ? "Available" : "Checked-out"));
                if (book[i].getStatus() == 1) {
                    System.out.println("Checked Out By: " + book[i].getCheckedOutBy());
                    System.out.println("Due Date: " + book[i].getDueDate().nYear + "-" + book[i].getDueDate().nMonth + "-" + book[i].getDueDate().nDay);
                }
                System.out.println();
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private void displayAvailableBooks() {
        if (bookCount == 0) {
            System.out.println("\nError: No books entered yet.\n" + "Please select choice 1(add new book)");
            return;
        }

        try {
            System.out.println("\nAvailable Book Details:");
            for (int i = 0; i < bookCount; i++) {
                if (book[i].getStatus() == 0) {
                    System.out.println("ISBN: " + book[i].getISBN());
                    System.out.println("Title: " + book[i].getTitle());
                    System.out.println("Type: " + book[i].getType());
                    System.out.println("Publisher: " + book[i].getPublisher());
                    System.out.println("Pages: " + book[i].getPages());
                    System.out.println("Price: " + book[i].getPrice());
                    System.out.println("Publication Year: " + book[i].getPublicationYear());
                    System.out.println();
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private void displayCheckedOutBooks() {
        if (bookCount == 0) {
            System.out.println("\nError: No books entered yet.\n" + "Please select choice 1(add new book)");
            return;
        }

        try {
            System.out.println("\nChecked-out Book Details:\n");
            for (int i = 0; i < bookCount; i++) {
                if (book[i].getStatus() == 1) {
                    System.out.println("ISBN: " + book[i].getISBN());
                    System.out.println("Title: " + book[i].getTitle());
                    System.out.println("Type: " + book[i].getType());
                    System.out.println("Publisher: " + book[i].getPublisher());
                    System.out.println("Pages: " + book[i].getPages());
                    System.out.println("Price: " + book[i].getPrice());
                    System.out.println("Publication Year: " + book[i].getPublicationYear());
                    System.out.println("Checked Out By: " + book[i].getCheckedOutBy());
                    System.out.println("Due Date: " + book[i].getDueDate().nYear + "-" + book[i].getDueDate().nMonth + "-" + book[i].getDueDate().nDay);
                    System.out.println();
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
