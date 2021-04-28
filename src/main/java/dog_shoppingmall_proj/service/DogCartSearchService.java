package dog_shoppingmall_proj.service;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dog_shoppingmall_proj.dao.impl.DogDaoImpl;
import dog_shoppingmall_proj.ds.JndiDs;
import dog_shoppingmall_proj.dto.Cart;

public class DogCartSearchService {
	private DogDaoImpl dao = DogDaoImpl.getInstance();
	private Connection con = JndiDs.getConnection();	
	
	public DogCartSearchService() {
		dao.setCon(con);
	}
	
	public ArrayList<Cart> getCartSearchList(int start_money, int end_money, HttpServletRequest request) {
		HttpSession session = request.getSession();
		ArrayList<Cart> oldCartList = (ArrayList<Cart>) session.getAttribute("cartList");
		ArrayList<Cart> cartList = new ArrayList<Cart>();
		
		for(Cart oldCart : oldCartList) {
			if(oldCart.getPrice() >= start_money && oldCart.getPrice() <= end_money ) {			
				cartList.add(oldCart);	
			}
		}	
		return cartList;		
	}	
	
}
