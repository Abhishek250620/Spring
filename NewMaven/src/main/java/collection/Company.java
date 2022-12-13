package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Company {
	private String companyname;
	private Map<Integer,String> empcodeandname;
	private List<String> empname;
	private Set<Integer> code;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Map<Integer, String> getEmpcodeandname() {
		return empcodeandname;
	}
	public void setEmpcodeandname(Map<Integer, String> empcodeandname) {
		this.empcodeandname = empcodeandname;
	}
	public List<String> getEmpname() {
		return empname;
	}
	public void setEmpname(List<String> empname) {
		this.empname = empname;
	}
	public Set<Integer> getCode() {
		return code;
	}
	public void setCode(Set<Integer> code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", empcodeandname=" + empcodeandname + ", empname=" + empname
				+ ", code=" + code + "]";
	}
	

}
