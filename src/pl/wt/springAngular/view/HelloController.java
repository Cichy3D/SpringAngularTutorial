package pl.wt.springAngular.view;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping(value = "hello", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String doIt(@RequestParam(name="imie", required=false) String name) throws UnsupportedEncodingException{
		if(name!=null){
			return "hello "+name+"!!";
		}
		return "hello there!";
	}

}
