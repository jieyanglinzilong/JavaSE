package wrh_homework;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class wrh_Student {
	private String username; 
	private List<String> hobbies;//list����
	private Map<String, String> address;//map����
	private Set<String> aliases;//set����
	private String[] array;//����
	/**
	 * 1.ʹ�ù���ע��
	 * 1.1�ṩ���в������вι��췽����
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
	 * 2.ʹ������ע��
	 * 2.1�ṩĬ�Ͽղι��췽��
	 * 2.2Ϊ���������ṩsetter����
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

