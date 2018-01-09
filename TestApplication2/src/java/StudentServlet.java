
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
    {
        try
        {
                ServletContext ctx = req.getServletContext();
                String color = ctx.getInitParameter("color");
                
                PrintWriter pw = res.getWriter();
                pw.println("Hello from do get of Student and the color is : "+color);
        }
        catch(IOException ie)
        {
            System.out.println("Error in project");
            
        }
    }
    
    public void doPost(HttpServletRequest req, HttpServletResponse res)
    {
        try
        {
                ServletContext ctx = req.getServletContext();
                String color = ctx.getInitParameter("color");
                
                //PrintWriter pw = res.getWriter();
                ServletOutputStream sos = res.getOutputStream();
               // pw.println("Hello from do post of Student and the color is : "+color);
                sos.println("Hello");
                
                String ip = req.getRemoteHost();
                //pw.println(ip);
        }
        catch(IOException ie)
        {
            System.out.println("Error in project");
            
        }
    }
}
