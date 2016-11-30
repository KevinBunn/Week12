public class YouTubeAdapter implements SocialMediaEntry {
    YouTubeVideo youTubeObject;
    
    YouTubeAdapter() {
        youTubeObject = new YouTubeVideo();
    }
    
    YouTubeAdapter(String author, String title, String description) {
        youTubeObject = new YouTubeVideo(author, title, description);
    }
    
    public String getUser()     { return youTubeObject.getAuthor(); }
    public String getPostText() { return youTubeObject.getTitle() + " " + youTubeObject.getDescription(); }
  /*
    /\/\
    (*.*)
    ( ><)
     " "
  */
}