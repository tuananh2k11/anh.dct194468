package hust.soict.hedspi.Aims.Order;

import hust.soict.hedspi.Aims.media.DigitalVideoDisc;
import hust.soict.hedspi.Aims.media.Media;

import javax.naming.LimitExceededException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * Created by FaceNet Tuan Anh at May 15, 2022
 */
public class Order {
    public static final int MAX_NUMBER_ORDERED = 10;
    public static int nbOrders;
    private ArrayList<Media> itemOrdered = new ArrayList<Media>();
    
    public void addMedia(Media media){
        if(itemOrdered.contains(media)) return;
        itemOrdered.add(media);
    }
   
    public void removeMedia(Media media){
        if(itemOrdered.contains(media)) itemOrdered.remove(media);
    }
    
    public void displayItems(){
        for (Media media : itemOrdered) {
            System.out.println(media.getTitle());
        }
    }

    public Order() throws LimitExceededException {
        if(itemOrdered.size() < MAX_NUMBER_ORDERED) {
            nbOrders++;
        } else throw new LimitExceededException("Error: The number of orders has reached its limit");
    }
    public void removeMedia(int id){
        if(id > itemOrdered.size()) return;
        itemOrdered.remove(id - 1);
    }
    public float totalCost(){
        float sum = 0;
        for (Media media : itemOrdered) {
            sum += media.getCost();
        }
        return sum;
    }
    
}
