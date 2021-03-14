package ex3_DataIOStream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./files/WriteInt.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        int i = 100;
        dos.writeInt(i);
        dos.close();

        FileInputStream fin = new FileInputStream("./files/WriteInt.txt");
        DataInputStream din = new DataInputStream(fin);
        int d = din.readInt();
        System.out.println("the int number is: " + d);
        din.close();
    }
}
