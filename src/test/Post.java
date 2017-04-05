package test;

/**
 * Created by Yevgeniy on 02.04.2017.
 */
public class Post {
    private int id;
    private String txt;

    public Post(int id, String txt) {
        this.id = id;
        this.txt = txt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", txt='" + txt + '\'' +
                '}';
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
