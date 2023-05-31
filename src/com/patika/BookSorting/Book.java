package com.patika.BookSorting;

public class Book implements Comparable<Book>{

    private String name;
    private int pageNumber;
    private String author;
    private String publishDate;

    public Book(String name, int pageNumber, String author, String  publishDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return getName().compareTo(o.getName());
    }



    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }


    public String getAuthor() {
        return author;
    }


    public String  getPublishDate() {
        return publishDate;
    }

}
