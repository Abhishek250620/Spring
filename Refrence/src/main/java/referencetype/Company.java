package referencetype;

public class Company {
private String Cname;
private String CLoacation;
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public String getCLoacation() {
	return CLoacation;
}
public void setCLoacation(String cLoacation) {
	CLoacation = cLoacation;
}
@Override
public String toString() {
	return "Company [Cname=" + Cname + ", CLoacation=" + CLoacation + "]";
}
}
