package enumAndAnnotations19thDec;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//19thDec recorded lecture 1st Part --> watched on 06thFeb2023 from 09:39PM onwards

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer1 {
	//here, @ --> tells complier that it's not an interface but the annotation being created
	
		String country() default "INDIA";
	 	int runs() default 20000;
	
}

@CricketPlayer1()
class ViratKohli1 {
	private int innings;
	private String name;
	
	@CricketPlayer1
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class LaunchAnnotationsEx3 {

	public static void main(String[] args) {
	
		ViratKohli1 vk = new ViratKohli1();
		vk.setInnings(300);
		vk.setName("VK");
		
		System.out.println(vk.getInnings());
		System.out.println(vk.getName());
		
		System.out.println("====================1=====================");
		
		Class c = vk.getClass();
		Annotation ann = c.getAnnotation(CricketPlayer1.class);
		CricketPlayer1 cp = (CricketPlayer1) ann;
		int run = cp.runs();
		System.out.println(run);
		String cn = cp.country();
		System.out.println(cn);
		
	}

}
