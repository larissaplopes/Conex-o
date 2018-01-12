/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server1;

import static java.lang.System.exit;

/**
 *
 * @author laris_000
 */
public class Calculadora {
   private String[] token;
   private String comando;
   private int operando1,
               operando2;
   private final int OPERADOR = 0;
   
   public Calculadora(String comando)
   {
      this.comando = comando;
   }
   
   public String Calcula()
   {
      if(comando.equals("Bye") || comando.equals("BYE") || comando.equals("bye")){
         return "Bye";
      }
      
      token = comando.split(" ");
      if(token.length != 3){
         return "Comando invalido.";
      }
      
      switch(token[OPERADOR]){
         case "ADD":
         case "add":
            operando1 = Integer.parseInt(token[1]);
            operando2 = Integer.parseInt(token[2]);
            
            return "Resultado: " + (operando1 + operando2);
                        
         case "SUB":
         case "sub":
            operando1 = Integer.parseInt(token[1]);
            operando2 = Integer.parseInt(token[2]);
           
            return "Resultado: " + (operando1 - operando2);
            
         case "MUL":
         case "mul":
            operando1 = Integer.parseInt(token[1]);
            operando2 = Integer.parseInt(token[2]);
         
            return "Resultado: " + (operando1 * operando2);
        
         case "DIV":
         case "div":
            operando1 = Integer.parseInt(token[1]);
            operando2 = Integer.parseInt(token[2]);
            
            if(operando2 != 0){
               return "Resultado: " + (operando1 / operando2);
            }else{
               return "Operacao invalida.";
            }
            
         default:
            return "Comando invalido.";
         }
         
   }
      
   

}
