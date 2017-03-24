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
    double angulo;
    double anguloingresado;
    
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
    
    double Seno(){
        double angulo = anguloingresado * Math.PI/180.0;
        return(Math.sin(angulo));
    }  
    
    double Coseno(){
        double angulo = anguloingresado * Math.PI/180.0;
        return(Math.cos(angulo));
    }    
    
    double Tangente(){
        double angulo = anguloingresado * Math.PI/180.0;
        if(angulo==Math.PI/2||angulo==Math.PI*3/2){
            return(0);
        }else{
        return(Math.tan(angulo));
        }
    }    
    
    double Cotangente(){
        double angulo = anguloingresado * Math.PI/180.0;
        if(angulo==0||angulo==Math.PI||angulo==Math.PI*2){
            return(0);
        }else{
        return(1/Math.tan(angulo));
        }
    }    
    
    double Secante(){
        double angulo = anguloingresado * Math.PI/180.0;
        if(angulo==Math.PI/2||angulo==Math.PI*3/2){
            return(0);
        }else{
        return(1/Math.cos(angulo));
        }
    } 
    
    double Cosecante(){
        double angulo = anguloingresado * Math.PI/180.0;
        if(angulo==0||angulo==Math.PI||angulo==Math.PI*2){
            return(0);
        }else{
        return(1/Math.sin(angulo));
        }
    }      
    
    
}
