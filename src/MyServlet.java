import java.io.IOException;

/**
 * Created by Yevgeniy on 02.04.2017.
 */
@javax.servlet.annotation.WebServlet(name = "MyServlet", urlPatterns = "/test")
public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getOutputStream().write("THAT IS TEST TOO".getBytes());
    }
}
