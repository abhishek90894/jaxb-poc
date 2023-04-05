package com.spring.jaxb.jaxb.xmlTojava2;

import jakarta.xml.bind.JAXBException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class xmlToObject2 {

    private static final String BOOKSTORE_XML = "src\\main\\java\\com\\spring\\jaxb\\jaxb\\xmlTojava2\\book.xml";

    public static void main(String[] args) throws Exception {

        List< Book > bookList = new ArrayList< Book >();

        // create books
        Book book1 = new Book();
        book1.setIsbn("978-0134685991");
        book1.setName("Effective Java");
        book1.setAuthor("Joshua Bloch");
        book1.setPublisher("Amazon");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setIsbn("978-0596009205");
        book2.setName("Head First Java, 2nd Edition");
        book2.setAuthor("Kathy Sierra");
        book2.setPublisher("amazon");
        bookList.add(book2);

        // create bookstore, assigning book
        BookStore bookstore = new BookStore();
        bookstore.setName("Amazon Bookstore");
        bookstore.setLocation("Newyorkt");
        bookstore.setBookList(bookList);

        convertXMLToObject();
    }

    private static BookStore convertXMLToObject() throws  Exception {
        try {
            JAXBContext context = JAXBContext.newInstance(BookStore.class);
            Unmarshaller un = context.createUnmarshaller();
            BookStore bookstore = (BookStore) un.unmarshal(new File(BOOKSTORE_XML));
            List < Book > list = bookstore.getBookList();
            for (Book book: list) {
                System.out.println("Book: " + book.getName() + " from " + book.getAuthor());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

