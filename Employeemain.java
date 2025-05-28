import java.util.*;
class Employee
{
String Name;
int age;
String Phno;
String Address;
double Salary;
Employee(String Name,int age, String Phno,String Address,double Salary)
{
this.Name=Name;
this.age=age;
this.Address=Address;
this.Phno=Phno;
this.Salary=Salary;
}
void PrintSalary()
{
System.out.println("Salary of"+Name+"is:"+Salary);
}
}
class Officer extends Employee
{
String Specialization;
Officer(String Name,int age,String Phno ,String Address,double Salary,String Specialization)
{
super(Name,age,Phno,Address,Salary);
this.Specialization=Specialization;
}
void PrintOfficerDetails()
{
System.out.println("officer details");
System.out.println("Name:"+Name);
System.out.println("Age:"+age);
System.out.println("Phno:"+Phno);
System.out.println("Address:"+Address);
System.out.print("Specialization:"+Specialization);
PrintSalary();
}
}
class Manager extends Employee
{
String Department;
Manager(String Name,int age,String Phno,String Address,double Salary,String Department)
{
super(Name,age,Phno,Address,Salary);
this.Department=Department;
}
void PrintManagerDetails()
{
System.out.println("manager details:");
System.out.println("Name:"+Name);
System.out.println("Age:"+age);
System.out.println("Phno:"+Phno);
System.out.println("Address:"+ Address);
System.out.println("Department:"+Department);
PrintSalary();
}
}
class Employeemain
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the details for officer");
System.out.println("enter name");
String officerName=s.nextLine();
System.out.println("enter age");
int officerage=s.nextInt();
s.nextLine();
System.out.println("enter PhoneNumber");
String officerPhno=s.nextLine();
System.out.println("enter Address");
String officerAddress=s.nextLine();

System.out.println("enter Salary");
double officerSalary=s.nextDouble();
s.nextLine();
System.out.println("enter specialization");
String officerSpecialization=s.nextLine();
Officer officer= new Officer(officerName,officerage,officerPhno, officerAddress, officerSalary, officerSpecialization);

System.out.println("Enter the details for manager");
System.out.println("enter name");
String managerName=s.nextLine();
System.out.println("enter age");
int managerage=s.nextInt();
s.nextLine();
System.out.println("enter PhoneNumber");
String managerPhno=s.nextLine();
System.out.println("enter Address");
String managerAddress=s.nextLine();

System.out.println("enter Salary");
double managerSalary=s.nextDouble();
s.nextLine();
System.out.println("enter specialization");
String managerDepartment=s.nextLine();
Manager manager= new Manager(managerName,managerage,managerPhno, managerAddress, managerSalary, managerDepartment);
System.out.println("\n Officer information");
officer.PrintOfficerDetails();
System.out.println("\n Manager information");
manager.PrintManagerDetails();
s.close();
}
}
















