package package1;

public class Problems {

	public static void main(String[] args) {
		//to check if 2 numbers are equal
		int a =23,b=45;
		System.out.println("is a equal to be ?"+(a==b));
		
		//prob 2
		int c=55,d = 70;
		System.out.println((c<50) && (c<d));
		
		//prob 3 to get second digit
		int e=175,f=0;
		f=e%100; // e-(e/10)*10 = 17-(17/10)*10 = 17 - (1)*10 = 7
		System.out.println(f);
		

	}

}
