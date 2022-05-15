package hust.soict.hedspi.DigitalVideoDisc;

import java.nio.file.DirectoryStream;

/**
 *
 * Created by FaceNet Tuan Anh at May 15, 2022
 */
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public String getTitle(){
        return this.title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public void setTitle(String title){
        
    }
    public String getCategory(){
        return this.category;
    }
    public void setCategory(String category){
        
    }
    public boolean search(String title){
        String currentTitle = this.title;
        String titleBreak[] = title.trim().split(" ");
        for (String string : titleBreak) {
            if(currentTitle.contains(string)) return true;
        }
        return false;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }
}
