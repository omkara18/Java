class Variable

{
    public static void main(String[]args)
    { 
        String name= "Omkar";
        int age=25; 
        String phoneNumber="7378415015";
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Phone Number:"+phoneNumber);
        //Variables are containers for storing data values like integear,string,float etc.
        /*
           1) String - stores text, such as "Hello". String values are surrounded by double quotes
           2) int - stores integers (whole numbers), without decimals, such as 123 or -123
           3) float - stores floating point numbers, with decimals, such as 19.99 or -19.99
           4)char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
           5) boolean - stores values with two states: true or false 
        */
        final int pinCode= 414302; 
        System.out.println("Pincode:"+pinCode);
       //use the final keyword:which means unchangeable and read-only): (this will declare the variable as "final" or "constant") 
    }
}

// Rule For Varible:
/*
- All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
- After the first character, identifiers can have any combination of characters.
- A keyword cannot be used as an identifier.
- Most importantly, identifiers are case sensitive.
- Examples of legal identifiers: age, $salary, _value, __1_value.
- Examples of illegal identifiers: 123abc, -salary.
 */