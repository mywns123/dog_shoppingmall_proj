package dog_shoppingmall_proj.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shoppingmall_proj.service.DogCartRemoveService;

public class DogCartRemoveAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		String[] kindArray = request.getParameterValues("remove");
		DogCartRemoveService  service =new DogCartRemoveService();
		service.cartRemove(request, kindArray);
		
		ActionForward forward = new ActionForward("dogList.do",true);
		return forward;		
	}

}
