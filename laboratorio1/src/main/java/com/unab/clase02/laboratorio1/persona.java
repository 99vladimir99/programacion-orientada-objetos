/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.laboratorio1;

/**
 *
 * @author Vladimir
 */
public class persona {

    private int edad;
    private String nombre;
    private char sexo;
    private double peso;
    private double altura;
    
    public persona() {

    }

     public persona(String nombre, int edad, char sexo) {
         this.nombre=nombre;
         this.edad=edad;
         this.sexo=sexo;
    }   
    public persona(String nombre, char sexo,int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }



    public String esMayor() {
        int Edad;
        Edad = this.edad;
        if (Edad < 18) {
            return "eres menor de edad";
        } else {
            return "eres mayor de edad";

        }






}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "persona{" + "edad=" + edad + ", nombre=" + nombre + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
public String toString1() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
}
public String toString2() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
}
