package package1;

public class Swap {

	public static void main(String[] args) {
		int a = 30,b=20, temp=0;//with variables
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println("the value of a and b is "+ a  + b);
		
		int c= 100,d=30;//without variables
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(c);
		System.out.println(d);

	}

}
