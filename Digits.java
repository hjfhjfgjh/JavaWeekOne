/*Aydensantiago
Digits.java
 will recite all three digits of the three digit number*/
 import java.util.Scanner;or
 import java.util.*;
 public class Digits {






public Static main (String[]args){
int number;
int ones;
int tens;
int hundreds;
Scanner input = new scanner(System.in);

System.out.println("Enter a 4 digit number")
number =input.nextInt();
/* number = 258; */
ones=number%10;
tens=(number/10)%10;
hundreds=(number/10)%10)%10;
thousands=(number/10)/10)/10)%10);
System.out.println("your first digit is " + ones+"your second digit is"+ tens + "your third digit is" + hundreds+"your fourth digit is " + thousands);

}
