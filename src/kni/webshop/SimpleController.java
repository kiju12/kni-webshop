package kni.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {

	 @RequestMapping("/")   
	 public String welcome(Model model) { 
		 model.addAttribute("greeting", "SIEMA!");     
		 model.addAttribute("tagline", "Policja wrog");
     return "siema";   
     }
	
	
	@RequestMapping("/welcome")
	public ModelAndView simpleMethod() {
		String message = "<br><div style='text-align:center;'>\"\r\n" 
				+ "wiadomosc z metody"
				+ "</div><br><br>";
		
		return new ModelAndView("welcome", "message", message);
	}
	
}
