/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osiri
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee (int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public int getId (){
        return this.id;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public int getSalary() {
        return this.salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public int getAnnualSalary(){
        return this.salary * 12;
    }
    
    public int raiseSalary (int percent){
        percent = percent / 100;
        this.salary = this.salary + (this.salary * percent);
        return this.salary;
    }
    
    @Override
    public String toString (){
        return "Employee [id = "+this.id+", name = "+this.firstName+" "+this.lastName+", salary = "+this.salary+"]";
    }
}
