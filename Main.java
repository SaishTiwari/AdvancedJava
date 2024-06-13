package com.tiwarisaish.advancedjava;

import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    private String title;
    private boolean borrowed;

    public LibraryItem(String title) {
        this.title = title;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        if (!borrowed) {
            borrowed = true;
        } else {
            throw new IllegalStateException("Item is already borrowed.");
        }
    }

    public void returnItem() {
        if (borrowed) {
            borrowed = false;
        } else {
            throw new IllegalStateException("Item is not borrowed.");
        }
    }

    public abstract String getItemType();
    public abstract int getBorrowDuration();
}

class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public int getBorrowDuration() {
        return 21;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }

    @Override
    public String getItemType() {
        return "Magazine";
    }

    @Override
    public int getBorrowDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(String title) {
        super(title);
    }

    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public int getBorrowDuration() {
        return 14;
    }
}

class Library {
    private List<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void listItems() {
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + " (" + item.getItemType() + ")");
        }
    }

    public LibraryItem getItemDetails(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void borrowItem(String title) {
        LibraryItem item = getItemDetails(title);
        if (item != null) {
            item.borrow();
        } else {
            throw new IllegalArgumentException("Item not found.");
        }
    }

    public void returnItem(String title) {
        LibraryItem item = getItemDetails(title);
        if (item != null) {
            item.returnItem();
        } else {
            throw new IllegalArgumentException("Item not found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addItem(new Book("The Great Gatsby"));
        library.addItem(new Magazine("Time"));
        library.addItem(new DVD("Inception"));

        library.listItems();

        library.borrowItem("The Great Gatsby");
        System.out.println("Borrowed: " + library.getItemDetails("The Great Gatsby").isBorrowed());

        library.returnItem("The Great Gatsby");
        System.out.println("Returned: " + library.getItemDetails("The Great Gatsby").isBorrowed());
    }
}
