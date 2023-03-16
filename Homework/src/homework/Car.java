/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author valera
 */
public class Car implements Comparable<Car>{
    private String marka;
    private int god;
    private String nomer;

    public Car(String marka, int god, String nomer) {
        this.marka = marka;
        this.god = god;
        this.nomer = nomer;
    }
    
    @Override
    public int compareTo(Car o){
        return nomer.compareTo(o.getnomer());
    }

    public String getmarka() {
        return marka;
    }
    
    public void setmarka(String marka){
        this.marka = marka;
    }

    public int getgod() {
        return god;
    }

    public String getnomer() {
        return nomer;
    }
    
}
