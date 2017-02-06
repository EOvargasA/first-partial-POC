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
public class Circle {
    private double radius;
    
    public Circle(){
        this.radius = 1.0;
    }
    
    public Circle (double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea (){
        return Math.PI * (this.radius * this.radius);
    }
    
    public double getCircunference (){
        return Math.PI * (this.radius * 2);
    }
    
    @Override
    public String toString (){
        return "Circle [radius = "+this.radius+"]";
    }
}
