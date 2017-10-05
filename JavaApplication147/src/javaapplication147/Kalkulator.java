package javaapplication147;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Kalkulator extends Thread {
    Socket socket;
    public Kalkulator(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        super.run();  
        try {
            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(input)); 
            System.out.println("Server ocekuje obracanje klijenta"); 
            System.out.println("Klijent kaze: "); 
            System.out.println(br.readLine());
            output.write("Sta 'oces?\r\n".getBytes());
 
            String operacija = br.readLine();
            System.out.println("Klijent je odabrao");
            System.out.println(operacija);

            output.write("Unesi operande\r\n".getBytes());

            System.out.println("Operandi su:");

            String operandi = br.readLine();
            System.out.println(operandi);

            int op1 = Integer.parseInt(operandi.split(",")[0]);
            int op2 = Integer.parseInt(operandi.split(",")[1]);

            String rezultat = "";
            switch(operacija){
                case "+":
                    rezultat = String.valueOf(op1+op2);
                break;
                case "-":
                    rezultat = String.valueOf(op1-op2);
                break;
                case "*":
                    rezultat = String.valueOf(op1*op2);
                break;
                case "/":
                    rezultat = String.valueOf(op1/op2);
                break;
            }

            output.write((rezultat+"\r\n").getBytes());
        } catch (Exception ex){
            
        }
    }
    
}
