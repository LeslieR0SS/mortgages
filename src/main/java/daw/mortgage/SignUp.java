package daw.mortgage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import daw.mortgage.service.UserService;
import daw.mortgage.service.UserServiceImpl;

/**
 * Servlet implementation class SignUp
 */
@WebServlet (name="SignUp", value="/signup")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	//SERVICE
	private UserService service = new UserServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsersDAO userDAO = new UsersDAOImpl();
		
		User userTest = new User(null, "admin@email.com", "admin");
		userDAO.create(userTest);
		
		response.getWriter().append(userDAO.findAll().toString());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = new User(null, email, password);
		//service
		this.service.create(user);
		
		System.out.println(email);
		System.out.println(password);
		
		request.getRequestDispatcher("/views/calculator.jsp").forward(request, response);
	}

}
