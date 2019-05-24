package lap7;

import javax.swing.*;
import java.util.*;


class Create 
{
    private int year;
    private int delivery;
    private double weight;
    private int code;
   
    public int getYear() {
        return year;
    }
    
    public int setYear (int y){
        this.year = y;
        return year;
    }

    public int getDelivery(){
        return delivery;
    }
    
    public int setDeliveryNumber (int delivery)
    {
        this.delivery= delivery;
        return delivery;
    }
    public double getWeight() {
        return weight;
    }
    public double setWeight (double weight)
    {
        this.weight = weight;
        return weight;
    }
    public int getDistanceCode()
    {
        return code;
    }
    public int setDistanceCode (int code)
    {
        this.code = code;
        return code;
    }   
    public double displayFees(int distance, double w) //distance = c
    {
        double fees = 0;

    if(distance == 1)
    {
            if(w < 5)
        {
            fees = 12;
        }
        else if((w < 20)&&(w > 5))
        {
            fees = 16.50;
        }
        else if(w > 20)
        {
            fees = 22;
        }
    }
    else if(distance == 2)
    {
        if(w < 5)
        {
            fees = 35;
        }
        else if(w >= 5)
        {
            fees = 47.95;
        }
    }
        return fees;
    }

    public void display(int year, int delivery, double weight, int code)
        {
        System.out.println("Year: " + year + '\n' 
            + "Delivery Number: " + delivery + '\n' 
            + "Weight of the package: " + weight + '\n'
            + "Delivery code: " + code);
        }
}