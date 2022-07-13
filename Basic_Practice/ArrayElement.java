import java.util.Scanner;
public class ArrayElement {
    
    public static void main(String[] args)
    {
           System.out.print("Size Of Array :: ");

           Scanner sc = new Scanner(System.in);
           int a =sc.nextInt();
           int [] Array = new int[a];
           System.out.print("Enter Elements ::");
           for(int i=0;i<a;i++)
           {
              Array[i]=sc.nextInt();
           }
           System.out.print("Array's Element Are :: "+ " ");
           for(int i=0;i<a;i++)
           {
                      
                   System.out.print(Array[i]+" ");
           }
           sc.close();
    }
}
