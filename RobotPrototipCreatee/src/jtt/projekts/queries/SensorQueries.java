package jtt.projekts.queries;

public interface SensorQueries {
	final String  TABLE = "sensors";
	
	final String QUERY_INSERT = "INSERT INTO " + TABLE + "(sensorType, range, accuracy, sensitivity) VALUES (?, ?, ?, ?)";
	final String QUERY_UPDATE = "UPDATE " + TABLE + " SET sensorType = ? AND range = ? AND accuracy = ? AND sensitivity = ? WHERE id_sensors = ?";
	final String QUERY_DELETE = "DELETE FROM " + TABLE + " WHERE sensorType = ? AND range = ? AND accuracy = ? AND sensitivity = ? " ;
	
	final String QUERY_GET_ID = "SELECT id_sensors FROM " + TABLE + " WHERE sensorType = ? AND range = ? AND accuracy = ? ";
	final String QUERY_GET_BY_ID = "SELECT * FROM " + TABLE + " WHERE id_frame  = ?";
 
   final String QUERY_GET_ALL = "SELECT * FROM " + TABLE;
   
   final String QUERY_GET_BY_RANGE = "SELECT * FROM " + TABLE + " WHERE range  = ?";
   final String QUERY_GET_BY_ACCURACY = "SELECT * FROM " + TABLE + " WHERE accuracy  = ?";
}
