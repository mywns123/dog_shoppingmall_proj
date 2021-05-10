package dog_shoppingmall_proj.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dog_shoppingmall_proj.dto.Dog;
import dog_shoppingmall_proj.service.DogRegistService;

public class DogRegistAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		DogRegistService service  = new DogRegistService();
		String realFolder="";
		
		String saveFolder = "/images";
		String enctype = "UTF-8";
		int maxSize = 5*1024*1024;
		
		ServletContext context = request.getServletContext();
		realFolder = context.getRealPath(saveFolder);
		MultipartRequest multi;	
		boolean isRegistSuccess = false;
		ActionForward forward =null;
		
		try {
			multi = new MultipartRequest(
					request,realFolder,maxSize,enctype,new DefaultFileRenamePolicy());
			String image = multi.getFilesystemName("image");
			Dog dog = new Dog(0, multi.getParameter("kind"),
					Integer.parseInt( multi.getParameter("price")),
					image,
					multi.getParameter("nation"),
					Integer.parseInt( multi.getParameter("height")),
					Integer.parseInt( multi.getParameter("weight")),
					multi.getParameter("content"), 0);
			isRegistSuccess = service.registDog(dog);			
			
			if(isRegistSuccess) {
				forward = new ActionForward("dogList.do",true);
			}else {				
				PrintWriter out;
				try {
					response.setContentType("text/html;charset=UTF-8");
					out = response.getWriter();
					out.println("<script>");
					out.println("");
					out.println("history.back();");
					out.println("</script>");
				} catch (IOException e) {				
					e.printStackTrace();
				}					
			}			
		}catch (IOException e) {
			e.printStackTrace();
		}			
		return forward;
}

}
