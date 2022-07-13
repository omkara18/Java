import java.util.Scanner;
class ArrayAssigntment
{


    void averageSalary()
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number Of Employee ::  ");
        n=sc.nextInt();
        double [] Salary = new double[n];
        double sum=0;
        System.out.print("Enter Employee Salary :: ");
        for(int i=0;i<n;sum+=Salary[i],i++)
        {
            Salary[i]=sc.nextInt();
        }
        double avg =sum/n;
        System.out.println("Average Salary Of Employee :: "+avg);
        int cnt=0;
        int cnt1=0;
        for(int i=0;i<n;i++)
        {
            if(Salary[i]>avg)
            {
                cnt++;
                continue;
            }
            if(Salary[i]<avg)
            {
                cnt1++;
                continue;
            }
        }
        
        System.out.println("The number of employyes having salary greater than average::"+cnt);
        System.out.println("The number of employyes having salary less than average::"+cnt1);
        sc.close();
    }

       public static void main(String[] args)
       {
             ArrayAssigntment a = new ArrayAssigntment();
             a.averageSalary();
       }
}