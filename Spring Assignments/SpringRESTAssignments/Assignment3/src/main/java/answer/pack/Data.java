package answer.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Data {
	@Autowired
	addresssInterface addressInterface;
	
	@GetMapping("/info")
	public Address predict(@RequestParam("zipcode") String jsonData) {
		
		return addressInterface.data(jsonData);
		
	}
}
