package assignment2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleInterestController {
	@RequestMapping(value = "/simpleInterest")
	public String SimpleInterest() {
		return "simpleInterest";
	}

	@RequestMapping(path = "/index", method = RequestMethod.POST)
	public String index(ModelMap model, @RequestParam double principal, @RequestParam double time, @RequestParam double interest) {
		double SI = principal * interest * time;
		model.addAttribute("SI", SI);
		return "index";
	}
}
