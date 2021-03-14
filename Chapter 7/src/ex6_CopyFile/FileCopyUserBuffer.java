package ex6_CopyFile;
import java.io.*;
public class FileCopyUserBuffer {
    public static void main(String[] args) {
        File fileIn;
        FileInputStream in = null;
        FileOutputStream out = null;
        long startTime, elapsedTime;  // for speed benchmarking

        try {
            fileIn = new File("./images/b.jpg");
            System.out.println("File size is " + fileIn.length() + " bytes");
            in = new FileInputStream(fileIn);
            out = new FileOutputStream("./images/c.jpg");
            startTime = System.nanoTime();
            byte[] byteBuf = new byte[4096];    // 4K buffer
            int numBytesRead;
            while ((numBytesRead = in.read(byteBuf)) != -1) {
                out.write(byteBuf, 0, numBytesRead);
            }
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {            // always close the streams
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException ex) { ex.printStackTrace(); }
        }
    }
}
