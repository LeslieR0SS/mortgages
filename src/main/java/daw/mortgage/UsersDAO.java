package daw.mortgage;

import java.util.List;

public interface UsersDAO {
	
	List<User> findAll();
	
	User findOne(String email);
	
	boolean create(User user);

	boolean update(User user);
	
	boolean delete(Long id);
	
}
