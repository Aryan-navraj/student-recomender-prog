import java.util.*;

class Placement
{
 public static void main(String args[])
  {
int n_students;
System.out.println(" How Many students details do you want to enter ? ");
	Scanner scan = new Scanner(System.in);
	n_students = scan.nextInt();
	double subject1[]=new double[n_students];
	double subject2[]=new double[n_students];
	double subject3[]=new double[n_students];
	double subject4[]=new double[n_students];
	double subject5[]=new double[n_students];
	double total[]=new double[n_students];
	String[] S_name = new String[n_students];
	int backlogs[] =  new int[n_students];
	double percentage[] = new double[n_students];
	int[] flag = new int[n_students];
	int pass =0;
	int fail =0;
	for(int i =0 ;i<n_students;++i)
	{
	System.out.println();
	System.out.println("Enter the details for student "+(i+1));
	System.out.print(" NAME - ");
	scan.nextLine();
	S_name[i] =scan.nextLine();
	System.out.println();
	scan.nextLine();
	System.out.println();

			System.out.println("enter the marks for subject 1  (MAX 100)");
		subject1[i]=scan.nextDouble();
			System.out.println("enter the marks for subject 2  ");
		subject2[i]=scan.nextDouble();
			System.out.println("enter the marks for subject 3 ");
		subject3[i] = scan.nextDouble();
			System.out.println("enter the marks for subject 4  ");
		subject4[i] = scan.nextDouble();
			System.out.println("enter the marks for subject 5 ");
		subject5[i] = scan.nextDouble();
	

	
	}
	for(int i =0 ;i<n_students;++i)
	{ backlogs[i]=0;
    total[i] = (subject5[i] + subject4[i] + subject3[i] +subject2[i] +subject1[i]);
     if(subject5[i]<40) backlogs[i]++;
     if(subject4[i]<40) backlogs[i]++;
     if(subject3[i]<40) backlogs[i]++;
     if(subject2[i]<40) backlogs[i]++;
     if(subject1[i]<40) backlogs[i]++;
	percentage[i] = ((total[i]/500)*100);
	}

	System.out.println();
	for(int i =0 ;i<n_students;++i)
	{ if(((backlogs[i] == 0)) && ((percentage[i] >= 60)))
		{flag[i] = 1; pass++;}
	else
		{flag[i] = 0; fail++;}
	}
	if(pass >0)
	{System.out.println("List of Eligible Students are ");
	for(int i =0 ;i<n_students;++i)
	{ if(flag[i] == 1)
		{System.out.println( S_name[i] + " With prcentage");
		System.out.println(percentage[i]);}
	}} if(fail >0)
	{System.out.println("List of Non-Eligible Students are ");
	for(int i =0 ;i<n_students;++i)
	{ if(flag[i] == 0)
		{System.out.println( S_name[i] + " With percentage "+ percentage[i] );
		System.out.println(" With numbers of backlogs = "+ backlogs[i]);}
	}}
		
 }
 
 }
