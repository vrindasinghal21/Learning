package createServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class usinghttp extends HttpServlet{

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        System.out.print("Processing....");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h3>this server is created by usinghttp</h3>");
        //include output of home.html
        RequestDispatcher rd=request.getRequestDispatcher("form.html");
        //include
        rd.include(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        System.out.print("Processing....");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h3>this server is created by usinghttp</h3>");
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        String gender=request.getParameter("gender");
        String course=request.getParameter("course");
        String condition=request.getParameter("condition");
        
        if (condition==null){
            out.println("<h2>You haven't accepted Terms and Conditions....</h2>");
            //include output of home.html
            RequestDispatcher rd=request.getRequestDispatcher("home.html");
            //include
            rd.include(request,response);
        }
        else{
            out.println("<h2> Name: "+ name+"<h2>");
            out.println("<h2> Email: "+ email +"<h2>");
            out.println("<h2> Gender: "+ gender+"<h2>");
            out.println("<h2> Cousre: "+ course+"<h2>");
        }
    }   
}