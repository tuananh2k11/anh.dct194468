package hust.soict.hedspi.Aims.Order;

import hust.soict.hedspi.Aims.DigitalVideoDisc.DigitalVideoDisc;
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
        return this.qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered >= 10){
            System.out.println("The order is almost full");
            return;
        }
        itemOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc " + disc.getTitle() + " has been added");
        return;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(disc == null) return;
        for (int i = 0; i < qtyOrdered; i++) {
            if(disc.getTitle().equals(itemOrdered[i].getTitle())){
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j+1];
                }
                itemOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("The disc " + disc.getTitle() + " has been removed");
            }
        }
    }    
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        for (DigitalVideoDisc digitalVideoDisc : dvdList) {
            if(digitalVideoDisc == null) return;
            addDigitalVideoDisc(digitalVideoDisc);
        }
    }
    public DigitalVideoDisc[] getItemOrdered() {
        return itemOrdered;
    }

    public void setItemOrdered(DigitalVideoDisc[] itemOrdered) {
        this.itemOrdered = itemOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemOrdered[i].getCost();
        }
        return sum;
    }
    
    public DigitalVideoDisc getALuckyItem(){
        int luckyItem = (int) (Math.random() * qtyOrdered) ;
        return itemOrdered[luckyItem];
    }
}
