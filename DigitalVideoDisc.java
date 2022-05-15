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
        return null;
    }
    public void setTitle(String title){
        
    }
    public String getCategory(){
        return null;
    }
    public void setCategory(String category){
        
    }
    public boolean search(String title){
        String currentTitle = this.title;
        String titleBreak[] = title.trim().split(" ");
        for (String string : titleBreak) {
            if(currentTitle.indexOf(string) != -1) return true;
        }
        return false;
    }
}
