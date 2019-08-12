
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBOperation {
	int Mark1,Mark2,Mark3,Mark4,Mark5,Total;
	Double Average;
	Char Grade;
	public void displaystudentdetails()
	{
		//Total=Mark1+Mark2+Mark3+Mark4+Mark5;
        //Average=Total/5;
        
		try
		
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jbdc:mysql://localhost:3306/gridb","root","");
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery("SELECT*FORM student_master");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" ");
				System.out.println(rs.getInt(2)+" ");
				System.out.println(rs.getInt(3)+" ");
				System.out.println(rs.getInt(4)+" ");
				System.out.println(rs.getInt(5)+" ");
				System.out.println(rs.getInt(6)+" ");
				System.out.println(rs.getInt(7)+" ");
				System.out.println(rs.getInt(8)+" ");
				System.out.println(rs.getInt(9)+" ");
				System.out.println(rs.getInt(10)+" ");
				
				//Total=Mark1+Mark2+Mark3+Mark4+Mark5;
				
				int RegNo= rs.getInt(1);
				String SName=rs.getString(2);
				int Mark1=rs.getInt(3);
				int Mark2=rs.getInt(4);
				int Mark3=rs.getInt(5);
				int Mark4=rs.getInt(6);
				int Mark5=rs.getInt(7);
				int Total=rs.getInt(8);
				double Average=rs.getDouble(9);
				if(Total>=450)
				{
				System.out.println("A Grade");
				
				}
				else if(Total>=400)
				{System.out.println("B Grade");}
				else if(Total>=350)
				{System.out.println("C Grade");}
				else
				{System.out.println("D Grade");}
				//char Grade=(char) rs.getByte(10);
				}
		}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		
	
		 }
	public void insertsudentdetails()
	{
		
		Scanner scan=new Scanner(System.in);
		
		
		
		System.out.println("Enter the RegNo: ");
		int RegNo=scan.nextInt();
		
		System.out.println("Enter the StudentName: ");
		String StudentName=scan.next();
		
		System.out.println("Enter the Mark1: ");
		int Mark1=scan.nextInt();
		
		System.out.println("Enter the Mark2: ");
		int Mark2=scan.nextInt();
		
		System.out.println("Enter the Mark3: ");
		int Mark3=scan.nextInt();
		
		System.out.println("Enter the Mark4: ");
		int Mark4=scan.nextInt();
		
		System.out.println("Enter the Mark5: ");
		int Mark5=scan.nextInt();
		
		Total=Mark1+Mark2+Mark3+Mark4+Mark5;
        Average=Total/5;
		System.out.println("Total: "+Total);
		
		System.out.println("Average: "+Average);
		
		if(Average>=450)
		{
		System.out.println("A Grade");
		
		}
		else if(Total>=400)
		{System.out.println("B Grade");}
		else if(Total>=350)
		{System.out.println("C Grade");}
		else
		{System.out.println("D Grade");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jbdc:mysql://localhost:3306/gridb","root","");
			Statement sts=con.createStatement();
			int status=sts.executeUpdate("INSET INTO student_master VALUES("+RegNo+","+StudentName+","+Mark1+","+Mark2+","+Mark3+","+Mark4+","+Mark5+","+Total+","+Average+","+Grade+")");
		if(status!=-1)
			{
			System.out.println("Inserted successful");}
		else
		{
			System.out.println("Inserted Failed");
		}
			}
		
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	}}
