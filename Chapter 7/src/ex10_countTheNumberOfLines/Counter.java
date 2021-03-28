package ex10_countTheNumberOfLines;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Counter {
    public static void main(String[] args) {

        String input = "asdasd.txt object.dat TestUTF8.txt source.txt";

        StringTokenizer stok = new StringTokenizer(input," ");

        while(stok.hasMoreTokens()){
            File f= new File( "./files/"+stok.nextToken());
            System.out.println(f.getPath() + "\thas : "
                            + count(f) + " line(s)" );
        }


    }
    
    public static int count(File file){
        int line=0;

        if (!file.exists()){
            System.out.println(file.getPath() + " does not exist");
            return -1;
        }

        try {
            FileReader fr=new FileReader(file);
            BufferedReader fReader=new BufferedReader(fr);
            String s;
            while ( (s=fReader.readLine()) != null) {
                line++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(file.getPath() + " : something wrong");
            e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
        }

        return line;
    };
}
