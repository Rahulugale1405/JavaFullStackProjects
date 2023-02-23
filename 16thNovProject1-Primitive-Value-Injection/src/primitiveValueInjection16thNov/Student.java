package primitiveValueInjection16thNov;

//16thNov recording 1st part - watched on 09thJan2023 from 06:45AM onwards

public class Student {

	//instance variables
	private String name;
	private Integer age;
	private Integer id;
	
	//here generated constructor using source
	//Constructor to set a value & to initialize instance variables
	public Student(String name, Integer age, Integer id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//here generated Setters & Getters using source
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	//here generated toString method using source
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	
}
