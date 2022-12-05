package collection;

import java.util.List;

public class ListEmp {
	private int empid;
	private String empname;
	private List<String> projects;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "ListEmp [empid=" + empid + ", empname=" + empname + ", projects=" + projects + "]";
	}

}
