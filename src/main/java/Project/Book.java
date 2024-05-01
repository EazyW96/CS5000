package Project;

class Book {
    private String ISBN;
    private String title;
    private String type;
    private String publisher;
    private int pages;
    private float price;
    private int publicationYear;
    private int status; // 0 for available, 1 for checked-out
    private String checkedOutBy;
    private Date dueDate;

    public Book(String ISBN, String title, String type, String publisher, int pages, float price, int publicationYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.type = type;
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;
        this.publicationYear = publicationYear;
        this.status = 0; // Set default status to available
        this.checkedOutBy = "";
        this.dueDate = new Date(0, 0, 0); // Default due date
    }

    // Getters and Setters
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    public float getPrice() {
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getStatus() {
        return status;
    }

    public String getCheckedOutBy() {
        return checkedOutBy;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCheckedOutBy(String checkedOutBy) {
        this.checkedOutBy = checkedOutBy;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
