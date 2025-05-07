package jtt.projekts.queries;

public interface MotorQueries {
	final String  TABLE = "motor";
	
	final String QUERY_INSERT = "INSERT INTO " + TABLE + "(name, voltage, maxRMP, currentDraw) VALUES (?, ?, ?, ?)";
	final String QUERY_UPDATE = "UPDATE " + TABLE + " SET name = ? AND voltage = ? AND maxRMP = ? AND currentDraw = ? WHERE id_motor = ?";
	final String QUERY_DELETE = "DELETE FROM " + TABLE + " WHERE name = ? AND voltage = ? AND maxRMP = ? AND currentDraw = ? " ;
	
	final String QUERY_GET_ID = "SELECT id_board FROM " + TABLE + " WHERE name = ? ";
	final String QUERY_GET_BY_ID = "SELECT * FROM " + TABLE + " WHERE id_motor  = ?";
 
   final String QUERY_GET_ALL = "SELECT * FROM " + TABLE;
   
   final String QUERY_GET_BY_VOLT = "SELECT * FROM " + TABLE + " WHERE voltage  = ?";
   final String QUERY_GET_BY_NAME = "SELECT * FROM " + TABLE + " WHERE name  = ?";
}
