import java.util.*;
class kite_bill
{
public static void main ()
{
Scanner sc = new Scanner(System.in);
int a,b,c,d,e,f,g,h,i,j,k,sk,poti,soic,sou,rajb,rajic,raju,tap,chi,sak,will,co,bag;
System.out.println("S.K.Asgar Nawab no:1");
sk= sc.nextInt();
a=55*sk;
System.out.println("Ustad Pottis no:2");
poti = sc.nextInt();
b=60*poti;
System.out.println("Sonic no:3");
soic= sc.nextInt();
c=50*soic;
System.out.println("Sonic Special no:4");
sou= sc.nextInt();
d=60*sou;
System.out.println("Rajeev unique no:5");
rajb= sc.nextInt();
e=60*rajb;
System.out.println("Rajeev unique special no:6");
rajic= sc.nextInt();
f=90*rajic;
System.out.println("Raju tiger no:7");
raju= sc.nextInt();
g=48*raju;
System.out.println("Ustad tapan no:8");
tap= sc.nextInt();
h=50*tap;
System.out.println("Chintu Craft no:9");
chi= sc.nextInt();
i=48*chi;
System.out.println("Sakil Ansari no:10");
sak= sc.nextInt();
j=150*sak;
System.out.println("Ustad Welliam no:11");
will= sc.nextInt();
k=60*will;
System.out.println("Courier charge");
co=sc.nextInt();
System.out.println("bag price");
bag=sc.nextInt();
if(a>0)
System.out.println("price of S.K.Asgar Nawab= "+a+"/-");
if(b>0)
System.out.println("price of Ustad Pottis= "+b+"/-");
if(c>0)
System.out.println("price ofSonic= "+c+"/-");
if(d>0)
System.out.println("price ofSonic Special="+d+"/-");
if(e>0)
System.out.println("price of Rajeev unique= "+e+"/-");
if(f>0)
System.out.println("price of Rajeev unique special= "+f+"/-");
if(g>0)
System.out.println("price of Raju tiger= "+g+"/-");
if(h>0)
System.out.println("price of Ustad tapan= "+h+"/-");
if(i>0)
System.out.println("price of Chintu Craft= "+i+"/-");
if(j>0)
System.out.println("price of Sakil Ansari= "+j+"/-");
if(k>0)
System.out.println("price of Ustad Welliam= "+k+"/-");
if(co>0)
System.out.println("Courier charge= "+co+"/-");
if(bag>0)
System.out.println("bag price= "+bag+"/-");
System.out.println("total price= ₹"+(a+b+c+d+e+f+g+h+i+j+k+bag+co)+"/-");
}
}