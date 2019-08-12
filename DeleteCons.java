import java.util.Scanner;

public class DeleteCons {
	String s=new String();
	
	Scanner scan=new Scanner(System.in);
	void getinput()
	{
		System.out.println("Enter the sentance");
		s=scan.nextLine();
	}
	void process()
	{
		s=s.toLowerCase();
		System.out.println("LowerCase: "+s);
		char ch=s.charAt(0);
		String resentence=" ";
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='a'&&s.charAt(i)<='z'&&s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='o'&&s.charAt(i)!='u'&&s.charAt(i)!='i') {
			resentence= resentence +s.charAt(i);
			
			}
		else {
			resentence = resentence +" ";
		}
		
		}
		
		System.out.println(resentence);
		}
	}


