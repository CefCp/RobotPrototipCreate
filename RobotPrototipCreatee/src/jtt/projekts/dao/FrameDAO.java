package jtt.projekts.dao;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.base.GenericDAO;
import jtt.projekts.dto.Frame;



public interface FrameDAO extends GenericDAO<Frame>{
	List<Frame> getBYSize(String size)  throws SQLException;
	List<Frame> getByMaterial(String material)  throws SQLException;
}
