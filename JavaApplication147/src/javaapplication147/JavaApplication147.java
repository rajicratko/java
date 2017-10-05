package javaapplication147;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class JavaApplication147 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(100);
        
        while(true){
            System.out.println("Server is listening...");
            Socket socket = server.accept();
            new Kalkulator(socket).start();
        }
    }
}
