import java.util.Scanner;

public class TypeCasting {
  public static void main(String[] args) {
//Type Csting => conversion of one data type to another

//in java there two type conversion take place
//1.implicit i.e automatic converted by compiler 
//e.g
//i.e when small size to large
byte a = 45;
double b;
b = a;
System.out.println(a);

System.out.println(b);

//advantage:: no data loss here

//when there conversion tak eplace from larger to small i.e forcefully it called a s explicit type-casting and there lost of data (less precision)

double x = 45.5;
short y ;
y = (short)x;


System.out.println(x);
System.out.println(y);


//character type converted into int to double 
// not short because chars have large range


//write a  code  to take  integer typevalue and print its half??
//note:: we know that for odd number it not give int decimal

Scanner sc = new Scanner(System.in);
System.out.print("enter num::");
int n = sc.nextInt();
//so let convert it into double so....

double l = (double) n;
System.out.println("it half is :::"+ l/2);

// enter num::41
// it half is :::20.5

//kuch important baate by raghav sir!!!!!!!!!!!

//jab aap double and double se khelte ho toh answer double aayega
System.out.println(5.0/2.0);//return 2.5

//jab aap int aur int se khelte ho toh answer int mein aata hai
System.out.println(5/2);

//jab aap double or int and int or double toh answer double mein aata hai => double ki aukat jaaa hai....
System.out.println(5.0/2);//return 2.5

System.out.println(5/2.0);//return 2.5








sc.close();
  }
}
