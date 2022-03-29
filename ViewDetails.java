package com.zoho.schools;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ViewRecords
 */
@WebServlet("/viewstudents")
public class ViewDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		
	}
	
	public static Connection connectDB()
    {
	   System.out.println("connectDB method called here");
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zutestdb", "root", "N@te5656");
        }
        catch (Exception message) {
            System.out.println(message);
        }
        return connection;
    }


	   public Boolean fetchValues(MemberZS member)
	   {
		   System.out.println("Fetch values method called here");
	        Connection connect = connectDB();
	        
	        try 
	        {
		    
		        Statement statement = connect.createStatement();
		        String query = "select * from zumembers";
		        ResultSet result = statement.executeQuery(query);
		        
		        while(result.next())
		        {
		        	System.out.println(result.getString(1)+","+result.getString(2));
		        }
		        
		        System.out.println("Insert successful");
		        return true;
			} catch (SQLException e) {
				System.out.println("Insert failure");
				e.printStackTrace();
				return false;
			}
	        
	   }
	   
	   

}
