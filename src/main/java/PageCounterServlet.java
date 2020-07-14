import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageCounterServlet", urlPatterns = "/counter")
public class PageCounterServlet extends HttpServlet {

    private int counter;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        counter++;
        PrintWriter out = response.getWriter();
        out.println("<h1>Total page hits: " + counter + "</h1>");
    }
}
