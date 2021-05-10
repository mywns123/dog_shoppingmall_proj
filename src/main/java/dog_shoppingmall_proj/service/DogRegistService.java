package dog_shoppingmall_proj.service;

import java.sql.Connection;
import java.sql.SQLException;

import dog_shoppingmall_proj.dao.impl.DogDaoImpl;
import dog_shoppingmall_proj.ds.JndiDs;
import dog_shoppingmall_proj.dto.Dog;

public class DogRegistService {
	private DogDaoImpl dao = DogDaoImpl.getInstance();
	private Connection con = JndiDs.getConnection();	
	
	public DogRegistService() {}
	
	public boolean registDog(Dog dog) {
		boolean isRegistSuccess = false;		
		
		try {
			con.setAutoCommit(false);
			dao.setCon(con);
			
			dao.insertDog(dog);
			isRegistSuccess = true;
			

			JndiDs.commit(con);
		} catch (SQLException e) {
			JndiDs.rollback(con);			
			e.printStackTrace();
		}
		return isRegistSuccess;
	}
	
	
}
