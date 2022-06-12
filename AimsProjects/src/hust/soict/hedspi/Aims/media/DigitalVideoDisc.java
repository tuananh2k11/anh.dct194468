package hust.soict.hedspi.Aims.media;

/**
 *
 * Created by TuanAnh at May 15, 2022
 */
public class DigitalVideoDisc extends Disc implements Playable{

    
    public void setDirector(String director){
        this.director = director;
    }
    
    public void setLength(int length){
        this.length = length;
    }

    public DigitalVideoDisc(int id,int length, String director,String title, String category, float cost) {
        super(id,length, director, title, category, cost);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public int compareTo(Object obj) {
        if(obj instanceof DigitalVideoDisc dObj){
            if(dObj.getCost() == this.cost) return 0;
            if(dObj.getCost() < this.cost) return 1;
            else return -1;
        }
        return super.compareTo(obj);
    }
   }