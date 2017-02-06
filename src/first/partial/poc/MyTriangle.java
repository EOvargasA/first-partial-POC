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
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle (int x1,int y1,int x2,int y2,int x3,int y3){
        this.v1 = new MyPoint (x1,y1);
        this.v2 = new MyPoint (x2,y2);
        this.v3 = new MyPoint (x3,y3);
    }
    
    public MyTriangle (MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    @Override
    public String toString (){
        return "MyTriangle [v1 = "+this.v1.toString()+", v2 = "+this.v2.toString()+", v3 = "+this.v3.toString()+"]";
    }
    
    public double getPerimeter (){
        return v1.distance(this.v2) + v2.distance (this.v3) + v3.distance(this.v1);
    }
}
