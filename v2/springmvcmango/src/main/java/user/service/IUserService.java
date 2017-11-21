package user.service;

import java.util.List;

import user.domain.User;

public interface IUserService {
	String deleteById(int id);
	String updateByID(User user);
	String addUser(User user);
	User queryById(int id);
	List<User> getUsersByAge(int age);
}
