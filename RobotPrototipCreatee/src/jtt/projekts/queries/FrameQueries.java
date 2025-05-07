package jtt.projekts.queries;

public interface FrameQueries {
	final String  TABLE = "frame";
	
	final String QUERY_INSERT = "INSERT INTO " + TABLE + "(material, dimension, weight) VALUES (?, ?, ?)";
	final String QUERY_UPDATE = "UPDATE " + TABLE + " SET material = ? AND dimension = ? AND weight = ? WHERE id_frame = ?";
	final String QUERY_DELETE = "DELETE FROM " + TABLE + " WHERE name = ? AND size = ?  AND sizeOfMicro = ? " ;
	
	final String QUERY_GET_ID = "SELECT id_frame FROM " + TABLE + " WHERE material = ? AND dimension = ? ";
	final String QUERY_GET_BY_ID = "SELECT * FROM " + TABLE + " WHERE id_frame  = ?";
 
   final String QUERY_GET_ALL = "SELECT * FROM " + TABLE;
   
   final String QUERY_GET_BY_SIZE = "SELECT * FROM " + TABLE + " WHERE dimension  = ?";
   final String QUERY_GET_BY_MATERIAL = "SELECT * FROM " + TABLE + " WHERE material  = ?";
}
