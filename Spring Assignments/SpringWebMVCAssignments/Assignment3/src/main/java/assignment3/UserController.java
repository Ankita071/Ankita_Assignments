package assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@Autowired
	private UserModel userModel;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	

	@RequestMapping(path = "/status", method = RequestMethod.POST)
	public String status(ModelMap map, @RequestParam String name, @RequestParam String email, @RequestParam String password) {
		if (userModel.validation(name, email,  password)) {
			return "success";
		}
		return "error";
	}
}
