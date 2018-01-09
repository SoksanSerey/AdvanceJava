
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession s = req.getSession();
        String name = (String)s.getAttribute("uname");
        String pass = (String)s.getAttribute("password");
        
        PrintWriter out = resp.getWriter();
        out.println(name+" : "+pass);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        HttpSession s = req.getSession();
        String name = (String)s.getAttribute("uname");
        String pass = (String)s.getAttribute("password");
        
        PrintWriter out = resp.getWriter();
        out.println(name+" : "+pass);
    }
    
}
