package ex8_pipedRW;

import java.io.IOException;
import java.io.PipedReader;

public class pReader extends  Thread{
    PipedReader reader;

    pReader(PipedReader reader){
        this.reader=reader;
    }

    @Override
    public void run() {
        try {
            while (true) {
                sleep(100);
                if (reader.ready())
                    System.out.print((char) reader.read());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
