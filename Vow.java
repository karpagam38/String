import java.util.Scanner;

public class Vow {
	String s=new String();
	int vowals,consonants,digits,space;
	Scanner scan=new Scanner(System.in);
	void getinput()
	{
		System.out.println("Enter the sentence: ");
		s=scan.nextLine();
	}
	void input()
	{
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) 
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				{
				vowals++;
				}
				else if(ch>='a'&&ch<='z') 
				{
					consonants++;
					}
				else if(ch==' ')
					{
					space++;
					}
				else if(ch>='0'&&ch<='9') {
					digits++;
				}}
				}
			
			
	void diplay() {
		System.out.println("LowerCase: "+s);
		System.out.println("vowals: "+vowals);
		System.out.println("consonants: "+consonants);
		System.out.println("space: "+space);
		System.out.println("digits: "+digits);
	}
	}


