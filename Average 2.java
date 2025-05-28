import java.util.*;
class AverageException extends Exception
{
AverageException(String msg)
{
super(msg);
}
}
class Average
{
public static void main(String args[])
{
try{
int[] a=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("enter the no of elements");
int n=s.nextInt();
System.out.println("enter the numbers one by one");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
float average=0;
for(int i=0;i<n;i++)
{
average=average+a[i];
}
average=average/n;
System.out.println("Average is "+ Average);
if(average>50)
 throw new AverageException("average is greater than 50");
}
catch (AverageException e)
{
System.out.println("Average exception");
}
}
}
