import java.util.*;
class Palindrome2
{
 public static void main(String args[])
{
Scanner s =new Scanner(System.in);
int i;
String a;
int n, flag=0;
System.out.println("Enter the string");
a=s.nextLine();
n=a.length();
for(i=0;i<(n-1)/2;i++)
{
if(a.charAt(i)==a.charAt(n-1-i))
{
flag++;
}
else
break;
}
if(flag==(n-1)/2)
{
System.out.println("string is palindrome");
}
else
System.out.println("string is not palindrome");
}
}
