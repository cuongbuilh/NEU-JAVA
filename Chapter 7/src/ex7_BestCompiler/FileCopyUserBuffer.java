package ex7_BestCompiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;


public class FileCopyUserBuffer {
    public static void main(String[] args) throws IOException {
        int[] bufSizeKB = {1, 2, 4, 8, 16, 32, 64, 256, 1024};  // in KB
        Map details = new HashMap();
        for (int run = 0; run < bufSizeKB.length; run++)
        {
            int bufSize = bufSizeKB[run] * 1024;
            byte[] byteBuf = new byte[bufSize]; // 4K buffer
            //your code
            File fin = new File("./images/a.jpg");
            File fout = new File("./copyed.jpg");

            FileInputStream in = new FileInputStream(fin);
            FileOutputStream out = new FileOutputStream(fout);

            long startTime = System.nanoTime();
            int numBytesRead;
            while ((numBytesRead = in.read(byteBuf)) != -1) {
                out.write(byteBuf, 0, numBytesRead);
            }
            long elapsedTime = System.nanoTime() - startTime;
            details.put(bufSizeKB[run],elapsedTime);
            System.out.println("bufSize: " + bufSizeKB[run] + "KB "+ " Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        }

        // find the best time
        long minTime = (long) Collections.min(details.values());
        for(int i:bufSizeKB){
            if((long)details.get(i) == minTime){
                System.out.println("the best bufSize is: "+ i +"KB");
            }
        }
    }
}
