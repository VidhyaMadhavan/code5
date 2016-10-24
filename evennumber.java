import java.io.*;
import java.util.*;
class evennumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
 
int n1,n2,count=0;
System.out.println("Enter first interval:");
n1=sc.nextInt();
System.out.println("Enter second interval:");
n2=sc.nextInt();
for(int i=n1;i<=n2;i++)
{
if(i%2==0)
{
System.out.println(i);
}
else
{
count++;
}
}
}
}

