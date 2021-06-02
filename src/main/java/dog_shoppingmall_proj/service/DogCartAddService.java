package dog_shoppingmall_proj.service;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dog_shoppingmall_proj.dao.impl.DogDaoImpl;
import dog_shoppingmall_proj.ds.JndiDs;
import dog_shoppingmall_proj.dto.Cart;
import dog_shoppingmall_proj.dto.Dog;

public class DogCartAddService {
	private DogDaoImpl dao = DogDaoImpl.getInstance();
	private Connection con = JndiDs.getConnection();	
	
	public DogCartAddService() {
		dao.setCon(con);
	}
	
	public Dog getCartDog(int id) {		
		return dao.selectDog(id);
	}
	
	public void addCart(HttpServletRequest request , Dog cartDog) {
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cartList");
			
		if(cartList == null) {
			cartList = new ArrayList<Cart>();
			session.setAttribute("cartList", cartList);
		}
		
		boolean isNewCart = true;
		for(Cart cart : cartList) {
			if(cartDog.getKind().equals(cart.getKind())) {
				isNewCart = false;
				cart.setQty(cart.getQty() + 1);
				break;
			}
		}
		
		if(isNewCart) {
			Cart cart = new Cart(cartDog.getImage(),cartDog.getKind(),cartDog.getPrice(),1);
			cartList.add(cart);			
		}
	
	}
}
