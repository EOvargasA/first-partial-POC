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
public class Account {
    private String id;
    private String name;
    private int balance;
    
    public Account (String id,String name){
        this.id =id;
        this.name = name;
        this.balance = 0;
    }
    
    public Account (String id,String name,int balance){
        this.id =id;
        this.name = name;
        this.balance = balance;
    }
    
    public String getId (){
        return this.id;
    }
    
    public String getName (){
        return this.name;
    }
    
    public int getBalance (){
        return this.balance;
    }
    
    public int credit (int amount){
        this.balance = this.balance + amount;
        return this.balance;
    }
    
    public int debit (int amount){
        if (this.balance >= amount){
            this.balance = this.balance - amount;
        }else{
            System.out.println("La transferencia no ha sido posible");
        }
        return this.balance;
    }
    
    public int transferTo (Account another, int amount){
        if (this.balance >= amount){
            another.credit(amount);
            this.balance = this.balance - amount;
        }else{
            System.out.println("La transferencia no ha sido posible");
        }
        return this.balance;
    }
    
    @Override
    public String toString (){
        return "Account [id = "+this.id+", name = "+this.name+", balance = "+this.balance+"]";
    }
}
