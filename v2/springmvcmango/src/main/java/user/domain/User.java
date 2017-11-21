package user.domain;

import java.util.Date;
//UserÊµÌå
public class User {
	 	public User() {
			super();
		}
	    
		public User(int id, String name, int age, boolean gender, Long money,
				Date updateTime) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.money = money;
			this.updateTime = updateTime;
		}

		private int id;
	    private String name;
	    private int age;
	    private boolean gender;
	    private Long money;
	    private Date updateTime;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isGender() {
			return gender;
		}
		public void setGender(boolean gender) {
			this.gender = gender;
		}
		public Long getMoney() {
			return money;
		}
		public void setMoney(Long money) {
			this.money = money;
		}
		public Date getUpdateTime() {
			return updateTime;
		}
		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}

		
	    

}
