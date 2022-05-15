package hust.soict.hedspi.garbage;

import java.time.Clock;
import java.util.Random;

/**
 *
 * Created by FaceNet Tuan Anh at May 16, 2022
 */
public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 655360; i++)
            s += r.nextInt(2);
        System.out.println(System.currentTimeMillis() - start);
        
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 655360; i++) 
            sb.append(r.nextInt(2));
        s = sb.toString();
        System.out.println(System.currentTimeMillis() - start);
        
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 655360; i++)
            sbf.append(r.nextInt(2));
        s = sbf.toString();
        System.out.println(System.currentTimeMillis() - start);
    }
}
