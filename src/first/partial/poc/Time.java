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
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time (int hour, int minute, int second){
        if (hour >= 0 || hour <= 23){
            this.hour = hour;
        }else{
            System.out.println("La hora introducida no es valida");
            System.out.println("Poniendo hora 0");
            this.hour = 0;
        }
        if (minute >= 0 || minute <= 59){
            this.minute = minute;
        }else{
            System.out.println("El minuto introducido no es valido");
            System.out.println("Poniendo minutos 0");
            this.minute = 0;
        }
        if (second >= 0 || second <= 59){
            this.second = second;
        }else{
            System.out.println("El segundo introducido no es valido");
            System.out.println("Poniendo segundos 0");
            this.second = 0;
        }
    }
    
    public int getHour (){
        return this.hour;
    }
    
    public int getMinute (){
        return this.minute;
    }
    
    public int getSecond (){
        return this.second;
    }
    
    public void setHour (int hour){
        if (hour >= 0 || hour <= 23){
            this.hour = hour;
        }else{
            System.out.println("La hora introducida no es valida");
            System.out.println("Poniendo hora 0");
            this.hour = 0;
        }
    }
    
    public void setMinute (int minute){
        if (minute >= 0 || minute <= 59){
            this.minute = minute;
        }else{
            System.out.println("El minuto introducido no es valido");
            System.out.println("Poniendo minutos 0");
            this.minute = 0;
        }
    }
    
    public void setSecond (int second){
        if (second >= 0 || second <= 59){
            this.second = second;
        }else{
            System.out.println("El segundo introducido no es valido");
            System.out.println("Poniendo segundos 0");
            this.second = 0;
        }
    }
    
    public void setTime (int hour, int minute, int second){
        if (hour >= 0 || hour <= 23){
            this.hour = hour;
        }else{
            System.out.println("La hora introducida no es valida");
            System.out.println("Poniendo hora 0");
            this.hour = 0;
        }
        if (minute >= 0 || minute <= 59){
            this.minute = minute;
        }else{
            System.out.println("El minuto introducido no es valido");
            System.out.println("Poniendo minutos 0");
            this.minute = 0;
        }
        if (second >= 0 || second <= 59){
            this.second = second;
        }else{
            System.out.println("El segundo introducido no es valido");
            System.out.println("Poniendo segundos 0");
            this.second = 0;
        }
    }
    
    @Override
    public String toString (){
        if (this.hour < 10){
            if (this.minute < 10){
                if (this.second < 10){
                    return "0"+this.hour+":0"+this.minute+":0"+this.second;
                }else{
                    return "0"+this.hour+":0"+this.minute+":"+this.second;
                }
            }else{
                if (this.second < 10){
                    return "0"+this.hour+":"+this.minute+":0"+this.second;
                }else{
                    return "0"+this.hour+":"+this.minute+":"+this.second;
                }
            }
        }else{
            if (this.minute < 10){
                if (this.second < 10){
                    return this.hour+":0"+this.minute+":0"+this.second;
                }else{
                    return this.hour+":0"+this.minute+":"+this.second;
                }
            }else{
                if (this.second < 10){
                    return this.hour+":"+this.minute+":0"+this.second;
                }else{
                    return this.hour+":"+this.minute+":"+this.second;
                }
            }
        }
    }
    
    public Time nextSeccond(){
        Time a = new Time (this.hour,this.minute,this.second + 1);
        if (a.second == 60){
            a.second = 0;
            a.minute = a.minute + 1;
        }
        if (a.minute == 60){
            a.minute = 0;
            a.hour = a.hour + 1;
        }
        if (a.hour == 24){
            a.hour = 0;
        }
        return a;
    }
    
    public Time previousSecond(){
        Time a = new Time (this.hour,this.minute,this.second + 1);
        if (a.second == 0){
            if (a.minute == 0){
                if (a.hour == 0){
                    a.hour = 23;
                    a.minute = 59;
                    a.second = 59;
                }else{
                    a.hour = a.hour - 1;
                    a.minute = 59;
                    a.second = 59;
                }
            }else{
                a.minute = a.minute - 1;
                a.second = 59;
            }
        }else{
            a.second = a.second - 1;
        }
        return a;
    }
}
