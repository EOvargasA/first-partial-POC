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
public class MyPoint {
    private int x;
    private int y;
    
    public MyPoint (){
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint (int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX (){
        return this.x;
    }
    
    public int getY (){
        return this.y;
    }
    
    public int[] getXY (){
        int [] a = new int [2];
        this.x = a[0];
        this.y = a[1];
        return a;
    }
    
    public void setX (int x){
        this.x = x;
    }
    
    public void setY (int y){
        this.y = y;
    }
    
    public void setXY (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString (){
        return "("+this.x+","+this.y+")";
    }
    
    public double distance (int x, int y){
        double difx = x - this.x;
        double dify = y - this.y;
        return Math.sqrt((difx * difx) + (dify * dify));
    }
    
    public double distance (MyPoint another){
        double difx = another.getX() - this.x;
        double dify = another.getY() - this.y;
        return Math.sqrt((difx * difx) + (dify * dify));
    }
    
    public double distance (){
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }
}
