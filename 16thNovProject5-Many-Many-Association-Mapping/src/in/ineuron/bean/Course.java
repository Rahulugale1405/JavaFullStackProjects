package in.ineuron.bean;

//16thNov recording 2nd part from 02:11 mins of video - watched on 09thJan2023 from 11:39PM onwards

//Dependent Object
public class Course {

	String cid;
	String cname;
	int ccost;
	
	//Constructor Injection using source option on right click
	public Course(String cid, String cname, int ccost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccost = ccost;
	}
	
	
}
