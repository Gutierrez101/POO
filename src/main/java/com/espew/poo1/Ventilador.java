/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espew.poo1;

/**
 *
 * @author USUARIO
 */
public class Ventilador {
   private boolean encendido;
    private String color;
    /** COnstructor*/
    
    public Ventilador(){
        encendido=false;
    }
    
    public Ventilador(String color){
        encendido=false;
        this.color=color;
    }
    public boolean isEncendido() {
        return encendido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    /*
    public void encender(){
        encendido=true;
        
    }
    
    public void apagar(){
        encendido=false;
    
    }
    */
    public void mostrarestado(){
        System.out.println("Ventilador Color" + color);
        if (encendido) {
            System.out.println("Ventilador encendido");
        }
        else{
            System.out.println("Ventilador apagado");
        }
    }
}
