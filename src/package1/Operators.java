package package1;

public class Operators {

	public static void main(String[] args) {
		int a = 50, b= 30, c=0;
		//arithmetic operators
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		//assignment operators
		System.out.println(a+=b); // here the value after calculation gets stored in a
		System.out.println(a-=b); // here the value after calculation gets stored in a
		System.out.println(a*=b); // here the value after calculation gets stored in a
		System.out.println(a/=b); // here the value after calculation gets stored in a
		
		//relational operators
		System.out.println("is a equal to b ? "+(a==b));
		System.out.println("is a greater than b ? "+(a>b));
		System.out.println("is a less than b ? "+(a<b));
		System.out.println("is a greater than or equal to b ? "+(a>=b));
		System.out.println("is a not equal to b ? "+(a!=b));
		
		//logical operator
		System.out.println((a>b) || (a==b));
		System.out.println((a>b) && (a <80));
		System.out.println("the value of logical here is "+!(c==1));
		
		//unary operator
		System.out.println(b++); //post increment
		System.out.println(b);
		System.out.println(++b);// pre increment
		
		//ternary operator
		int d;;
		d=a<b?c:1;
		System.out.println(d);
		String e;
		e= a>b?"a is greatest":"b is greatest";
		System.out.println(e);
	}

}
