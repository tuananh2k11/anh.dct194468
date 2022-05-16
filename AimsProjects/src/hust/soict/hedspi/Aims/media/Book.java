package hust.soict.hedspi.Aims.media;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by FaceNet Tuan Anh at May 16, 2022
 */
public class Book extends Media{

    private List<String> authors = new ArrayList<String>();
    
    public Book(){
        
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    
    public void addAuthor(String author){
        if (!authors.contains(author)) {
            authors.add(author);
        }
    }
    
    public void addAuthor(String[] author){
        for (String string : author) {
            if(!authors.contains(string.trim())) authors.add(string.trim());
        }
    }
    public void removeAuthor(String author){
        
    }
    
    
}
