package hust.soict.hedspi.Aims;

import hust.soict.hedspi.Aims.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.Aims.Order.Order;

/**
 *
 * Created by FaceNet Tuan Anh at May 15, 2022
 */
public class DiskTest {
    public static void main(String[] args) {
        Order myOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",124,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation","John Musker",90,18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("HarryPotter","Animation","John Musker",90,15.99f);
        
        myOrder.addDigitalVideoDisc(new DigitalVideoDisc[]{
            dvd1,
            dvd2,
            dvd3,
            dvd4
        });
        DigitalVideoDisc myVideoDisc = new DigitalVideoDisc("Harry");
        System.out.println(myVideoDisc.search("Harry Potter"));
        DigitalVideoDisc luckyDisc = myOrder.getALuckyItem();
        System.out.println("The lucky item is: " + luckyDisc.getTitle());
    }
}
