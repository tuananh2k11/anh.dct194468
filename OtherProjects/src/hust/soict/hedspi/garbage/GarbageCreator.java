package hust.soict.hedspi.garbage;

import java.io.FileInputStream;

/**
 *
 * Created by FaceNet Tuan Anh at May 16, 2022
 */
public class GarbageCreator {
    public static void main(String[] args) {
        FileInputStream fin = null;
        int ch;
        long start = System.currentTimeMillis();
        String s = "";
        try {
            fin = new FileInputStream(
            "C:\\Users\\Pc\\OneDrive\\Documents\\Java\\OOLT\\anh.dct194468\\OtherProjects\\src\\hust\\soict\\hedspi\\garbage\\sample-text-file.txt");
            while((ch = fin.read()) != -1)
                s += (char) ch;
            fin.close();          
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s);
        System.out.println(System.currentTimeMillis() - start);
        
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        try {
            fin = new FileInputStream(
            "C:\\Users\\Pc\\OneDrive\\Documents\\Java\\OOLT\\anh.dct194468\\OtherProjects\\src\\hust\\soict\\hedspi\\garbage\\sample-text-file.txt");
            while((ch = fin.read()) != -1)
                sb.append((char) ch);
            fin.close();          
        } catch (Exception e) {
            e.printStackTrace();
        }
        s = sb.toString();
        System.out.println(s);
        System.out.println(System.currentTimeMillis() - start);
    }
}
