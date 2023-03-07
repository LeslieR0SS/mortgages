package daw.mortgage.service;

import daw.mortgage.User;

public interface UserService {
	
	boolean create(User user);
	
	User findOne (String email);

}
