package Recursion;
public class Main {

    static void fun() throws Exception 
{ 
    throw new Exception(); 
} 
public static void main(String args[]) 
{   
    try { 
        fun(); 
    } 
    catch (Exception e) { 
        System.out.print("caught in main."); 
    }
    System.out.print("All is well"); 
}
    // public static void main(String[] args){   
    //     Vehicle obj1 = new Car();
    //     obj1.print();
    
    //     Vehicle obj2 = new Vehicle();
    //     obj2.print();  
    //     }

    // public static void main(String args[]) {
    //     Audi a = new Audi(5,7);
    //     a.Audi();
    //     }   
}
