/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.laboratorio1;

import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre ");
        String nombre = sc.nextLine();
        System.out.println("Escribe la edad ");
        int Edad = sc.nextInt();
        System.out.println("Escriba su sexo ");
         char sexo = sc.next().charAt(0);
        System.out.println("Introduzca el peso ");
        double peso = sc.nextDouble();
        System.out.println("Introduzca la altura ");
        double altura = sc.nextDouble();

        persona person1 = new persona(nombre, sexo, Edad, peso, altura);
        System.out.println(person1.toString1());
        person1.setEdad(Edad);
        System.out.println(person1.esMayor());

        persona person2 = new persona(person1.getNombre(), person1.getEdad(), person1.getSexo());
        System.out.println(person2.toString2());
        System.out.println(person2.esMayor());

        persona person3 = new persona();
        person3.setNombre(nombre);
        person3.setEdad(Edad);
        person3.setSexo(sexo);
        person3.setPeso(peso);
        person3.setAltura(altura);
         System.out.println(person3.toString1());
        System.out.println(person3.esMayor());
    }
    
}


