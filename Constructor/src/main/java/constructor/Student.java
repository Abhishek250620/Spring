package constructor;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<String> subject;
	public Student(int id, String name, List<String> subject) {
		this.id = id; 
		this.name = name;
		this.subject = subject;
	}
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
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
}
