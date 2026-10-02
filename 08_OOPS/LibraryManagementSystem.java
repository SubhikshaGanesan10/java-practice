/*
 * Exercise: Library Management System
 *
 * File name: LibraryManagementSystem.java
 *
 * Create a LibraryItem class with:
 * - itemId
 * - title
 * - available
 * - borrowItem()
 * - returnItem()
 * - displayDetails()
 *
 * Create Book and DVD classes that inherit from LibraryItem.
 *
 * Book:
 * - Add author
 * - Override displayDetails()
 *
 * DVD:
 * - Add durationMinutes
 * - Override displayDetails()
 *
 * Requirements:
 * - Create 2 Books and 2 DVDs
 * - Store all items in a LibraryItem array
 * - Borrow and return some items
 * - Use one loop to display all items
 * - Use super.displayDetails() in child classes
 *
 * Borrow Rules:
 * - An item can only be borrowed if it is available
 * - An item cannot be borrowed if it is already borrowed
 *
 * Return Rules:
 * - An item can only be returned if it is currently borrowed
 * - An item cannot be returned if it is already available
 */

class LibraryItem{
    private int itemId;
    private String title;
    private boolean available;

    public LibraryItem(int itemId, String title, boolean available){
        this.itemId = itemId;
        this.title = title;
        this.available = available;
    }
    
    public void borrowItem(){
        if(available){
            available = false;
            System.out.println("Item successfully borrowed");
        }
        else{
            System.out.println("Item Unavailable");
        }
    }

    public void returnItem(){
        if(!available){
            available = true;
            System.out.println("Item returned successfully");
        }
        else{
            System.out.println("Item already returned");
        }
    }

    public void displayDetails(){
        System.out.println("Item ID: " + itemId);
        System.out.println("Book Title: " + title);
        System.out.println("Availability: " + available);
    }
}

class Book extends LibraryItem{
    private String author;

    public Book(int itemId, String title, boolean available, String author){
        super(itemId, title, available);
        this.author = author;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}

class DVD extends LibraryItem{
    private int durationMinutes;

    public DVD(int itemId, String title, boolean available, int durationMinutes){
        super(itemId, title, available);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Duration Minutes: " + durationMinutes);
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args) {
        LibraryItem[] libraryItems = new LibraryItem[4];
        libraryItems[0] = new Book(1, "Hunger Games", true, "James Fraketh");
        libraryItems[1] = new Book(2, "Harry Potter", true, "J.K Rowling");
        libraryItems[2] = new DVD(3, "Game of Thrones", false, 125);
        libraryItems[3] = new DVD(4, "Hamlet", true, 140);

        libraryItems[0].borrowItem();
        libraryItems[2].returnItem();
        libraryItems[1].borrowItem();
        libraryItems[0].borrowItem();
        libraryItems[2].returnItem();

        for(LibraryItem item : libraryItems){
            item.displayDetails();
        }
    }
}