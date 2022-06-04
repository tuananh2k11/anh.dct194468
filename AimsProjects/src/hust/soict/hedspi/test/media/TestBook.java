package hust.soict.hedspi.test.media;

import hust.soict.hedspi.Aims.media.Book;

/**
 *
 * Created by Tuan Anh at Jun 4, 2022
 */
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("A,A, C ,B,F,  G  ,A, H");
        System.out.println(b1.toString());
        b1.setContent("B,B  ,C , G,   H, A");
        System.out.println(b1.toString());
    }
}
