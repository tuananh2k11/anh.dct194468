package hust.soict.hedspi.Aims;

import hust.soict.hedspi.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.Order.Order;

/**
 *
 * Created by FaceNet Tuan Anh at May 15, 2022
 */
public class DiskTest {
    public static void main(String[] args) {
        DigitalVideoDisc myVideoDisc = new DigitalVideoDisc();
        System.err.println(myVideoDisc.search("Harry Potter"));
        Order myOrder = new Order();
        DigitalVideoDisc luckyDisc = myOrder.getALuckyItem();
        System.err.println(luckyDisc.getTitle());
    }
}
