/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpfinalproject;

/**
 *
 * @author jean72human
 */
public class ModelTable {
    String book_id, isbn, Author, title, desciption, publisher;


    public ModelTable(String book_id, String isbn, String Author, String title, String desciption, String publisher) {
        this.book_id = book_id;
        this.isbn = isbn;
        this.Author = Author;
        this.title = title;
        this.desciption = desciption;
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return title;
    }

    public String getDesciption() {
        return desciption;
    }
    
    public String getId(){
        return this.book_id;
    }
}
