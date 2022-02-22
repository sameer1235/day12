package Day12;

public class StringDemo {

	public static void main(String[] args) {
		///1st sting
		String s = "hello";
		System.out.println("1st String :"+s);
		System.out.println("1st String length :"+s.length());
		
		//2nd string
		String s1 = new String ("World");
		System.out.println("2nd String :"+s1);
		
		//concat 2 string
		String s2 = s.concat(s1);
		System.out.println("concatination of String :"+s2);
		
		//compare string
		if(s==s1){
			System.out.println("String is equal");
		}else{
			System.out.println("String not equals");
		}
	}

}
