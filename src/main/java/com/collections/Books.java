package com.collections;
//import sun.jvm.hotspot.types.CIntegerField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Books {

    private String bookName;
    private String authorName;
    private String ISBNNumber;

    public Books(String bookName, String authorName, String ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;

    }
    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", ISBNNumber='" + ISBNNumber + '\'' +
                '}';
    }

    public static void main(String args[]) throws IOException {
        //public void addBooks() {
        List<Books> booksList = new ArrayList<Books>();
        Books book1 = new Books("Untouchable", "MULK RAJ ANAND", "10-109-290-99");
        Books book2 = new Books("The Guide", "R.K. NARAYAN", "10-00-290-99");
        Books book3 = new Books("The Sunset Club", "KHUSHWANT SINGH", "10-10-2990-99");
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        Iterator<Books> it = booksList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
         }

        HashMap<String,Books> booksMap = new HashMap<String, Books>();
        for(int i=0;i<booksList.size();i++) {
            booksMap.put(booksList.get(i).ISBNNumber,booksList.get(i) );
        }

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter ISBN code: ");
        String ISBN = reader.readLine();
        System.out.println("--------Fetching Data--------");
        System.out.println(booksMap.get(ISBN).toString());
    }

    }

