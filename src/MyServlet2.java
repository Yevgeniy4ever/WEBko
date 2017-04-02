import java.io.IOException;

/**
 * Created by Yevgeniy on 02.04.2017.
 */
@javax.servlet.annotation.WebServlet(name = "MyServlet2", urlPatterns = "/test2")
public class MyServlet2 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        response.getOutputStream().write(("ID is"+ id + "\n THAT IS NEW TEST2").getBytes());
    }
}
