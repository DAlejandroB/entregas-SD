package com;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost",5000);
            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
            dOut.writeInt(3);
            DataInputStream dInput = new DataInputStream(socket.getInputStream());
            System.out.println(dInput.readUTF());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
