package user.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.dao.UserDao;
import user.domain.User;
import user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	//User服务层
	
	@Autowired
	private UserDao userDao;
	//根据主键ID来删除
	public String deleteById(int id) {
		if(1==userDao.deleteById(id)){
			return "success";
		}else{
			return "false";
		}
	}
	//根据主键ID来更新
	public String updateByID(User user) {
		if(1==userDao.updateById(user)){
			return "success";
		}else{
			return "false";
		}
	}
	//添加
	public String addUser(User user) {
		if(1==userDao.addUser(user)){
			return "success";
		}else{
			return "false";
		}
	}
	//根据主键ID来查询
	public User queryById(int id) {
		return userDao.queryById(id);
	}
	//根据年龄来查询
	public List<User> getUsersByAge(int age) {
		return userDao.getUsersByAge(age);
	}

}
