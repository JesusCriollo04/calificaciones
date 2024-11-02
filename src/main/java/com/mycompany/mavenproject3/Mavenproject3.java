package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Mavenproject3 {

    public static void main(String[] args) {
        double calificacion;
        Scanner teclado = new Scanner(System.in);
       
       System.out.print("Ingresar calificacion");
       calificacion = teclado.nextDouble();
       if (calificacion > 70 && calificacion <= 79){
           System.out.println("El alumno tiene A");
       }else if(calificacion >=60 && calificacion < 70){
           System.out.println("EL alumno tiene B");
       }
    }
}
