import java.util.Scanner;
public class FirstJavaProj 
{	Scanner s;
	int regno;
	String name, address;
	void input()
	{	s=new Scanner(System.in);
		System.out.println("Enter Regno of the student:");
		regno=s.nextInt();
		System.out.println("Enter the Name of the student:");
		name=s.next();
		System.out.println("Enter the Address of the student:");
		address=s.next();
	}
	void compute()
	{	System.out.println("Reg No is:"+regno);
		System.out.println("Name is:"+name);
		System.out.println("Address is:"+address);
	}
	public static void main(String[] args) 
	{	FirstJavaProj fp=new FirstJavaProj();
		fp.input();
		fp.compute();		
	}
}
