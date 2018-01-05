/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        String name=request.getParameter("username");
        String pass=request.getParameter("password");
        
        System.out.println("Welcome to first advanced java "+name+" don't forget this "+pass);
        
        try
        {
            ServletContext sc=request.getServletContext();
            String color=sc.getInitParameter("Color");
            PrintWriter pw=response.getWriter();
            pw.println("Welcome "+name);
            pw.println("Don't forget your password is "+pass);
            pw.println("I don't know "+color);
        }catch(IOException ioe)
        {
           System.out.println("Can't found object");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        
    }

}
