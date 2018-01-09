import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StaffServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
                try
        {
                ServletContext ctx = req.getServletContext();
                String color = ctx.getInitParameter("color");
                
                PrintWriter pw = res.getWriter();
                pw.println("Hello from do get of Staff and the color is : "+color);
        }
        catch(IOException ie)
        {
            System.out.println("Error in project");
            
        }

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
             try
        {
                ServletContext ctx = req.getServletContext();
                String color = ctx.getInitParameter("color");
                
                PrintWriter pw = res.getWriter();
                pw.println("Hello from do post of Staff and the color is : "+color);
        }
        catch(IOException ie)
        {
            System.out.println("Error in project");
            
        }

    }
}
