/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.calculadoradepromedio.clscalculo;

import com.unab.calculadoradepromedio.Dominio.Notas;

/**
 *
 * @author Vladimir
 */
public class calculo {

    Notas calcpromedio = new Notas();

    public void calcularprm1(Notas calcpromedio) {
        Double lab1 = Double.parseDouble(calcpromedio.getLab1())*0.40 ;
        Double parcial1 = Double.parseDouble(calcpromedio.getParc1())*0.60 ;
        Double promedio = lab1 + parcial1;
        promedio /= 3;
        calcpromedio.setPromedio1(promedio);
    }

    public void calcularprm2(Notas calcpromedio) {
        Double lab2 = Double.parseDouble(calcpromedio.getLab2()) *0.40;
        Double parcial2 = Double.parseDouble(calcpromedio.getParc2()) *0.60;
        Double promedio = lab2 + parcial2;
        promedio /= 3;
        calcpromedio.setPromedio2(promedio);
    }

    public void calcularprm3(Notas calcpromedio) {
        Double lab3 = Double.parseDouble(calcpromedio.getLab3()) *0.40;
        Double parcial3 = Double.parseDouble(calcpromedio.getParc3()) *0.60;
        Double promedio = lab3 + parcial3;
        promedio /= 3;
        calcpromedio.setPromedio3(promedio);
    }
    Double mostrarprmf = 0.0;

    public void promedioF(Notas calcupromedio) {
        Double promediof = 0.0;
        promediof = calcupromedio.getPromedio1() + calcpromedio.getPromedio2() + calcupromedio.getPromedio3();
        calcpromedio.setNotaf(promediof);

        this.mostrarprmf = promediof;
    }

    public String PROMFM() {

        if (mostrarprmf >= 6) {
            return "Felicidades, Has Aprobado";
        } else {
            return "Lo sentimos, Has Reprobado";
        }
    }
}
