package dog_shoppingmall_proj.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shoppingmall_proj.dto.Dog;
import dog_shoppingmall_proj.service.DogCartAddService;

public class DogCartAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		DogCartAddService dogCartAddService = new DogCartAddService();
		int id = Integer.parseInt(request.getParameter("id"));
		Dog dog = dogCartAddService.getCartDog(id);
		dogCartAddService.addCart(request, dog);
			
		ActionForward forward = new ActionForward("dogCartList.do",false);
		return forward;	
	}

}
