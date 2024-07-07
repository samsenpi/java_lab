
interface Media {
    void display();
}

class PrintMedia implements Media {
    protected String title;

    public PrintMedia() {
        this.title = "";
    }

    public PrintMedia(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
    }
}

class SocialMedia implements Media {
    protected String title;

    public SocialMedia() {
        this.title = "";
    }

    public SocialMedia(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
    }
}

class Book extends PrintMedia {
    private String name;
    private String ISBN;

    public Book() {
        super();
        this.name = "";
        this.ISBN = "";
    }

    public Book(String name, String ISBN, String title) {
        super(title);
        this.name = name;
        this.ISBN = ISBN;
    }

    // Getters and Setters
    //...

    @Override
    public void display() {
        System.out.println("Book - Name: " + name + ", ISBN: " + ISBN + ", Title: " + title);
    }
}

class Magazine extends PrintMedia {
    private String month;
    private int year;

    public Magazine() {
        super();
        this.month = "";
        this.year = 0;
    }

    public Magazine(String month, int year, String title) {
        super(title);
        this.month = month;
        this.year = year;
    }

    // Getters and Setters
    //...

    @Override
    public void display() {
        System.out.println("Magazine - Month: " + month + ", Year: " + year + ", Title: " + title);
    }
}

class Facebook extends SocialMedia {
    private String name;
    private String likes;

    public Facebook() {
        super();
        this.name = "";
        this.likes = "";
    }

    public Facebook(String name, String likes, String title) {
        super(title);
        this.name = name;
        this.likes = likes;
    }

    // Getters and Setters
    //...

    @Override
    public void display() {
        System.out.println("Facebook - Name: " + name + ", Likes: " + likes + ", Title: " + title);
    }
}

public class Driver2 {
    public static void main(String[] args) {
        Media[] mediaArray = new Media[10];

        // Filling the array with different media types
        mediaArray[0] = new Book("Java Programming", "978-0321349606", "The Java Language Specification");
        mediaArray[1] = new Magazine("February", 2024, "Tech Today");
        mediaArray[2] = new Facebook("John Doe", "1000", "New Features Announcement");
        mediaArray[3] = new Book("Data Structures", "978-0134611037", "Algorithms");
        mediaArray[4] = new Magazine("March", 2024, "Science Weekly");
        mediaArray[5] = new Facebook("Jane Smith", "500", "Community Update");
        mediaArray[6] = new Book("Design Patterns", "978-0201633610", "Gang of Four");
        mediaArray[7] = new Magazine("April", 2024, "Nature");
        mediaArray[8] = new Facebook("Robert Johnson", "750", "Product Launch");
        mediaArray[9] = new Book("Clean Code", "978-0132350884", "A Handbook of Agile Software Craftsmanship");

        // Displaying information using polymorphism
        for (Media media : mediaArray) {
            media.display();
        }
    }
}