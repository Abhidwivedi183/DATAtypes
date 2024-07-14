import java.util.Scanner;

public class CharracterType{
 public static void main(String[] args) {
  
//Encoding=> means assigning characters in binary
//as like as truth table =>> max variable directly proportional to length of binary code

//in C language 7 bit ASCII encoding done for symbol/character
//but as they have to stored in memory as 8 bit => so 1 bit get useless

//and simply 2^n symbols there are n length bit encoding 
// in 1960 ANSI tells that 128 symbols so 2^7 bits length assign fro encodinga symbol

//i.e called ASCII

//does JAVA follow ASCII???

//ans=>> as there one useless bit get empty =>> so they try to use 1 bit =>> so the length is 8 bit and the symbol cover is 256 bit=>> but we have 128 symbols then later 128 new symbols get discover that called as Iso-latin symbols

//and later many countries have given  thier own codes

//later joe Becker came with unicode 1991
//wit 16 bit concept
//any symbol have to assign 2 bytes
//7129 symbols in 1991 encoded
//2023=>> 149873 => symbols

//note:: java used unicode concept
//java go with UTF(2,4)-16 i.e for its symbol (Unicode Transformation format)

// 2^16 so its range goes to 65,535
//about char data type
//2 byte =>16bits
//reange 0 to 65,535
//symbol 65535

//some imp Ascii
//A=65 to Z = 96
//a = 97 to z = 122
//0-48 to 10-57S
//white space-32


//intialisation
char c= 'a';
char ch = 97;
char x = 0101;
char h = 0x41;


System.out.println(c);

System.out.println(ch);
System.out.println(x);
System.out.println(h);


//char stored in a single quaote
//e.g
// char s = 'c';

//ascii values are the unique values in which it stored in memory

//u have to remember only few

//A=>65 to Z=>90=> A+25 = Z
//a=>90 to z=>122=> a+25 = z

//smalll to large => gap of A+32 = a

//0=>48 to 9=>57

//hw to take char as user input

Scanner sc = new Scanner(System.in);
System.out.print("enter character here::");
char u = sc.next().charAt(0);

//can we convert into thier ascii
//yes =>using type casting by int datatype

System.out.println("its ASCII value is ::" + (int)u);
// enter character here::Y   
// its ASCII value is ::89

sc.close();


 }
}