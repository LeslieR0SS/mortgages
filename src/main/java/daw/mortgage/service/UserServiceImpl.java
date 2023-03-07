package daw.mortgage.service;

import daw.mortgage.User;
import daw.mortgage.UsersDAO;
import daw.mortgage.UsersDAOImpl;

public class UserServiceImpl implements UserService {
	
	private UsersDAO userDAO;
	
	public UserServiceImpl() {
		this.userDAO = new UsersDAOImpl();
	}
	

	@Override
	public boolean create(User user) {
		return this.userDAO.create(user);
	}
	
	@Override
	public User findOne (String email) {
		return this.userDAO.findOne(email);
	}
}
