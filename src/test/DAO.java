package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yevgeniy on 02.04.2017.
 */
public class DAO {
    static {
        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post(1, "hello"));
        posts.add(new Post(2, "everything"));
        posts.add(new Post(3, "burn"));
    }
    public static List<Post> getPosts(){
        return posts;
    }
    public static void deletePost(int id){
        for(Post p:posts){
            if (p.getId() == id){
                posts.remove(p);
            } else System.out.println("Совпадений не найдено");
        }
    }
}
