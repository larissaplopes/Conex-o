/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author laris_000
 */
public class Server1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) throws IOException {
      // TODO code application logic here
      ServerSocket s = new ServerSocket(4444);
      
      while(true){
         Socket ns = s.accept();
         /* Marcacao no in. Possivel palavra reservada? */
         DataInputStream in = new DataInputStream(ns.getInputStream());
         DataOutputStream out = new DataOutputStream(ns.getOutputStream());

         while(true){
            Calculadora comando = new Calculadora(in.readUTF());
   //         String fromClient = in.readUTF();
            out.writeUTF(comando.Calcula());

            if(comando.equals("Bye") || comando.equals("BYE") || comando.equals("bye")){
               break;
            }

         }//while(true)

         in.close();
         out.close();
         ns.close();

      }
      
     // s.close();
   }
   
}
