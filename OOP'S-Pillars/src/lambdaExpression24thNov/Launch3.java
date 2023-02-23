package lambdaExpression24thNov;

interface CLS {
	
	int getLength(String str);
}

//class LOS implements CLS {
//
//	@Override
//	public int getLength(String str) {
//		int length = str.length();
//		return length;
//	}
//	
//}
public class Launch3 {

	public static void main(String[] args) {
		
//		LOS l = new LOS();
//		System.out.println(l.getLength("iNeuron.ai"));				//1st way
		
		
		
//		CLS cls = new CLS() {
//			
//			public int getLength(String str) {						//2nd way
//				return str.length();
//			}
//		};
//		System.out.println(cls.getLength("iNeuron.ai"));
		
		
		CLS cls = str -> str.length();								//3rd way using lambda expression
		System.out.println(cls.getLength("iNeuron.ai"));
	}

}
