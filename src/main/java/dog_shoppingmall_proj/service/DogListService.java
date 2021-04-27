package dog_shoppingmall_proj.service;

import java.sql.Connection;
import java.util.List;

import dog_shoppingmall_proj.dao.impl.DogDaoImpl;
import dog_shoppingmall_proj.ds.JndiDs;
import dog_shoppingmall_proj.dto.Dog;


public class DogListService {
	private DogDaoImpl dao = DogDaoImpl.getInstance();
	private Connection con = JndiDs.getConnection();	
	
	public DogListService() {
		dao.setCon(con);
	}

	public List<Dog> getDogList() {
		return  dao.selectDogList();
	}	
}
