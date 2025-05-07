package jtt.projekts.queries;

public interface UsersQueries {
	final String  TABLE = "users";
	
	final String QUERY_INSERT = "INSERT INTO " + TABLE + "(name, email, password, role) VALUES (?, ?, ?, ?)";
	final String QUERY_UPDATE = "UPDATE " + TABLE + " SET name = ? AND email = ? AND password = ? AND role = ? WHERE id_user = ?";
	final String QUERY_DELETE = "DELETE FROM " + TABLE + " WHERE name = ? AND email = ?  AND password = ? AND role = ?" ;
	
	final String QUERY_GET_ID = "SELECT id_user FROM " + TABLE + " WHERE name = ? ";
	final String QUERY_GET_BY_ID = "SELECT * FROM " + TABLE + " WHERE id_user  = ?";
 
   final String QUERY_GET_ALL = "SELECT * FROM " + TABLE;
 
	final String QUERY_GET_BY_NAME = "SELECT * FROM " + TABLE + " WHERE name = ?";
	final String QUERY_GET_BY_EMAIL = "SELECT * FROM " + TABLE + " WHERE email  = ?";
	final String QUERY_GET_BY_ROLE = "SELECT * FROM " + TABLE + " WHERE role  = ?";
}
