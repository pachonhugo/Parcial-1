/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.corte1;

/**
 *
 * @author estudiantes
 */
public class Calculadora {
    
    float numero1;
    float numero2;
    
    float sumar(){
        return(numero1+numero2);
    }
    
    float restar(){
        return(numero1-numero2);
    }    
  
    float multiplicar(){
        return(numero1*numero2);
    }    
    
    float dividir(){
        float division;
        if(numero2==0){
            division=0;
        }else{
            division=numero1/numero2;
        }        
        return(division);
    }    
    
    
}
