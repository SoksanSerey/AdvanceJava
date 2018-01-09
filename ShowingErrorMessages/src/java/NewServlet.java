import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            LinkedList linkedList = (LinkedList)request.getAttribute("errorList");
            
            if(linkedList!=null)
            {
                out.println("<font color='red'>");
                out.println("<b>");
                out.println("Please correct the following errors...");
                out.println("</b>");
                out.println("</br>");
                out.println("</br>");
                out.println("--------------------------------------------</br>");
                
                for(int i=0;i<linkedList.size();i++)
                {
                    out.println("</br>"+(i+1)+". "+linkedList.get(i));
                }
                out.println("</br>");
                out.println("</br>");
                out.println("</font>");
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>My Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='Controller' method='post'>");
            out.println("User name: <input type='Text' name='user'/></br>");
            out.println("Password : <input type='password' name='pass'/></br>");
            out.println("<input type='submit' value='Click'/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
