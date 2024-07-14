public class RealNo {
  public static void main(String[] args) {
    
//two type of Data used to store real no in Ram
//1.float=> store 4 bytes => 16 bits => store in memory as  IN IEE-754 format(single precission => coa wala)
//2.double => store 8 byte=> 64 bits => store in memory as  IN IEE-754 format(double precission => coa wala)

//float a = 27.47f;
//here f at last indicate that real number merged with any float number
//

//why two data types provided to handle real number???
//as they store real number 
//either small or large
//float data type have low precision than Double data type
//that double is more preffered to use...(52 bits in pocket)

//but both lost precision
double a = 7.0002346663635463627;
float b = 65.434434343f;//in that case of float u have to use 'f' at last either it error 

System.out.println(a);
System.out.println(b);



//there 3 notataion used 
// 1.Standard Notataion
//2.Scientific Notation(e/E)

float c = 6.54e1f;//+ve sign expo doesnt need to go for sign
//but it is must in -ve expo to express it
float d = 5.45E-1f;

System.out.println(c);
System.out.println(d);

//Range of float=>+- 3.4e38;
//Range of double=>+-7e308;

double x = 45.65D;//here D is optional in double datatype
System.out.println(x);

//but if u try to store double to float u surely get error 
// float s = 45.56D;




  }
}
