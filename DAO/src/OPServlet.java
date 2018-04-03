import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OPServlet")
public class OPServlet extends HttpServlet {
    public OPServlet() {

    }
//create interface name student dao
    //create 5 abstract method getcon() insert() update() delete() view()
        //StudentNeed View();
            //create hidden form
    @Override
    public String toString() {

        return "OPServlet{}";
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String op=request.getParameter("op");
        if(op.equals("insert"))
        {
            //StudentModel studentModel=StudentModel view();
            id=request.getParameter("id"); //read all the parameter from jsp
            //name
            //age
            StudentModel sm=new StidentModel();
            sm.setId(id);

            StudentDAO sd=new StudentDAOImp();
            sd.insert(studentModel);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
