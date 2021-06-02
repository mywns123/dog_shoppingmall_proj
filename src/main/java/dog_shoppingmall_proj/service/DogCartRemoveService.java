package dog_shoppingmall_proj.service;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dog_shoppingmall_proj.dao.impl.DogDaoImpl;
import dog_shoppingmall_proj.ds.JndiDs;
import dog_shoppingmall_proj.dto.Cart;

public class DogCartRemoveService {
	private DogDaoImpl dao = DogDaoImpl.getInstance();
	private Connection con = JndiDs.getConnection();	
	
	public DogCartRemoveService() {
		dao.setCon(con);
	}
	
	public void cartRemove(HttpServletRequest request, String[] kindArray) {
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cartList");
		for(String kind : kindArray) {			
			for(Cart cart : cartList) {				
				if(cart.getKind().equals(kind)) {					
					cartList.remove(cart);
					break;
				}
			}
		}				
	}	
}
