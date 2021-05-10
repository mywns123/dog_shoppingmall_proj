package dog_shoppingmall_proj.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shoppingmall_proj.service.DogCartQtyUpService;

public class DogCartQtyUpAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		String kind = request.getParameter("kind");
		DogCartQtyUpService service = new DogCartQtyUpService();
		service.upCartQty(kind, request);
		
		ActionForward forward = new ActionForward("dogCartList.do",true);
		return forward;			
	}

}
