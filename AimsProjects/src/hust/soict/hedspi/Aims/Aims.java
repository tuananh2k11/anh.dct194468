package hust.soict.hedspi.Aims;

import hust.soict.hedspi.Aims.media.DigitalVideoDisc;
import hust.soict.hedspi.Aims.Order.Order;
import hust.soict.hedspi.Aims.media.Book;
import hust.soict.hedspi.Aims.media.CompactDisc;
import hust.soict.hedspi.Aims.media.Media;
import hust.soict.hedspi.Aims.media.Track;
import java.util.Scanner;

/**
 *
 * Created by FaceNet Tuan Anh at May 15, 2022
 */
public class Aims {
    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void main(String[] args) {
        int choice;
        Order myOrder = new Order();
        Scanner yourChoice = new Scanner(System.in);
        do {            
            showMenu();
            choice = Integer.parseInt(yourChoice.nextLine());
            switch (choice) {
                case 1:
                    myOrder = new Order();
                    break;
                case 2:
                    System.out.print("Title: ");
                    String title = yourChoice.nextLine();
                    System.out.print("Category: ");
                    String category = yourChoice.nextLine();
                    System.out.print("Cost: ");
                    float cost = Float.parseFloat(yourChoice.nextLine());
                    System.out.println("1. Book 2. DigitalVideoDisc 3.CompactDisc");
                    int type = Integer.parseInt(yourChoice.nextLine());
                    if(type == 1){
                        Book myBook = new Book(title, category, cost);
                        System.out.print("Author list: ");
                        String[] authorList = yourChoice.nextLine().trim().split(",");
                        myBook.addAuthor(authorList);
                        myOrder.addMedia(myBook);
                    }
                    else if(type == 2){
                        String director;
                        int length;
                        System.out.print("Director: ");
                        director = yourChoice.nextLine();
                        System.out.print("Length: ");
                        length = Integer.parseInt(yourChoice.nextLine());
                        DigitalVideoDisc dcp = new DigitalVideoDisc(length, director, title, category, cost);
                        myOrder.addMedia(dcp);
                        System.out.println("Play? 1. Yes 2. No");
                        if (Integer.parseInt(yourChoice.nextLine()) == 1) {
                            dcp.play();
                        }
                    }
                    else {
                        System.out.print("Artist: ");
                        String artist = yourChoice.nextLine();
                        CompactDisc cpd = new CompactDisc(artist, category, title, category, cost);
                        String trackTitle;
                        int trackLength;
                        int checkAddTrack;
                        do {                            
                            System.out.println("Add Track?\n1. Yes \n0. No ");
                            checkAddTrack  = Integer.parseInt(yourChoice.nextLine());
                            if(checkAddTrack == 1){
                                System.out.print("Title: ");
                                trackTitle = yourChoice.nextLine();
                                System.out.print("Length: ");
                                trackLength = Integer.parseInt(yourChoice.nextLine());
                                cpd.addTrack(new Track(trackTitle, trackLength));
                            }
                        } while(checkAddTrack == 1);
                        myOrder.addMedia(cpd);
                        System.out.println("Play? 1. Yes 2. No");
                        if (Integer.parseInt(yourChoice.nextLine()) == 1) {
                            cpd.play();
                        }
                    }
                    break;
                case 3:
                    int id = Integer.parseInt(yourChoice.nextLine());                  
                    myOrder.removeMedia(id);
                    break;
                case 4:
                    myOrder.displayItems();
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice != 0);
    }
}
