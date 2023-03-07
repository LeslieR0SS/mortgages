package daw.mortgage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsersDAOImpl implements UsersDAO {

	@Override
	public List<User> findAll() {
		// 1. Establish connection with the DB
		List <User> users = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mortgages",
					"root", "BolaCha.43.ArroZ");
			
		// 2. Execute statements
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM users;";
			
		// 3. process results
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				Long id = resultSet.getLong("id");
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				System.out.println(id + " "+ email + " " + password + " ");
				User user = new User(id, email, password);
				users.add(user);

			}
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return users;
	}

	@Override
	public User findOne(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mortgages",
					"root", "BolaCha.43.ArroZ");
			
		// 2. Execute statements
			
			String sql = "SELECT * FROM mortgages.users WHERE email=?;";
			
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, email);

			User user = null;
			if (statement.execute()) {
				ResultSet rs = statement.getResultSet();
				if (rs.next()) {
					user = new User(rs.getLong("id"), email, rs.getString("password"));
				}
			}
			return user;
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean create(User user) {

		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mortgages",
					"root", "BolaCha.43.ArroZ");
			
		// 2. Execute statements
			
			String sql = "INSERT INTO users (email, password) VALUES (?, ?);";
			
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, user.getEmail());
			statement.setString(2, user.getPassword());

			statement.executeUpdate();
			result = true;
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {

		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mortgages",
					"root", "BolaCha.43.ArroZ");
			
		// 2. Execute statements
			
			String sql = "DELETE FROM mortgages.users WHERE id=?;";
			
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setLong(1, id);

			statement.executeUpdate();
			result = true;
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
