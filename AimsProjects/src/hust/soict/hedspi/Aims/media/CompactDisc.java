package hust.soict.hedspi.Aims.media;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Tuan Anh at May 29, 2022
 */
public class CompactDisc extends Disc implements Playable{

    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    
    public String getArtist(){
        return this.artist;
    }

    public CompactDisc(String artist, String director, String title, String category, float cost) {
        super(0, director, title, category, cost);
        this.artist = artist;
    }

    
    public void addTrack(Track track){
        if(!tracks.contains(track)) tracks.add(track);
    }
    
    public void removeTrack(Track track){
        if(tracks.contains(track)) tracks.remove(track);
    }
    
    public int getLength(){
        int sum = 0;
        for (Track track : tracks) {
            sum += track.getLength();
        }
        return sum;
    }

    @Override
    public void play() {
        for (Track track : tracks) {
            track.play();
        }
    }
}
