package createServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author DELL
 */
public class usingGeneric extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("this is genericServlet");
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<h3>This servlet is created by using GenericServlet</h3>");
    }
        
}
