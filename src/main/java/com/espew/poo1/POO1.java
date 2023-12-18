/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espew.poo1;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class POO1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el color: ");
        String color= leer.next();
        
        Ventilador miventilador = new Ventilador(color);
        miventilador.setColor("naranja");
        //System.out.println(miventilador.getColor());
        
        miventilador.mostrarestado();
        System.out.println(miventilador.isEncendido());
        miventilador.setEncendido(true);
        miventilador.mostrarestado();
        System.out.println(miventilador.isEncendido());
        miventilador.setEncendido(false);
        miventilador.mostrarestado();
        System.out.println(miventilador.isEncendido());
        //miventilador.apagar();
    }
}
