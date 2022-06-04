package hust.soict.hedspi.Aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * Created by FaceNet Tuan Anh at May 16, 2022
 */
public class Book extends Media{

    private List<String> authors = new ArrayList<String>();
    private String content;
    private List<String> contentTokens = new ArrayList<>();
    private TreeMap<String,Integer> wordFrequency = new TreeMap<String,Integer>();
    public Book(int id,String title, String category, float cost) {
        super(id,title, category, cost);
    }

    public Book(String content) {
        this.content = content;
        processContent();
    }

    public void setContent(String content) {
        this.content = content;
        processContent();
    }
    private void processContent(){
        contentTokens.clear();
        wordFrequency.clear();
        int tempCount;
        String[] tempStrings = content.split("\\s*,\\s*");
        for (String tempString : tempStrings) {
            contentTokens.add(tempString);
            if(wordFrequency.containsKey(tempString)) {
                tempCount = wordFrequency.get(tempString);
                wordFrequency.put(tempString,++tempCount);
            }
            else wordFrequency.put(tempString, 1);
        }
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            sb.append(key);
            sb.append(" : ");
            sb.append(value);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    
}
