package user.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import user.domain.User;
import user.service.IUserService;

@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class UserController {
	//user¿ØÖÆÆ÷²ã
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/delete")
	public @ResponseBody String deleteById(int id){
		return userService.deleteById(id);
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public @ResponseBody String updateById(User user){
		if (0!=user.getId()){
			return userService.updateByID(user);
		}else{
			return userService.addUser(user);
		}
	}
	@RequestMapping("/queryById")
	public @ResponseBody User queryById(int id){
		return userService.queryById(id);
	}
	@RequestMapping("/queryByAge")
	public @ResponseBody List<User> queryByAge(int age){
		return userService.getUsersByAge(age);
	}
}
