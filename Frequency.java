import java.util.*;
class Frequency
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a string");
String a = s.nextLine();
System.out.println("enter a character");
char ch=s.nextLine().charAt(0);
int i,count=0;
for(i=0;i<a.length();i++)
{
if(a.charAt(i)==ch)
{
count++;
}
}
System.out.println("count of occurence "+ch+"="+count);
}
}
