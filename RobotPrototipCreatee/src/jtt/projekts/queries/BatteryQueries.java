package jtt.projekts.queries;

public interface BatteryQueries {
final String  TABLE = "battery";
	
	final String QUERY_INSERT = "INSERT INTO " + TABLE + "(batteryType, voltage, capacity, lifeCycle) VALUES (?, ?, ?, ?)";
	final String QUERY_UPDATE = "UPDATE " + TABLE + " SET batteryType = ? AND voltage = ? AND capacity = ? AND lifeCycle = ? WHERE id_battery = ?";
	final String QUERY_DELETE = "DELETE FROM " + TABLE + " WHERE batteryType = ? AND voltage = ? AND capacity = ? AND lifeCycle = ?" ;
	
	final String QUERY_GET_ID = "SELECT id_board FROM " + TABLE + " WHERE batteryType = ? AND  voltage = ?";
	final String QUERY_GET_BY_ID = "SELECT * FROM " + TABLE + " WHERE id_battery  = ?";
 
   final String QUERY_GET_ALL = "SELECT * FROM " + TABLE;
   
   final String QUERY_GET_BY_VOLT = "SELECT * FROM " + TABLE + " WHERE voltage  = ?";
   final String QUERY_GET_BY_CAPACITY = "SELECT * FROM " + TABLE + " WHERE capacity  = ?";
	
	
}
