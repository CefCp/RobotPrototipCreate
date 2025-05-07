package jtt.projekts.queries;

public interface MicrocontrollerQueries {
	final String  TABLE = "microcontroler";
	
	final String QUERY_INSERT = "INSERT INTO " + TABLE + "(name, clockSpeed, programMemory, RAM, size, voltUsage) VALUES (?, ?, ?, ?, ?, ?)";
	final String QUERY_UPDATE = "UPDATE " + TABLE + " SET name = ? AND clockSpeed = ? AND programMemory = ? AND RAM = ? AND size = ? AND voltUsage = ? WHERE id_microControler = ?";
	final String QUERY_DELETE = "DELETE FROM " + TABLE + " WHERE name = ? AND clockSpeed = ? AND programMemory = ? AND RAM = ? AND size = ? AND voltUsage = ?" ;
	
	final String QUERY_GET_ID = "SELECT id_microControler FROM " + TABLE + " WHERE name = ? ";
	final String QUERY_GET_BY_ID = "SELECT * FROM " + TABLE + " WHERE id_microControler  = ?";
 
   final String QUERY_GET_ALL = "SELECT * FROM " + TABLE;
   
   final String QUERY_GET_BY_SIZE = "SELECT * FROM " + TABLE + " WHERE size  = ?";
   final String QUERY_GET_BY_NAME = "SELECT * FROM " + TABLE + " WHERE name  = ?";
   final String QUERY_GET_BY_VOLT = "SELECT * FROM " + TABLE + " WHERE voltUsage  = ?";

}
