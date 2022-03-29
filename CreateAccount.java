package com.zoho.schools;
import java.io.IOException;

/**
 * Servlet implementation class CreateAccount
 */
@WebServlet("/addrecord")
public final class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		
		System.out.println("doGet call here");

		String name=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		//Insert in DB
		Boolean status = insertValues(name,email,password);
		
		PrintWriter out = response.getWriter();
	    out.println("Record insert - "+status);
	}
	
	public static Connection connectDB()
    {
	   System.out.println("connectDB method called here");
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "N@te5656");
        }
        catch (Exception message) {
            System.out.println(message);
        }
        return connection;
    }
   
   
   
	   
   public Boolean insertValues(String name,String email,String password)
   {
	   System.out.println("Insert values method called here");
        Connection connect = connectDB();
        
        try 
        {
	        String query = "insert into zumembers values(?,?,?)";
	        PreparedStatement preparedStatement = connect.prepareStatement(query);
	        
	        preparedStatement.setString(1, name);
	        preparedStatement.setString(2, email);
	        preparedStatement.setString(3, password);
	        preparedStatement.executeUpdate();
	        
	        connect.close();
	        
	        System.out.println("Insert successful");
	        return true;
		} catch (SQLException e) {
			System.out.println("Insert failure");
			e.printStackTrace();
			return false;
		}
        
   }

}


