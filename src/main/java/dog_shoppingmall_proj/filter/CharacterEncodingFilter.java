package dog_shoppingmall_proj.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(
		urlPatterns = { "/*" },
		initParams = { 
				@WebInitParam(name = "encoding", value = "UTF-8") })

public class CharacterEncodingFilter implements Filter {
	private String encoding;

	public CharacterEncodingFilter() {}

	public void init(FilterConfig fConfig) throws ServletException {
//    	System.out.println("init filter");
		encoding = fConfig.getInitParameter("encoding");
		if (encoding == null) {
			encoding = "UTF-8";
		}
	}

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
//		response.setContentType("text/html;charset=" + encoding);
		/*
		 * response.setCharacterEncoding(encoding);
		 */		
		chain.doFilter(request, response);
	}

}