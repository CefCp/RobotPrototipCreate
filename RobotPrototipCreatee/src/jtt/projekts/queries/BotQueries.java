package jtt.projekts.queries;

public interface BotQueries {
	final String  TABLE = "completedbot";
	
	final String QUERY_INSERT = "INSERT INTO " + TABLE + "(id_user, id_microboard, id_battery, id_motor, id_frame, id_sensor, id_remote) VALUES (?, ?, ?, ?, ?, ?, ?)";
	final String QUERY_UPDATE = "UPDATE " + TABLE + " SET id_user = ? AND id_microboard = ? AND id_battery = ? AND id_motor = ? AND id_frame = ? AND id_sensor = ? AND id_remote = ? WHERE id_bot = ?";
	final String QUERY_DELETE = "DELETE FROM " + TABLE + " WHERE id_user = ? AND id_microboard = ? AND id_battery = ? AND id_motor = ? AND id_frame = ? AND id_sensor = ? AND id_remote = ? " ;
	
	final String QUERY_GET_ID = "SELECT id_bot FROM " + TABLE + " WHERE id_user = ? AND id_microboard = ? AND id_battery = ? AND id_motor = ? AND id_frame = ? AND id_sensor = ? AND id_remote = ?";
	final String QUERY_GET_BY_ID = "SELECT * FROM " + TABLE + " WHERE id_bot  = ?";
 
   final String QUERY_GET_ALL = "SELECT * FROM " + TABLE;
   
   final String QUERY_GET_BY_USER = "SELECT * FROM " + TABLE + " WHERE id_user  = ?";
   final String QUERY_GET_BY_MICROBOARD = "SELECT * FROM " + TABLE + " WHERE id_microboard  = ?";
}
