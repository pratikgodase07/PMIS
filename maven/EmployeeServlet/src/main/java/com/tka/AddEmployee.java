package com.tka;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/AddEmployee")
public class AddEmployee {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException
	
	String username= request.getParameter("username");
	String password = request.getParameter("password");
	String email = request.getParameter("email");
	double salary = Double.parseDouble(request.getParameter("salary"));
	
	Connection con= DBUtil.getConnection();
	
	String sql= "Insert into employee (username, password, email,salary) values (?,?,?,?) ";
	
	try
	{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setDouble(4, salary);
		ps.executeUpdate();
		}
	
	catch (SQLException e1) {
		e1.printStackTrace();
		// TODO: handle exception
	}
	
	response.sendRedirect("ListEmployees");
	
	

}
