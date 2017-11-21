package springmvcmango;

import java.util.Date;
import java.util.List;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import user.dao.UserDao;
import user.domain.User;
import user.service.IUserService;

public class UserTset {
	
	
	
	
	public static void main(String[] args){
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:/spring/spring-context.xml");
		
		//IUserService userService=ac.getBean(IUserService.class);
		//userService.deleteById(1);
		UserDao userDao=ac.getBean(UserDao.class);
		System.out.println(userDao.deleteById(22));
		//User user =new User(10,"pony",22,true,(long)12345,new  Date());
		//System.out.println(userDao.updateUser(user));
		
		//System.out.print(userDao.addUser(user));
		/*List<User> users=userDao.getUsersByAge(12);
		System.out.println(users);*/
	}

}
