package dog_shoppingmall_proj.service;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dog_shoppingmall_proj.dao.impl.DogDaoImpl;
import dog_shoppingmall_proj.ds.JndiDs;
import dog_shoppingmall_proj.dto.Cart;

public class DogCartQtyUpService {
	private DogDaoImpl dao = DogDaoImpl.getInstance();
	private Connection con = JndiDs.getConnection();	
	
	public DogCartQtyUpService() {
		dao.setCon(con);
	}
	
	public void upCartQty(String kind, HttpServletRequest request) {
		HttpSession session = request.getSession();
		ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cartList");
				
		for(Cart cart : cartList) {
			if(cart.getKind().equals(kind)) {			
				cart.setQty(cart.getQty() + 1);				
			}
		}	
	}	
	
	
	
}
