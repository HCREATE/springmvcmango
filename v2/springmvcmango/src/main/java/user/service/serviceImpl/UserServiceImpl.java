package user.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.dao.UserDao;
import user.domain.User;
import user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	//User�����
	
	@Autowired
	private UserDao userDao;
	//��������ID��ɾ��
	public String deleteById(int id) {
		if(1==userDao.deleteById(id)){
			return "success";
		}else{
			return "false";
		}
	}
	//��������ID������
	public String updateByID(User user) {
		if(1==userDao.updateById(user)){
			return "success";
		}else{
			return "false";
		}
	}
	//���
	public String addUser(User user) {
		if(1==userDao.addUser(user)){
			return "success";
		}else{
			return "false";
		}
	}
	//��������ID����ѯ
	public User queryById(int id) {
		return userDao.queryById(id);
	}
	//������������ѯ
	public List<User> getUsersByAge(int age) {
		return userDao.getUsersByAge(age);
	}

}
