/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw2;


/**
 *
 * @author valera
 */
public class Autoservise {
    
    public void modify(Car car1){
        String newmarka = car1.getmarka();
        newmarka = newmarka.toUpperCase();
        String newMarka = newmarka.replaceAll("A", "O");
        String finMarka = newMarka.replaceAll("I", "E");
        car1.setmarka(finMarka);
    }
}
