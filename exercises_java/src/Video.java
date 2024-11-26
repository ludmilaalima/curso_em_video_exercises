public class Video implements VideoActions {
    private String title;
    private Rating rating;
    private int views;
    private int likes;
    private boolean isPlaying;


    public Video(String title, Rating rating, int views, int likes, boolean isPlaying){
        this.title = title;
        this.rating = rating;
        this.views = views;
        this.likes = likes;
        this.isPlaying = isPlaying;

    }

    public Video(String video){
        this.title = video;
        this.rating = Rating.REGULAR;
        this.views = 0;
        this.likes = 0;
        this.isPlaying = false; 
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isIsPlaying() {
        return isPlaying;
    }

    public void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }


    
    public enum Rating{
        PESSIMO, RUIM, REGULAR ,BOM, EXCELENTE;

        public String getName(){
            return this.name().toLowerCase();

        }}

    
    @Override
    public void play(){
        this.isPlaying = true;
    }

    @Override
    public void pause(){
        this.isPlaying = false;
    }

    @Override
    public void like(){
        this.likes += 1;
    }



    @Override
    public String toString(){
        return getTitle();


    }

    






}
