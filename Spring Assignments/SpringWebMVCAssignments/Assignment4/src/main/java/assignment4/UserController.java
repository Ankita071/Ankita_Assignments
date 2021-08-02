package assignment4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	@Autowired
	UserModel userModel;

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String registration() {
		return "registration";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(@RequestParam String user, @RequestParam String password, @RequestParam String email,
			ModelMap model) {
		userModel.UserLogin(user, password, email);
		return "login";
	}

	@RequestMapping(path = "/status", method = RequestMethod.POST)
	public String status(@RequestParam String user, @RequestParam String password, ModelMap model) {
		if (userModel.validation(user, password)) {
			return "success";
		} else {
			return "error";
		}
	}
}
