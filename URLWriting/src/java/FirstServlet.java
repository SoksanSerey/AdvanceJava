
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= req.getParameter("user");
        String pass=req.getParameter("pass");
//        String path ="/SecondServlet?name="+name+"&pass"+pass;
        RequestDispatcher rd=req.getRequestDispatcher(name);
        rd.forward(req, resp);
         
        
//        pw.println("<html>");
//        pw.println("head");
//        pw.println("/head");
//        pw.println("<body>");
//        pw.println("</body>");
//        pw.println("</html>");
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
}
