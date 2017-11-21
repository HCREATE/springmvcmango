package user.dao;

import java.util.List;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;

import user.domain.User;

//user³Ö¾Ã²ã
@DB
public interface UserDao{

	  @SQL("insert into user(id, name, age, gender, money,update_time) values "+
			  "(:id, :name, :age, :gender, :money, :updateTime)")
	  int addUser(User user);
	  @SQL("update user set name=:name, age=:age, gender=:gender, " +
		        "money=:money, update_time=:updateTime where id=:id")
	  int updateById(User user);
	  @SQL("delete from user where id=:1")
	  int deleteById(int id);
	  @SQL("select id, name, age, gender, money, update_time from user where id=:1")
	  User queryById(int id);
	  @SQL("select id, name, age, gender, money, update_time from user where age=:1 order by id")
	  List<User> getUsersByAge(int age);

	 
	  
}