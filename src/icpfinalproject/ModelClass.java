/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpfinalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author jean72human
 */
public class ModelClass {
    
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/library?useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "dovonon2011MYSQL";
    
    Connection conn = null;
    PreparedStatement stmt = null; 
    ResultSet rs = null;
    
    public ModelClass() throws SQLException{
        System.out.println(DB_URL);
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println(conn);
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //closes the connexion
    public void close() throws SQLException{
        conn.close();
    }
    
    //function to insert books, only a librarian can insert books
    public boolean insertBook(int isbn, String author, String title, String description, String publisher){
        boolean inserted = false;
        
        try{
            String sql = "Insert into Books(isbn, author, title, descript, publisher) values (?,?,?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, isbn);
            stmt.setString(2, author);
            stmt.setString(3, title);
            stmt.setString(4, description);
            stmt.setString(5, publisher);

            stmt.executeUpdate();

            stmt.close();
            
            inserted = true;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Can't insert book");
            System.out.println(e);
        }
        
        return inserted;
    }
    
    
    //function to register a student
    public boolean registerStudent(String username, String password, String email, String first_name, String last_name, String major, int year){
        boolean registered = false;
        
        try{
            int id;
            //first insert the login credentials
            String sql1="Insert into Login(username, email, password, type) values (?,?,?,'student')";
            stmt = conn.prepareStatement(sql1);
            stmt.setString(1, username);
            stmt.setString(2, email);
            stmt.setString(3, password);
            
            stmt.executeUpdate();
            
            
           //gets the id for these credentials
            String sql2="select id from Login where username=?";
            stmt = conn.prepareStatement(sql2);
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            
            rs.next();
            id = rs.getInt("id");
            System.out.print(id);
            
            
            //creates a student that has his own id but is also linked to a set of credentials
            String sql3 = "Insert into Student(id, fname, lname, major, year) values(?,?,?,?,?)";
            stmt = conn.prepareStatement(sql3);
            stmt.setInt(1, id);
            stmt.setString(2, first_name);
            stmt.setString(3, last_name);
            stmt.setString(4, major);
            stmt.setInt(5, year);
            
            stmt.executeUpdate();
            
            stmt.close();
            
            registered = true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Can't register student");
            System.out.println(e);
        }
        
        
        return registered;
    }
    
    public boolean registerLecturer(String username, String password, String email, String first_name, String last_name, String department){
        boolean registered = false;
        
        try{
            int id;
            //first insert the login credentials
            String sql1="Insert into Login(username, email, password, type) values (?,?,?,'lecturer')";
            stmt = conn.prepareStatement(sql1);
            stmt.setString(1, username);
            stmt.setString(2, email);
            stmt.setString(3, password);
            
            stmt.executeUpdate();
            
            
           //gets the id for these credentials
            String sql2="select id from Login where username=?";
            stmt = conn.prepareStatement(sql2);
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            
            rs.next();
            id = rs.getInt("id");
            System.out.print(id);
            
            
            //creates a student that has his own id but is also linked to a set of credentials
            String sql3 = "Insert into Lecturer(id, fname, lname, department) values(?,?,?,?)";
            stmt = conn.prepareStatement(sql3);
            stmt.setInt(1, id);
            stmt.setString(2, first_name);
            stmt.setString(3, last_name);
            stmt.setString(4, department);
            
            stmt.executeUpdate();
            
            stmt.close();
            
            registered = true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Can't register lecturer");
            System.out.println(e);
        }
        
        
        return registered;
    }
    
    public boolean registerLibrarian(String username, String password, String email, String first_name, String last_name, String position){
        boolean registered = false;
        
        try{
            int id;
            //first insert the login credentials
            String sql1="Insert into Login(username, email, password, type) values (?,?,?,'student')";
            stmt = conn.prepareStatement(sql1);
            stmt.setString(1, username);
            stmt.setString(2, email);
            stmt.setString(3, password);
            
            stmt.executeUpdate();
            
            
           //gets the id for these credentials
            String sql2="select id from Login where username=?";
            stmt = conn.prepareStatement(sql2);
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            
            rs.next();
            id = rs.getInt("id");
            System.out.print(id);
            
            
            //creates a student that has his own id but is also linked to a set of credentials
            String sql3 = "Insert into Librarian(id, fname, lname, position) values(?,?,?,?)";
            stmt = conn.prepareStatement(sql3);
            stmt.setInt(1, id);
            stmt.setString(2, first_name);
            stmt.setString(3, last_name);
            stmt.setString(4, position);
            
            stmt.executeUpdate();
            
            stmt.close();
            
            registered = true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Can't register librarian");
            System.out.println(e);
        }
        
        
        return registered;
    }
    
    public boolean updateBook(int id, int isbn, String author, String title, String description, String publisher){
        boolean updated = false;
        try{
            String sql = "UPDATE BOOKS SET isbn=?, author=?, title=?, descript=?, publisher=? where book_id=?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, isbn);
            stmt.setString(2, author);
            stmt.setString(3, title);
            stmt.setString(4, description);
            stmt.setString(5, publisher);
            stmt.setInt(6, id);

            stmt.executeUpdate();

            stmt.close();
            
            updated = true;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Can't update book");
            System.out.println(e);
        }
        
        return updated;
    }
    
    public boolean deleteBook(int id){
        boolean deleted = false;
        
        try{
            String sql = "DELETE FROM BOOKS WHERE book_id=?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
            
            deleted = true;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Can't delete book");
            System.out.println(e);
        }
        
        return deleted;
    }
    
    public ArrayList<String[]> getBooks(){
        ArrayList<String[]> toReturn = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM BOOKS";
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();
            
            while(rs.next()){    
                String[] a = {Integer.toString(rs.getInt("book_id")),  Integer.toString(rs.getInt("isbn")), rs.getString("author"), rs.getString("title"), rs.getString("descript"), rs.getString("publisher")};
                toReturn.add(a);
            }

            stmt.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Can't delete book");
            System.out.println(e);
        }
        
        return toReturn;
    }
    
    
    
    public boolean borrowBook(int id, int book_id){
        boolean borrowed = false;
        
        try{
            Calendar today = Calendar.getInstance();
            today.set(Calendar.HOUR_OF_DAY, 0);
            
            String sql = "Insert into borrow(id, bookid, borodate, returndate) values (?,?,?,?)";
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, id);
            stmt.setInt(2, book_id);
            stmt.setDate(3, new java.sql.Date(today.getTime().getTime()));
            
            today.add(today.DATE, 30);
            
            stmt.setDate(4, new java.sql.Date(today.getTime().getTime()));
            
            stmt.executeUpdate();
            
            

            stmt.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Can't borrow book");
            System.out.println(e);
        }
        
        return borrowed;
    }
    
    
    
    public static void main(String[] args) throws SQLException {
        
        ModelClass m = new ModelClass();
        
        ArrayList<String[]> books = m.getBooks();
        for (int i=0; i<books.size(); i++){
            for (int k=0;k<6;k++){
                System.out.print(books.get(i)[k] + " ");
            }
            System.out.println();
        }
        
        System.out.println(m.borrowBook(3, 4));
        //System.out.println(m.insertBook(37872, "Atikpozomar Ekpekpeko", "Love is sweet like pepper", "Intensive romance", "Bankou Ltd."));
        //System.out.println(m.updateBook(3, 39043, "Atikpozomar Ekpekpeko", "Love is bitter like tilapia", "Intensive romance", "Bankou Ltd."));
        //System.out.println(m.deleteBook(7));
        //System.out.println(m.registerStudent("jean72human", "password", "jean72human@sevetytwo.com", "The", "Human", "Computer Science", 2022));
        //System.out.println(m.registerLecturer("nana.sackey","password","nana.sackey@ahseis.edu.gh","Nana Ama","Sackey","Computer Science"));
        //System.out.println(m.registerLibrarian("sasha.ofori","password","sasha.ofori@ashesi.edu.gh","Sasha","Ofori","Assistant librarian"));
        m.close();
    }
}
