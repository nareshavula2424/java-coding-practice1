package org.example.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Book implements Comparable<Book>{
    private int bookId;
    private String bookName;
    private double bookCost;

    public Book(int bookId, String bookName, double bookCost) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCost = bookCost;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookCost() {
        return bookCost;
    }

    public void setBookCost(double bookCost) {
        this.bookCost = bookCost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookCost=" + bookCost +
                '}';
    }
    @Override
    public int compareTo(Book o) {
        if(bookId == o.bookId){
            return 0;
        }else if(bookId>o.bookId){
            return 1;

        } else{
            return -1;
        }

    }
}
public class ComparableInterfaceExample {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(10003,"CORE JAVA",750.0));
        list.add(new Book(10002,"ADVANCE JAVA",950.0));
        list.add(new Book(10001,"WEB DEVELOPMENT",850.0));
        list.add(new Book(10004,"FULL STACK DEVELOPMENT",1750.0));
        Collections.sort(list);
        System.out.println("sorting by book id");
        Iterator itr= list.iterator();
        while(itr.hasNext())
        {
            Book book = (Book)itr.next();
            System.out.println(book);
        }

    }
}
