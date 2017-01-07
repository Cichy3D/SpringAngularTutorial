package pl.wt.springAngular.view;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.wt.springAngular.model.Encja;
import pl.wt.springAngular.model.Objekt;

@RestController
public class HelloRest {

	@RequestMapping({"/rest/{id}"})
	public Object info(@PathVariable("id") int id){
		return new Object(){
			public String s = "aaaa ąę !";
			public int i = id;
		};
	}
	
	@RequestMapping({"/rest"})
	@Secured("ROLE_USER")
	public Object info(){
		return new Object(){
			public String s = "aaaa ąę !";
			public int i = 150;
			public Object obj = new Object(){
				public String 
				nazwa = "Xyz";
				public int val = 152;
			};
		};
	}
	
	@RequestMapping(name="/post", method = RequestMethod.POST)
	@Secured("ROLE_USER")
	public Object post(@RequestBody Encja req) throws Exception{
		System.out.println(req.toString());
		Thread.sleep(1000);
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		return new Encja("Xyzęółxxs "+auth, 152, new Objekt(123L, "dane"));
	}
	
	@RequestMapping(name="/logout", method = RequestMethod.GET)
	public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
			System.out.println("logging out................");
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    response.sendRedirect("index.htm");
	}
	
}
