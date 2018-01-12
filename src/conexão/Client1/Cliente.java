/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexão.Client1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author laris_000
 */
public class Cliente {
      private Socket s;
      private DataInputStream in;
      private DataOutputStream out;
      private Scanner inLine;
      
      public static void ClienteS() throws IOException{
         Socket s = new Socket("127.0.0.1", 4444);
         DataInputStream in = new DataInputStream(s.getInputStream());
         DataOutputStream out = new DataOutputStream(s.getOutputStream());
         Scanner inLine = new Scanner(System.in);
         while(true){
         /* verificar esta linha */
           String fromUser = inLine.nextLine();
           out.writeUTF(fromUser);
           System.out.println(in.readUTF());
         
            if(fromUser.equals("Bye") || fromUser.equals("BYE") || fromUser.equals("bye")){
               break;
            }
         }//while(true)
      
         in.close();
         out.close();
         s.close();
      }
}
