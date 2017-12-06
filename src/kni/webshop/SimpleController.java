package kni.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {

	@RequestMapping("/welcome")
	public ModelAndView simpleMethod() {
		String message = "<br><div style='text-align:center;'>\"\r\n" 
				+ "wiadomosc z metody"
				+ "</div><br><br>";
		
		return new ModelAndView("welcome", "message", message);
	}
	
	public void newBranch() {
		return;
	}
}
