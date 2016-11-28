package pl.wt.springAngular.view;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	public Object info(){
		return new Object(){
			public String s = "aaaa ąę !";
			public int i = 150;
			public Object obj = new Object(){
				public String nazwa = "Xyz";
				public int val = 152;
			};
		};
	}
	
	@RequestMapping(name="/post", method = RequestMethod.POST)
	public Object post(@RequestBody Encja req) throws Exception{
		System.out.println(req.toString());
		Thread.sleep(1000);
		return new Encja("Xyzęółxx", 152, new Objekt(123L, "dane"));
	}
	
	
}
