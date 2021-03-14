package ex5_Buffer;

import java.io.*;
import java.nio.Buffer;

public class UnicodeFileIO {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("./files/TestUTF8.txt");
            Writer out = new OutputStreamWriter(fos, "UTF8"); // Output file
            BufferedWriter bw = new BufferedWriter(out);
            // UTF-8 encoded
            bw.write("Hello, Việt Nam");
            bw.close();

            // Character-based (or text-based) input
            FileInputStream fis = new FileInputStream("./files/TestUTF8.txt");
            Reader in = new InputStreamReader(fis, "UTF8");
            BufferedReader br = new BufferedReader(in);
            int charRead;
            int charCount = 0;
            while ((charRead = br.read()) != -1) {
                charCount++;
                System.out.printf("%c(%02X) ", (char) charRead, charRead);
            }
            br.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
