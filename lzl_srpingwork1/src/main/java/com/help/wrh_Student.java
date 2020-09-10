package wrh_homework;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class wrh_Student {
	private String username; 
	private List<String> hobbies;//list集合
	private Map<String, String> address;//map集合
	private Set<String> aliases;//set集合
	private String[] array;//数组
	/**
	 * 1.使用构造注入
	 * 1.1提供带有参数的有参构造方法。
	 */
	public wrh_Student(String username,List<String> hobbies,Map<String, String> address,Set<String> aliases,String[] array) {
		super();
		this.username=username;
		this.hobbies=hobbies;
		this.address=address;
		this.aliases=aliases;
		this.array=array;
	}
	/**
	 * 2.使用设置注入
	 * 2.1提供默认空参构造方法
	 * 2.2为所有属性提供setter方法
	 */
	public wrh_Student() {
		super(); 
	}
	public void setUsername(String username) {
		this.username=username;
		}
	public void setHobbies(List<String> hobbies) {
		this.hobbies=hobbies;
	}
	public void setAddress(Map<String,String> address) {
		this.address=address;
	}
	public void setAliases(Set <String> aliases) {
		this.aliases=aliases;
	}
	public void setArray(String[] array) {
		 this.array=array;
	}
	public String toString() {
		return "Student[username="+username+",hobbies="+hobbies+",address="+address+",aliases="+aliases+",array="+array+"]";
	}
}

