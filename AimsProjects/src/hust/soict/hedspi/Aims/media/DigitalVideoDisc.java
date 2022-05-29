package hust.soict.hedspi.Aims.media;

/**
 *
 * Created by TuanAnh at May 15, 2022
 */
public class DigitalVideoDisc extends Disc implements Playable{

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

    public DigitalVideoDisc(int length, String director, String title, String category, float cost) {
        super(length, director, title, category, cost);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
   }
