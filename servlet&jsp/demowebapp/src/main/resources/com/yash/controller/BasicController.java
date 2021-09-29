import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/simpleapp")
public class BasicController {
	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public String sayHelloWorld(ModelMap model) {
		model.addAllAttributes("Hello This basic mvc application");
		return "welcome";
	}
	
	@RequestMapping(value = "helloagain",method = RequestMethod.GET)
	public String sayHelloWorldAgain(ModelMap model) {
		model.addAllAttributes("Hello This basic mvc application again");
		return "welcome";
	}
	
}
