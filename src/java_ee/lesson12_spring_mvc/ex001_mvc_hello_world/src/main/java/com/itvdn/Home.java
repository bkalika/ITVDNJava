package main.java.com.itvdn;

@Controller
public class Home {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "index";
	}
}
