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
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date (int day, int month, int year){
        if (day >= 1 || day <= 31){
            this.day = day;
        } else {
            System.out.println("Dia no valido, fijando el dia en 1");
            this.day = 1;
        }
        if (month >= 1 || month <= 12){
            this.month = month;
        }else{
            System.out.println("Mes no valido, estableciendo el mes en 1");
            this.month = 1;
        }
        if (year >= 1900 || year <= 9999){
            this.year = year;
        }else{
            System.out.println("Año no valido, fijando el año en 1900");
            this.year = 1900;
        }
    }
    
    public int getDay (){
        return this.day;
    }
    
    public int getMonth (){
        return this.month;
    }
    
    public int getYear (){
        return this.year;
    }
    
    public void setDay (int day){
        if (day >= 1 || day <= 31){
            this.day = day;
        } else {
            System.out.println("Dia no valido, fijando el dia en 1");
            this.day = 1;
        }
    }
    
    public void setMonth (int month){
        if (month >= 1 || month <= 12){
            this.month = month;
        }else{
            System.out.println("Mes no valido, estableciendo el mes en 1");
            this.month = 1;
        }
    }
    
    public void setYear (int year){
        if (year >= 1900 || year <= 9999){
            this.year = year;
        }else{
            System.out.println("Año no valido, fijando el año en 1900");
            this.year = 1900;
        }
    }
    
    @Override
    public String toString (){
        if (this.day < 10){
            if (this.month <10){
                return "0"+this.day+"/0"+this.month+"/"+this.year;
            }else{
                return "0"+this.day+"/"+this.month+"/"+this.year;
            }
        }else{
            if (this.month <10){
                return this.day+"/0"+this.month+"/"+this.year;
            }else{
                return this.day+"/"+this.month+"/"+this.year;
            }
        } 
    }
}
