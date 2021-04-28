package dog_shoppingmall_proj.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shoppingmall_proj.dto.Cart;
import dog_shoppingmall_proj.service.DogCartListService;

public class DogCartListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		DogCartListService service = new DogCartListService();
		ArrayList<Cart> cartList = service.getCartList(request);
		int totalMoney=0;
		int money=0;
		
		for(Cart cart : cartList) {
			money = cart.getPrice()*cart.getQty();
			totalMoney += money;
		}
		
		request.setAttribute("money", money);
		request.setAttribute("totalMoney", totalMoney);
		
		ActionForward forward = new ActionForward("/dog_shopping/dogCartList.jsp",false);
		return forward;
		
	}

}
