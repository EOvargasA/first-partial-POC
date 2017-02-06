/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.partial.poc;

/**
 *
 * @author osiri
 */
public class Book {
    private String name;
    private Author [] authors;
    private double price;
    private int qty;
    
    public Book (String name, Author [] author, double price) {
        this.name = name;
        this.authors =author;
        this.price = price;
        this.qty = 0;
    }
    
     public Book (String name, Author [] author, double price, int qty) {
        this.name = name;
        this.authors =author;
        this.price = price;
        this.qty = qty;
    }
     
    public String getName (){
        return this.name;
    }
    
    public Author [] getAuthor (){
        return this.authors;
    }
    
    public double getPrice (){
        return this.price;
    }
    
    public int getQty (){
        return this.qty;
    }
    
    public void setPrice (double price){
        this.price = price;
    }
    
    public void setQty (int qty){
        this.qty = qty;
    }
    
    @Override
    public String toString (){
        Author a;
        a = this.authors [0];
        for (int d = 1; d == this.authors.length; d++){
            a = a+", "+this.authors [d].toString();
        }
        return "Book [name = "+this.name+", authors = {"+a+"}, price = "+this.price+", qty = "+this.qty;
    }
}
