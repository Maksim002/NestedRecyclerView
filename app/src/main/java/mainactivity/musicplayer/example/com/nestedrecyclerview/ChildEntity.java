package mainactivity.musicplayer.example.com.nestedrecyclerview;

public class ChildEntity {
    private String url;
    private String title;

    public ChildEntity(String title, String url) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
