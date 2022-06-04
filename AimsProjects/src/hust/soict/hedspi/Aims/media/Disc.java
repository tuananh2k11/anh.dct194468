package hust.soict.hedspi.Aims.media;

/**
 *
 * Created by Tuan Anh at May 29, 2022
 */
public class Disc extends Media {
    protected int length;
    protected String director;

    public Disc(int id,int length, String director, String title, String category, float cost) {
        super(id,title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(int length, String director) {
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
    
    
}
