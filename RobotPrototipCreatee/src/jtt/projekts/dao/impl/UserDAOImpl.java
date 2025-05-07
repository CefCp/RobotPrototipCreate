package jtt.projekts.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jtt.projekts.connection.Database;
import jtt.projekts.dao.UserDAO;
import jtt.projekts.dto.User;
import jtt.projekts.queries.UsersQueries;

public class UserDAOImpl implements UserDAO, UsersQueries{

	@Override
	public int insert(User value) throws SQLException {
		Connection conn = Database.getConnection();
		
		List<User> users = getAllData();
		
		boolean userExists = false;
		for(User u : users) {
			if(u.getName().equals(value.getName())) {
				userExists = true;
				break;
			}
		}
		if(userExists) return 0;
		
		PreparedStatement stmt = conn.prepareStatement(QUERY_INSERT, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		stmt.setString(1, value.getName());
		stmt.setString(2, value.getEmail());
		stmt.setString(3, value.getPassword());
		stmt.setString(4, value.getRole());
		int result = stmt.executeUpdate();
		
		return result;
	}

	@Override
	public int update(User value) throws SQLException {
		Connection conn = Database.getConnection();
		PreparedStatement stmt;
		
		if(value.getName() == null || value.getEmail() == null) {
			return 0;
			
		}else {
			stmt = conn.prepareStatement(QUERY_UPDATE, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
			stmt.setString(1, value.getName());
			stmt.setString(2, value.getEmail());
			stmt.setString(3, value.getPassword());
			stmt.setString(4, value.getRole());
			stmt.setInt(5, value.getId());
			
		}
		int result = stmt.executeUpdate();

		return result;
	}

	@Override
	public int delete(User value) throws SQLException {
		Connection conn = Database.getConnection();
		PreparedStatement stmt = conn.prepareStatement(QUERY_DELETE, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		stmt.setString(1, value.getName());
		stmt.setString(2, value.getEmail());
		stmt.setString(3, value.getPassword());
		stmt.setString(4, value.getRole());
		System.out.println(value.getName());
		int result = stmt.executeUpdate();
		
		return result;
	}

	@Override
	public int getID(User value) throws SQLException {
		Connection conn = Database.getConnection();
		PreparedStatement stmt = conn.prepareStatement(QUERY_GET_ID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		stmt.setString(1, value.getName());
		
		
		ResultSet rs = stmt.executeQuery();
		rs.first();
		
		int id = rs.getInt("id_user");
		return id;
	}

	@Override
	public User getByID(int id) throws SQLException {
		Connection conn = Database.getConnection();
		PreparedStatement stmt = conn.prepareStatement(QUERY_GET_BY_ID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		stmt.setInt(1, id);
		
		ResultSet rs  = stmt.executeQuery();
		rs.first();
		
		String name = rs.getString("name");
		String email = rs.getString("email");
		String password = rs.getString("password");
		String role = rs.getString("role");
		
		
		User user = new User(name, email, password, role);
		user.setId(id);

		return user;
	}

	@Override
	public List<User> getAllData() throws SQLException {
		Connection conn = Database.getConnection();
		List<User> users = new ArrayList<User>();
		
		Statement stmt = conn.prepareStatement(QUERY_GET_ALL, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs = stmt.executeQuery(QUERY_GET_ALL);
		
		
		while(rs.next()) {
			
			String name = rs.getString("name");
			String email = rs.getString("email");
			String password = rs.getString("password");
			String role = rs.getString("role");
			
			
			User user = new User(name, email, password, role);
			users.add(user);
			
			
			}
		return users;
	}

	@Override
	public User getByName(String name) throws SQLException {
		Connection conn = Database.getConnection();
		
		
		PreparedStatement stmt = conn.prepareStatement(QUERY_GET_BY_NAME, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		stmt.setString(1, name);
		
		
		ResultSet rs = stmt.executeQuery();
		rs.first();
		
		
//			String name = rs.getString("name");
		
		
			String email = rs.getString("email");
			
			
			String password = rs.getString("password");
			String role = rs.getString("role");
			
			
			User user = new User(name, email, password, role);
			
			
		return user;
	}

	@Override
	public List<User> getByEmail(String email) throws SQLException {
		Connection conn = Database.getConnection();
		List<User> users = new ArrayList<User>();
		
		PreparedStatement stmt = conn.prepareStatement(QUERY_GET_BY_EMAIL, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		stmt.setString(1, email);
		
		
		ResultSet rs = stmt.executeQuery(QUERY_GET_BY_EMAIL);
		
		
		while(rs.next()) {
			String name = rs.getString("name");
//			String email = rs.getString("email");
			String password = rs.getString("password");
			String role = rs.getString("role");
			
			
			User user = new User(name, email, password, role);
			users.add(user);
			}
		return users;
	}

	@Override
	public List<User> getByRole(String role) throws SQLException {
		Connection conn = Database.getConnection();
		List<User> users = new ArrayList<User>();
		
		PreparedStatement stmt = conn.prepareStatement(QUERY_GET_BY_ROLE, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		stmt.setString(1, role);
		
		
		ResultSet rs = stmt.executeQuery(QUERY_GET_BY_ROLE);
		
		
		while(rs.next()) {
			String name = rs.getString("name");
			String email = rs.getString("email");
			String password = rs.getString("password");
//			String role = rs.getString("role");
			
			
			User user = new User(name, email, password, role);
			users.add(user);
			}
		return users;
	}

}

