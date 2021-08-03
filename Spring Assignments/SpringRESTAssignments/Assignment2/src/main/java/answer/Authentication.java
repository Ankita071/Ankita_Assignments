package answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class Authentication {
	@Autowired
	validation validation;

	@RequestMapping("/user")
	public String getvalidation(@RequestParam("name") String name, @RequestParam("password") String password) {
		validation.setUserName("abc");
		validation.setPassword("dummy");

		if (((answer.validation) validation).getUserName().equalsIgnoreCase(name) && validation.getPassword().equalsIgnoreCase(password))
			return "valid user";
		else
			return "invalid user";

	}
}