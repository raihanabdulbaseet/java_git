import java.util.*;
class string_revers
{    
public static void main() { 
        Scanner sc= new Scanner(System.in); 
        char c;
         String s;
        System.out.println("Enter the string ");
        s=sc.nextLine();
        String reversedStr = "";    
            
        for(int i=s.length()-1;i>=0;i--){ 
           c= s.charAt(i); 
            reversedStr=reversedStr+c;    
        }    
            
        System.out.println("Original string: " + s);    
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
}    
