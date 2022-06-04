package hust.soict.hedspi.Aims.media;

/**
 *
 * Created by FaceNet Tuan Anh at May 16, 2022
 */
public abstract class Media implements Comparable<Object>{
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    public Media(int id,String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
     public int getId(){
         return id;
     }
    public Media(){
        
    }

    @Override
    public int compareTo(Object obj){
        if(obj == this) return 0;
        if(!(obj instanceof Media)) return -1;
        Media mObj = (Media) obj;
        if(mObj.getId() == this.id) return 0;
        if(mObj.getId() < this.id) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return String.format("Id:%d, Title:%s, Category:%s, Cost:$%.2f", this.id,this.title,this.category,this.cost);
    }
   
    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Media)) return false;
        Media mObj = (Media) obj;
        return mObj.getId() == this.id;
    }
    
}
