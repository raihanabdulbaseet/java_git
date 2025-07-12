  /*design a class to overload a function check()
 * as fall....
   i)void check(string str,char ch)-To find and 
               print frequency of the character
               in the string
   ii)void check(string s1)-To display and a  
              word from string after converting
              in head to lower case*/
class overload
{ int i,x;
    char c;
    void check (String str,char ch)
    {
       int l=str.length();
       for(i=0;i<l;i++)
       {
           c=str.charAt(i);
           if (c==ch)
            x=x+1;
        }
    }
    void check (String s1)
    {
    
    }
}