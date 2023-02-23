package in.ineuron.bean;

//16thNov recording 2nd part from 01:51 mins of video - watched on 09thJan2023 from 11:18AM onwards

//Target Object
public class Student {

	private String sid;
	private String sname;
	private String saddr;
	
	//HAS-A variable
	Branch branch;

	//Using setters & getters from source
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
}
