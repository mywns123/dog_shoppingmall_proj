package dog_shoppingmall_proj.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shoppingmall_proj.dto.Cart;
import dog_shoppingmall_proj.service.DogCartSearchService;

public class DogCartSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		DogCartSearchService service = new DogCartSearchService();
		int startmoney = Integer.parseInt(request.getParameter("startMoney"));
		int endmoney = Integer.parseInt(request.getParameter("endMoney"));
		ArrayList<Cart> cartList = service.getCartSearchList(startmoney, endmoney, request);
		
		request.setAttribute("cartList", cartList);
		request.setAttribute("start_money",startmoney);
		request.setAttribute("end_money", endmoney);

		int money = 0;
		int totalMoney = 0;
		
		for(Cart cart : cartList) {
			money = cart.getPrice()*cart.getQty();
			totalMoney += money;
		}
		
		request.setAttribute("totalMoney", totalMoney);

		ActionForward forward = new ActionForward("/dog_shopping/dogCartList.jsp",false);
		return forward;
		
	}

}
