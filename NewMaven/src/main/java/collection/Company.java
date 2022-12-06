package collection;

import java.util.Map;

public class Company {
	private String companyname;
	private Map<Integer,String> empcodeandname;
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
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", empcodeandname=" + empcodeandname + "]";
	}

}
