package createServlet;
import javax.servlet.*;
import java.io.*;
import java.util.Date;
public class usingServlet implements Servlet{
    //Life cycle methods
    ServletConfig conf;

    /**
     *
     * @param conf
     */
    @Override
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("Object is creating.....");
        
    }

    /**
     *
     * @param request
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest request,ServletResponse resp)throws ServletException,IOException{
        System.out.println("Service is processing..........");
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h3>THIS IS OUTPUT FROM USING SERVLET INTERFACE....</h3 >");
        out.println(new Date().toString()+"<h1>Todays date is "+"</h1>");
    }
    @Override
    public void destroy(){
        System.out.println("Going to destroy........");
    }
    //Non Lifecycle methods

    /**
     *
     * @return
     */
    @Override
    public ServletConfig getServletConfig(){
        return this.conf;
    }

    /**
     *
     * @return
     */
    @Override
    public String getServletInfo(){
        return "This servlet is cretaed by Vrinda Singhal";
    }

    
}
