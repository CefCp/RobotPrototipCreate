package jtt.projekts.queries;

public interface RemoteQueries {
	final String  TABLE = "remote";
	
	final String QUERY_INSERT = "INSERT INTO " + TABLE + "(brand, frequency, range, batteryType) VALUES (?, ?, ?, ?)";
	final String QUERY_UPDATE = "UPDATE " + TABLE + " SET brand = ? AND frequency = ? AND range = ? AND batteryType = ? WHERE id_sensors = ?";
	final String QUERY_DELETE = "DELETE FROM " + TABLE + " WHERE brand = ? AND frequency = ? AND range = ? AND batteryType = ? " ;
	
	final String QUERY_GET_ID = "SELECT id_sensors FROM " + TABLE + " WHERE brand = ? AND frequency = ? ";
	final String QUERY_GET_BY_ID = "SELECT * FROM " + TABLE + " WHERE id_frame  = ?";
 
   final String QUERY_GET_ALL = "SELECT * FROM " + TABLE;
   
   final String QUERY_GET_BY_BRAND = "SELECT * FROM " + TABLE + " WHERE brand  = ?";
   final String QUERY_GET_BY_FREQUANCY = "SELECT * FROM " + TABLE + " WHERE frequency  = ?";
   final String QUERY_GET_BY_RANGE = "SELECT * FROM " + TABLE + " WHERE range  = ?";
}
