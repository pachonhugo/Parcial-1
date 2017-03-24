/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.corte1;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class ParcialCorte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Grafica miGrafica=new Grafica();
        GraficaTrigonometrica miTrigonometrica=new GraficaTrigonometrica();
        System.out.println("Para calculadora Aritmetica selecciona 1, para calculadora con funciones Trigonometricas Selecciona  2");
        Scanner miescaner=new Scanner(System.in);
        opcion=miescaner.nextInt();
        
            switch(opcion){
              case 1: miGrafica.setVisible(true);
             break;
              case 2: miTrigonometrica.setVisible(true);
              break;
            }
               // TODO code application logic here
    }
    
}
