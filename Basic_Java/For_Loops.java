public class For_Loops {
     For_Loops()
    {

        //For Loop
        /* For Loop: The Statements which executed repeatedly
         */
        for(int i = 0;i<=10;i++)//code for print first 10 digits number
        {
            System.out.print(i+" ");//its print array index
        }
        int sum = 0,j=0;
        for(;j<=10;sum+=j,j++)//Multiple Intialization 
        {
            
        }
        System.out.println(sum); //print addtion of first 10 digits 

        //Infinite Loop
        /* Infinite Loop is created by skipped Test-Expression or update expression which decided loop executed or not 
         *  for(int=i;Test-Expression;update_Expression)
         *  {
         *      //This is infinite loop
         *  }
         * 
         * for( ; ; ;) //There is no any Statement 
         *    {
         *          //This is infinite Loop
         *    }
         */
        
    }

    public static void main(String[]args)
    {
        For_Loops f =new For_Loops();
    }
    
}
