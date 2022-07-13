public class TypesOfVarible {
    static int a=7318; 
    //Static Varible
    /*
     * A variable that is declared as static is called a static variable. It cannot be local.
     */
    int num =20;
    //instance varible
    /*
     *  A variable declared inside the class but outside the body of the method, is called an instance variable. 
     */
     TypesOfVarible()  //Constructor
     {

        int n = 25;//LocalVarible In Constructor
        System.out.println("Print Local Varible In Constructor :: "+n);
        System.out.println(this.num);
        //'this' is keyword.It is not used in "Main Method".It is used in Function and Constrctor to access instance varible
        
     }
    
     void LocalVarible() 
     {
        String localVarible ="Omkar Ramesh Shelke"; // Local varible
        System.out.println(localVarible);
        //Local Varible
        /* 
         * A variable declared inside the body of the method is called local variable. 
         * You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
         * A local variable cannot be defined with "static" keyword.
         * 
         */
     }

    public static void main(String[]args)
    {
        TypesOfVarible t = new TypesOfVarible(); //create class object to access member of class
        t.LocalVarible(); //  Call LocalVarible using 't' object
        System.out.println(a);// Print Static Keyword
    
    }
        
}







