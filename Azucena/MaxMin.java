package Activity6;
import java.util.Scanner;

public class MaxMin {
public static void main(String[] args)
{
  int size,max,min;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the size of array");
  size=sc.nextInt();
  int a[]= new int[size]; 
  System.out.println("enter "+size+" numbers");
 
  for(int i=0; i<size; i++){
    a[i]=sc.nextInt();
  }
  max=a[0];
  min=a[0];
  for (int i=0;i<size;i++)
  {
    if (a[i]>max){
      max=a[i];
    }
  }
 
  for (int i=1;i<size;i++)
  {
    if (a[i]<min){
      min=a[i];}
      }
      System.out.println("the maximum value is:"+max);
      System.out.println("the minimum value is:"+min);
}
}
