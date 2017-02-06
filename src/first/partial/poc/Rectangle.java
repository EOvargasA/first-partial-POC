/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osiri
 */
public class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(){
        this.length = 1.0f;
        this.width = 1.0f;
    }
    
    public Rectangle(float length,float width) {
        this.length = length;
        this.width = width;
    }
    
    public float getLength (){
        return this.length;
    }
    
    public float getWidth (){
        return this.width;
    }
    
    public void setLength (float length){
        this.length = length;
    }
    
    public void setWidth (float width){
        this.width = width;
    }
    
    public double getArea (){
        return this.length*this.width;
    }
    
    public double getPerimeter(){
        return (this.length * 2) + (this.width * 2);
    }
    
    @Override
    public String toString (){
        return "Rectangle [length = "+this.length+", width = "+this.width+"]";
    }
}
