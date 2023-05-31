package com.patika;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> books= new TreeSet<>();

        Book b1=new Book("It",500,"Stephen King","1986");
        Book b2= new Book("Fairy Tale",300,"Stephen King","2022");
        Book b3= new Book("The Shining",450,"Stephen King","2010");
        Book b4= new Book("Angels & Demons",480,"Dan Brown","2010");
        Book b5= new Book("The Lost Symbol",527,"Dan Brown","2009");


        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        for (Book b: books){
            System.out.println("Book Title: "+ b.getName()+" | "+
                                "Page Number: "+ b.getPageNumber()+" | "+
                                    "Author: "+ b.getAuthor()+" | "+
                                        "Publish Year: "+ b.getPublishDate());
        }

    }
}
