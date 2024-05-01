package Project;

import java.util.InputMismatchException;
import java.util.Scanner;

class Date {
    int year;
    int month;
    int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

public class LibraryManager {
    private static final int MAX_BOOKS = 100;
    private Book[] books = new Book[MAX_BOOKS];
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
                throw new RuntimeException("\nCannot add more books. Library is full.\n");
            }

            System.out.println("\nEnter book details");
            System.out.print("Has an ISBN (10 digits): e.g. 1023456789\t\t\t  ");
            String ISBN = scanner.nextLine();

            // Check if the ISBN has exactly 10 digits
            if (ISBN.length() != 10) {
                throw new IllegalArgumentException("\nISBN must have exactly 10 digits.\n");
            }

            // Check if the ISBN already exists
            if (isISBNExists(ISBN)) {
                throw new RuntimeException("\nBook with this ISBN already exists in the library.\n");
            }

            System.out.print("Has title (string): e.g. Java Programming\t\t\t  ");
            String title = scanner.nextLine();
            System.out.print("Has a Type (string): e.g. textbook, magazine, journal etc\t  ");
            String type = scanner.nextLine();
            System.out.print("Has a Publisher (string): e.g., TAMUC\t\t\t\t  ");
            String publisher = scanner.nextLine();
            System.out.print("Has Page information (how many pages) (integer): e.g., 506\t  ");
            int pages = scanner.nextInt();
            System.out.print("Has Price (float): e.g., 20.00\t\t\t\t\t  ");
            float price = scanner.nextFloat();
            System.out.print("Has Publication Year (integer): e.g., 2013\t\t\t  ");
            int publicationYear = scanner.nextInt();

            // Create a new Book object and add it to the array
            books[bookCount++] = new Book(ISBN, title, type, publisher, pages, price, publicationYear);
            System.out.println("\nBook added successfully.\n");
        } catch (InputMismatchException e) {
            System.out.println("\nInvalid input format. Please enter a valid input.\n");
            scanner.nextLine(); // Clear the input buffer
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean isISBNExists(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }

    private void removeBook() {
        if (bookCount == 0) {
            System.out.println("\nError: No books entered yet.\n" + "Please select choice 1 (add new book)\n");
            return;
        }

        System.out.print("Enter ISBN of the book to remove:\t\t\t\t   ");
        String ISBN = scanner.nextLine();

        int index = findBookIndex(ISBN);
        if (index == -1) {
            System.out.println("\nBook with ISBN " + ISBN + " not found.\n");
            return;
        }

        // Shift elements to fill the gap
        for (int i = index; i < bookCount - 1; i++) {
            books[i] = books[i + 1];
        }
        bookCount--;

        System.out.println("\nBook removed successfully.\n");
    }

    private int findBookIndex(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                return i;
            }
        }
        return -1; // Not found
    }

    private void checkoutBook() {
        if (bookCount == 0) {
            System.out.println("\nError: No books entered yet.\n" + "Please select choice 1 (add new book)\n");
            return;
        }

        try {
            System.out.print("Enter ISBN of the book to check out:\t\t\t\t   ");
            String ISBN = scanner.nextLine();

            int index = findBookIndex(ISBN);
            if (index == -1) {
                System.out.println("\nBook with ISBN " + ISBN + " not found.\n");
                return;
            }

            if (books[index].getStatus() == 1) {
                System.out.println("\nBook is already checked out.\n");
                return;
            }

            System.out.print("Enter name of the person checking out:\t\t\t\t   ");
            String checkedOutBy = scanner.nextLine();

            System.out.print("Enter due date (Year Month Day):\t\t\t\t   ");
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            Date dueDate = new Date(year, month, day);

            books[index].setStatus(1); // Set status to checked-out
            books[index].setCheckedOutBy(checkedOutBy);
            books[index].setDueDate(dueDate);

            System.out.println("\nBook checked out successfully.\n");
        } catch (InputMismatchException e) {
            System.out.println("\nInvalid input format for due date. Please enter a valid input.\n");
            scanner.nextLine(); // Clear the input buffer
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private void checkinBook() {
        if (bookCount == 0) {
            System.out.println("\nError: No books have been checked out yet.\n" + "Please select choice 1 (add new book)\n");
            return;
        }

        System.out.print("Enter ISBN of the book to check in:\t\t\t\t   ");
        String ISBN = scanner.nextLine();

        int index = findBookIndex(ISBN);
        if (index == -1) {
            System.out.println("\nBook with ISBN " + ISBN + " not found.\n");
            return;
        }

        if (books[index].getStatus() == 0) {
            System.out.println("\nBook is already checked in.\n");
            return;
        }

        books[index].setStatus(0); // Set status to available
        books[index].setCheckedOutBy("");
        books[index].setDueDate(null);

        System.out.println("\nBook checked in successfully.\n");
    }

    private void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("\nError: No books entered yet.\n" + "Please select choice 1 (add new book)\n");
            return;
        }

        System.out.println("\nAll Book Details:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("ISBN: " + books[i].getISBN());
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Type: " + books[i].getType());
            System.out.println("Publisher: " + books[i].getPublisher());
            System.out.println("Pages: " + books[i].getPages());
            System.out.println("Price: " + books[i].getPrice());
            System.out.println("Publication Year: " + books[i].getPublicationYear());
            System.out.println("Status: " + (books[i].getStatus() == 0 ? "Available" : "Checked-out"));
            if (books[i].getStatus() == 1) {
                System.out.println("Checked Out By: " + books[i].getCheckedOutBy());
                Date dueDate = books[i].getDueDate();
                System.out.println("Due Date: " + dueDate.year + "-" + dueDate.month + "-" + dueDate.day);
            }
            System.out.println();
        }
    }

    private void displayAvailableBooks() {
        boolean anyAvailable = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].getStatus() == 0) {
                anyAvailable = true;
                System.out.println("ISBN: " + books[i].getISBN());
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Type: " + books[i].getType());
                System.out.println("Publisher: " + books[i].getPublisher());
                System.out.println("Pages: " + books[i].getPages());
                System.out.println("Price: " + books[i].getPrice());
                System.out.println("Publication Year: " + books[i].getPublicationYear());
                System.out.println();
            }
        }

        if (!anyAvailable) {
            System.out.println("\nError: No books are currently available.\n");
        }
    }

    private void displayCheckedOutBooks() {
        if (bookCount == 0) {
            System.out.println("\nError: No books entered yet.\n" + "Please select choice 1 (add new book)\n");
            return;
        }

        boolean foundCheckedOutBook = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getStatus() == 1) {
                foundCheckedOutBook = true;
                System.out.println("ISBN: " + books[i].getISBN());
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Type: " + books[i].getType());
                System.out.println("Publisher: " + books[i].getPublisher());
                System.out.println("Pages: " + books[i].getPages());
                System.out.println("Price: " + books[i].getPrice());
                System.out.println("Publication Year: " + books[i].getPublicationYear());
                System.out.println("Checked Out By: " + books[i].getCheckedOutBy());
                Date dueDate = books[i].getDueDate();
                System.out.println("Due Date: " + dueDate.year + "-" + dueDate.month + "-" + dueDate.day);
                System.out.println();
            }
        }

        if (!foundCheckedOutBook) {
            System.out.println("\nNo books are currently checked out.\n");
        }
    }
}
