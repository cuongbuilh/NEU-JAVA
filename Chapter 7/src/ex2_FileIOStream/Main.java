package ex2_FileIOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("./files/source.txt");
        FileOutputStream out = new FileOutputStream("./files/destination.txt");
        int c;
        while((c = in.read()) != -1){
            out.write(c);
        }

        if(in != null){
            in.close();
        }

        if(out != null){
            out.close();
        }
    }
}
