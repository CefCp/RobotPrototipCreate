package jtt.projekts.queries;

public interface BoardQueries {
	final String  TABLE = "board";
	
	final String QUERY_INSERT = "INSERT INTO " + TABLE + "(name, size, sizeOfMicro) VALUES (?, ?, ?)";
	final String QUERY_UPDATE = "UPDATE " + TABLE + " SET name = ? AND size = ? AND sizeOfMicro = ? WHERE id_board = ?";
	final String QUERY_DELETE = "DELETE FROM " + TABLE + " WHERE name = ? AND size = ?  AND sizeOfMicro = ? " ;
	
	final String QUERY_GET_ID = "SELECT id_board FROM " + TABLE + " WHERE name = ? ";
	final String QUERY_GET_BY_ID = "SELECT * FROM " + TABLE + " WHERE id_board  = ?";
 
   final String QUERY_GET_ALL = "SELECT * FROM " + TABLE;
   
   final String QUERY_GET_BY_SIZE = "SELECT * FROM " + TABLE + " WHERE size  = ?";
   final String QUERY_GET_BY_NAME = "SELECT * FROM " + TABLE + " WHERE name  = ?";
}
