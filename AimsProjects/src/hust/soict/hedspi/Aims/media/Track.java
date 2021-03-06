package hust.soict.hedspi.Aims.media;

import hust.soict.hedspi.Aims.PlayerException;

/**
 *
 * Created by Tuan Anh at May 29, 2022
 */
public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public Track() {
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void play() throws PlayerException{
        if (getLength() <= 0) throw new PlayerException();
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Track)) return false;
        Track tObj = (Track) obj;
        return tObj.getTitle().equals(this.title) && tObj.getLength() == this.length;
    }
    
    
    
}
