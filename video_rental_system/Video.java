public class Video  {
 
    private int type; // 0 - Regular, 1 - Kids, 2 - New Release
    private String title;
    
    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}