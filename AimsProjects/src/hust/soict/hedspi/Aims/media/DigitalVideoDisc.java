package hust.soict.hedspi.Aims.media;

import java.nio.file.DirectoryStream;

/**
 *
 * Created by FaceNet Tuan Anh at May 15, 2022
 */
public class DigitalVideoDisc extends Media{
    private String director;
    private int length;

    public DigitalVideoDisc(String director, int length) {
        this.director = director;
        this.length = length;
    }
    
    public void setDirector(String director){
        this.director = director;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    public int getLength(){
        return this.length;
    }
    
    public String getDirector(){
        return this.director;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
}
