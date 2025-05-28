import java.util.*;
class MtrixMul
{
public static void main(String args[])
{
int i,j;
Scanner in=new Scanner(System.in);
System.out.println("enter the no of rows in matrixA");
int rowA=in.nextInt();
System.out.println("enter the no of columns of matrixA");
int colA= in.nextInt();
System.out.println("enter the no of rows in matrixB");
int rowB=in.nextInt();
System.out.println("enter the no of columns in matrixB");
int colB=in.nextInt();
if(colA!=rowB)
{
System.out.println("matrix addition not possible");
}
int[][]matrixA=new int[rowA][colA];
int[][]matrixB=new int[rowB][colB];
int[][]result=new int[rowA][colB];
System.out.println("enter the elements in matrixA");
for(i=0;i<rowA;i++)
{
for(j=0;j<colA;j++)
{
matrixA[i][j]=in.nextInt();
}
}
System.out.println("enter the elements of matrixB");

for(i=0;i<rowB;i++)
{
for(j=0;j<colB;j++)
{
matrixB[i][j]=in.nextInt();
}
}
for(i=0;i<rowA;i++)
{
for(j=0;i<colB;i++)
{
result[i][j]=0;
result[i][j]=matrixA[i][j]+matrixB[i][j];
System.out.println("result[i][j] is"+" ");
}
}
System.out.println(" ");
}
}
