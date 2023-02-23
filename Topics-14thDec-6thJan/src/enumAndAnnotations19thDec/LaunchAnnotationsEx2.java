package enumAndAnnotations19thDec;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//19thDec recorded lecture 1st Part --> watched on 06thFeb2023 from 07:13PM onwards

//creating my own annotation
//Target --> 
//Retention Policy -->

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
	//here, @ --> tells complier that it's not an interface but the annotation being created
	
	/*	FIRST WAY --> here default "INDIA" & default 20000 are added later because 
	 * 				  Annotation shows error if not added
	 * 
	 * 		String country() default "INDIA";
	 *		int runs() default 20000;
	 *
	 *
	 *	SECOND WAY --> below shown, country & runs are added in () of CricketPlayer annotation
	 *
	 *		@CricketPlayer(country="INDIA", runs=20000)
	 */

		String country();
		int runs();
	
}

@CricketPlayer(country="INDIA", runs=20000)
class ViratKohli {
	private int innings;
	private String name;
	
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

public class LaunchAnnotationsEx2 {

	public static void main(String[] args) {
	
		ViratKohli vk = new ViratKohli();
		vk.setInnings(300);
		vk.setName("VK");
		
		System.out.println(vk.getInnings());
		System.out.println(vk.getName());

	}

}
