/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpfinalproject;

/**
 *extra model that is used for the TableView
 * 
 * @author jean72human
 */
public class ModelTable {
    String book_id, isbn, Author, title, desciption, publisher;

    /**
     *
     * @param book_id
     * @param isbn
     * @param Author
     * @param title
     * @param desciption
     * @param publisher
     */
    public ModelTable(String book_id, String isbn, String Author, String title, String desciption, String publisher) {
        this.book_id = book_id;
        this.isbn = isbn;
        this.Author = Author;
        this.title = title;
        this.desciption = desciption;
        this.publisher = publisher;
    }

    /**
     *
     * @return
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     *
     * @return
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     *
     * @return
     */
    public String getAuthor() {
        return Author;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return
     */
    public String getDesciption() {
        return desciption;
    }
    
    /**
     *
     * @return
     */
    public String getId(){
        return this.book_id;
    }
}
