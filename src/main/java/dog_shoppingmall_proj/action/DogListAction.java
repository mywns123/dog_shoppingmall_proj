package dog_shoppingmall_proj.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dog_shoppingmall_proj.dto.Dog;
import dog_shoppingmall_proj.service.DogListService;

public class DogListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<String> todayImageList = new ArrayList<String>();
		Cookie[] cookieArray = request.getCookies();
		
		if(cookieArray != null) {
			for(int i = 0; i < cookieArray.length; i++) {
				if(cookieArray[i].getName().startsWith("today")) {
					todayImageList.add(cookieArray[i].getValue());
				}
			}
		}
		
		DogListService service  = new DogListService();		
		List<Dog> dogList= service.getDogList();
		
		request.setAttribute("dogList", dogList);
		request.setAttribute("todayImageList", todayImageList);
		
		ActionForward forward = new ActionForward("/dog_shopping/dogList.jsp",false);
		return forward;
	}

}
