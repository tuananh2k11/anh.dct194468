package hust.soict.hedspi.Order;

import hust.soict.hedspi.DigitalVideoDisc.DigitalVideoDisc;
import java.util.Random;

/**
 *
 * Created by FaceNet Tuan Anh at May 15, 2022
 */
public class Order {
    public static final int MAX_NUMBER_ORDERED = 10;
    private int qtyOrdered;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    
    public int getQtyOrdered(){
        return 0;
    }
    public void setQtyOrdered(int qtyOrdered) {
        
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    
    }
    
    public float totalCost() {
        return 0;
    }
    
    public DigitalVideoDisc getALuckyItem(){
        int luckyItem = (int) (Math.random() * MAX_NUMBER_ORDERED) ;
        return itemOrdered[luckyItem];
    }
}
