/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brasilsistemas.mysystem;

/**
 *
 * @author joanderson.melo
 */
public class Calculadora {
    
    public Calculadora(){      
    
    }
    
    String a, b;
    
    public float soma(String a, String b){
        
       Float valor1, valor2;
       
       valor1 = Float.parseFloat(a);
       valor2 = Float.parseFloat(b);
       
       return valor1 + valor2;
       
    }
    
    public float subtracao(String a, String b){
        
       Float valor1, valor2;
       
       valor1 = Float.parseFloat(a);
       valor2 = Float.parseFloat(b);
       
       return valor1 - valor2;
        
    }
    
    public float divisao(String a, String b){
        
       Float valor1, valor2;
       
       valor1 = Float.parseFloat(a);
       valor2 = Float.parseFloat(b);
       
       return valor1 / valor2;
        
    }
    
    public float multiplicacao(String a, String b){
        
       Float valor1, valor2;
       
       valor1 = Float.parseFloat(a);
       valor2 = Float.parseFloat(b);
       
       return valor1 * valor2;
        
    }
}
