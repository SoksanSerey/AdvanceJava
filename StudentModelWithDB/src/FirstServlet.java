import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "FirstServlet")
public class FirstServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter pw=response.getWriter();
        String name=request.getParameter("name");
        int age=Integer.parseInt(request.getParameter("age"));
        int phone=Integer.parseInt(request.getParameter("phone"));
        String mail=request.getParameter("mail");

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest", "root","");//demo of it in Batch Database project

            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO studentmodel (name,age,phone,email) VALUES (?,?,?,?)");
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,age);
            preparedStatement.setInt(3,phone);
            preparedStatement.setString(4,mail);

            preparedStatement.addBatch();
            preparedStatement.executeBatch();

            int i=preparedStatement.executeUpdate();
            connection.commit();
            String msg=" ";
            if(i!=0)
            {
                msg="Record has been insert";
                pw.println("<font size='12' color='blue'>" +msg+"</font>");
            }
            else
            {
                msg="fail to insert data";
                pw.println("<font size='12' color='red'>"+msg+"</font>");
            }
            preparedStatement.close();
            pw.println("end condition");

        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
