public class Array {



    void ArrayDeclaration()
    {
        //Syntax to Declare an Array in Java
        int array [];
        int [] array1;//->>>>  "declaration ""

        //Instantiation of an Array in Java
        //Allocate Size in Array:
        array =new int[25];  //->>>>>> "instantiation"
        array1 = new int[25];


        //declaration and instantiation
        int array3[] = new int[20];
        System.out.print("Size Of Array  array,array1,array3 :"+array.length+" "+array1.length+" "+array3.length+" ");
        /* Advantage :
          i] Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
          ii] Random access: We can get any data located at an index position.
          
          Disadvantages
          i] Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. 
         ii]  To solve this problem, collection framework is used in Java which grows automatically.
        */    

    }

    void typeOfArray()
    {
        //There are two types of array ::
        /*
         * Single Dimensional Array :: Give Single Row or Single Column
         * Multidimensional Array :: Give Multiple Row And Column
         * 
         */

         int a[]= {25,14,26,69,48,5};
         System.out.println();
         System.out.println("Elements in Single Dimension Array :: ");
         for (int i:a) //for each loop
         {
            System.out.print(i+" ");
         }

         //MultiDimensional Array means 2-D,3-D array

         int TwoD_Array [][] =new int[3][3];
         System.out.println("Size Of 2-D Array :: "+TwoD_Array.length);

        



    }
    public static void main(String[] args)
    {

         Array A = new Array();
         A.ArrayDeclaration();
         A.typeOfArray();
    }
    
}
