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
public class MyCircle {
    private MyPoint center;
    private int radius;
    
    public MyCircle (){
        MyPoint a = new MyPoint (0,0);
        this.center = a;
        this.radius = 1;
    }
    
    public MyCircle (int x,int y,int radius){
        MyPoint a = new MyPoint (x,y);
        this.center = a;
        this.radius = radius;
    }
    
    public MyCircle (MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    
    public MyPoint getCenter (){
        return this.center;
    }
    
    public int getRadius (){
        return this.radius;
    }
    
    public int getCenterX (){
        return this.center.getX();
    }
    
    public int getCenterY (){
        return this.center.getY();
    }
    
    public int[] getCenterXY (){
        return this.center.getXY();
    }
    
    public void setRadius (int radius){
        this.radius = radius;
    }
    
    public void setCenter (MyPoint center){
        this.center = center;
    }
    
    public void setCenterX (int x){
        this.center.setX(x);
    }
    
    public void setCenterY (int y){
        this.center.setY(y);
    }
    
    public void setCenterXY (int x,int y){
        this.center.setXY(x,y);
    }
    
    @Override
    public String toString (){
        return "Circle [radius = "+this.radius+", center "+this.center.toString()+"]";
    }
    
    public double getArea (){
        return Math.PI * (this.radius * this.radius);
    }
    
    public double getCircunference (){
        return Math.PI * this.radius * 2;
    }
    
    public double distance (MyCircle another){
        return this.center.distance(another.getCenter());
    }
}
