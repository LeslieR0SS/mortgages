package daw.mortgage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import daw.mortgage.User;
import daw.mortgage.service.UserService;
import daw.mortgage.service.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	//Services
	private UserService service = new UserServiceImpl();
       

    public LoginServlet() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Holaa desde LOGIN servlettt ");
		
		//1. cargar datos
		request.setAttribute("mensaje", "Hola Mundo");
		
		//2. delegar a la vista
		request.getRequestDispatcher("index.html").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//User user = new User(null, email, password);
		//service
		//this.service.findOne(email);
		
		User user = this.service.findOne(email);
		if(user != null) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("/views/calculator.jsp").forward(request, response);
			System.out.println("--Login OK--");
			System.out.println(email);
			System.out.println(password);
	
		}else {
			response.getWriter().append("ERRROr al loguear");
		}
		
//		System.out.println(email);
//		System.out.println(password);
		
//		request.getRequestDispatcher("/views/calculator.jsp").forward(request, response);

	}

}
