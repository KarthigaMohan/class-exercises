import java.time.*;
import java.util.*;

class x extends Exception


{	
	
	void operation(String str)
	{
		LocalDate dob=LocalDate.parse(str);
		LocalDate now=LocalDate.now();

		int n=Period.between(dob,now).getYears();
		System.out.println("Years:"+n);

		System.out.println("Months:"+Period.between(dob,now).getMonths());

		System.out.println("Days:"+Period.between(dob,now).getDays());


		if (n<18)
		{	x obj=new x();
			throw obj;

		}
		System.out.println("Age is above 18");


	}

	public static void main(String args[])
	{

		try{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your DOB in yyyy-mm-dd format:");
		String str=s.next();
		x s2=new x();
		s2.operation(str);

	
		/*LocalDate dob=LocalDate.parse(str);
		LocalDate now=LocalDate.now();

		int n=Period.between(dob,now).getYears();
		System.out.println("Years:"+n);

		System.out.println("Months:"+Period.between(dob,now).getMonths());

		System.out.println("Days:"+Period.between(dob,now).getDays());


		if (n<18)
		{	Test1 obj=new Test1();
			throw obj;

		}
		System.out.println("Age is above 18");*/
		//}
	}

		catch(x obj)
		{System.out.println("Underage");
		obj.printStackTrace();
		}
		
	}

	/*catch(x obj)
		{System.out.println("Underage");
		obj.printStackTrace();
		}*/

	

	

}
