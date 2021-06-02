package dog_shoppingmall_proj.service;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dog_shoppingmall_proj.dao.impl.DogDaoImpl;
import dog_shoppingmall_proj.ds.JndiDs;
import dog_shoppingmall_proj.dto.Cart;

public class DogCartListService {
	private DogDaoImpl dao = DogDaoImpl.getInstance();
	private Connection con = JndiDs.getConnection();	
	
	public DogCartListService() {
		dao.setCon(con);
	}
	
	public ArrayList<Cart> getCartList(HttpServletRequest request) {
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cartList");
				
		return cartList;		
	}	
}
