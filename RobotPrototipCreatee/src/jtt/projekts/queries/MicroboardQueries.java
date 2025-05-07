package jtt.projekts.queries;

public interface MicroboardQueries {
	final String  TABLE = "microboard";
	
	final String QUERY_INSERT = "INSERT INTO " + TABLE + "(id_board, id_microControler) VALUES (?, ?)";
	final String QUERY_UPDATE = "UPDATE " + TABLE + " SET id_board = ? AND id_microControler = ?  WHERE id_board = ?";
	final String QUERY_DELETE = "DELETE FROM " + TABLE + " WHERE id_board = ? AND id_microControler = ?  " ;
	
	final String QUERY_GET_ID = "SELECT id_board FROM " + TABLE + " WHERE id_board = ? AND id_microControler = ?  ";
	final String QUERY_GET_BY_ID = "SELECT * FROM " + TABLE + " WHERE id_microBoard  = ?";
 
   final String QUERY_GET_ALL = "SELECT * FROM " + TABLE;
   
	
}
