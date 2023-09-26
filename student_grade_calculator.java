import java.util.Scanner;
public class student_grade_calculator 
{
	    public static void main(String args[])
	    {
	    	Scanner input = new Scanner(System.in);
	    	int tot,avg,m1,m2,m3,m4,m5;
	    	float per;
			System.out.println("Enter The Five Subject Marks :");
			m1 = input.nextInt();
			m2 = input.nextInt();
			m3 = input.nextInt();
			m4 = input.nextInt();
			m5 = input.nextInt();
			tot= m1+m2+m3+m4+m5;
			per= tot/5;
			avg=(m1+m2+m3+m4+m5)/5;
			System.out.println("Total :"+tot);
			System.out.println("Average:"+avg);
			System.out.println("Percentage :"+per);	
			if(per>=90)
				System.out.println("Grade A");
			else if(per>=80)
				System.out.println("Grade B");
			else if(per>=70)
				System.out.println("Grade C");
			else if(per>=60)
				System.out.println("Grade D");
			else if(per>=40)
				System.out.println("Grade E");
			else
				System.out.println("Fail");
		}
	}

			
	        