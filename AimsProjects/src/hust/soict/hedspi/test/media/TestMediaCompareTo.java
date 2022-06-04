package hust.soict.hedspi.test.media;

import hust.soict.hedspi.Aims.media.Book;
import hust.soict.hedspi.Aims.media.CompactDisc;
import hust.soict.hedspi.Aims.media.DigitalVideoDisc;
import hust.soict.hedspi.Aims.media.Media;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * Created by Tuan Anh at May 30, 2022
 */
public class TestMediaCompareTo {
    
    private void printCollection(Collection<Media> collection){
        Iterator<Media> itr= collection.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
    public static void main(String[] args) {
        TestMediaCompareTo test = new TestMediaCompareTo();
        Collection<Media> collection = new ArrayList<>();
        CompactDisc cpDisc = new CompactDisc(1, "Artist", "Director1", "Compact", "Compact", 12);
        DigitalVideoDisc dtDisc = new DigitalVideoDisc(3, 12, "Director2", "Digital", "Digital", 10);
        DigitalVideoDisc dtDisc1 = new DigitalVideoDisc(4, 10, "Director2", "Digital", "Digital", 9);
        Book book = new Book(2, "Book", "Book", 5);
        System.out.println("Initial Array:");
        collection.add(book);
        collection.add(cpDisc);
        collection.add(dtDisc);
        collection.add(dtDisc1);
        test.printCollection(collection);
        Collections.sort((List<Media>) collection);
        System.out.println("Sorted Array:");
        test.printCollection(collection);
    }
}
