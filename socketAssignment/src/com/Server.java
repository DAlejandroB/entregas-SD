package com;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        String[] names;
        names = new String[]{
                "Hugo 0", "Paco 1", "Luis 2","Donald 3", "Mickey 4"
        };
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Listening at port 5000");
            Socket socket = serverSocket.accept();
            DataInputStream dInput = new DataInputStream(socket.getInputStream());
            int i = dInput.readInt();
            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
            dOut.writeUTF(names[i]);
            serverSocket.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
	// write your code here
    }
}
