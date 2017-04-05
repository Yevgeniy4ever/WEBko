package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yevgeniy on 02.04.2017.
 */
public class DAO {



    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=false", "root","1234");
    }

/*    static List<Post> posts;
    static {
        posts = new ArrayList<Post>();
        posts.add(new Post(1, "hello"));
        posts.add(new Post(2, "everything"));
        posts.add(new Post(3, "burn"));
    }*/



    public static List<Post> getPosts() throws SQLException, ClassNotFoundException{
            ArrayList<Post> posts;
        try(Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT ID, TXT FROM posts");
        /*ps.executeQuery();*/
            ResultSet rs = ps.executeQuery();) {

            posts = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String txt = rs.getString(2);
                posts.add(new Post(id, txt));
            }
            return posts;
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        System.out.println(getPosts());
    }

    public static void deletePost(int id) throws SQLException, ClassNotFoundException {
        try(Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM posts WHERE id=?");){
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        }

    public static void addPosts(String txt) throws SQLException, ClassNotFoundException {
        try(Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO posts (txt) VALUES (?)");
        ){
            ps.setString(1, txt);
            ps.executeUpdate();
        }
    }
}
