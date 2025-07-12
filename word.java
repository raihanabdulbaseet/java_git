import java.util.*;
class word
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,st="",d="";
        int l,i,j,y=0,x=0,po=0,p=0;
        char c;
        
        System.out.println("ENter the sentence");
        s=sc.nextLine();
        s=s.toUpperCase();
        l=s.length();
        
            for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                if(c==' ' || c=='?' || c=='!')
                x=x+1;
            }
            System.out.println("No of words = "+ x);
            String wd[] = new String [x];
            int pt[]=new int [x];
            for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                if(c!=' ' && c!='?' && c!='!')
                {
                p=p+(int)c;
                st=st+c;
            }
            else
            {
                System.out.println(st + "=" +p);
                wd[y]=st;
                pt[y]=p;
                st="";
                p=0;
                y=y+1;
            }
            }
            
            for(i=0;i<x-1;i++)
            {
                for(j=i+1;j<x;j++)
                {
                    if(pt[i]<pt[j])
                    {
                        po=pt[i];
                        pt[i]=pt[j];
                        pt[j]=po;
                        d=wd[i];
                        wd[i]=wd[j];
                        wd[j]=d;
                        
                    }
                }
            }
            for(i=0;i<x;i++)
            System.out.print(wd[i]+" ");
           
        }
    }
