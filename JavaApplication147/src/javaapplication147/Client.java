package javaapplication147;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        while(true) {
            Socket socket = new Socket("localhost",100);
            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(input));

            output.write("Dobar dan\r\n".getBytes());
            System.out.println("Server kaze:");
            System.out.println(br.readLine());

            Scanner scanner = new Scanner(System.in);
            System.out.println("Koju ces operaciju? (+,-,*,/)");

            String operacija = scanner.nextLine()+"\r\n";

            output.write(operacija.getBytes());

            System.out.println(br.readLine());

            System.out.println("Prvi operand:"); 
            String op1 = scanner.nextLine(); 
            System.out.println("Drugi operand:"); 
            String op2 = scanner.nextLine();
            String poruka = (op1.trim()+","+op2.trim())+"\r\n";
            output.write(poruka.getBytes());

            System.out.println("Rezultat je: ");
            System.out.println(br.readLine());
        }
    }
}
