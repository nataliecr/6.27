import java.util.Scanner;

public class Emirp {
  public static void main(String[] args){
    int count = 0, num = 2;
    while (count < 100){
      if (Prime(num) == true && Prime(Reversal(num)) == true
              && Palindrome(num) == false){
        count++;  
        System.out.print(num + " ");
        if (count % 10 == 0)
          System.out.println();
      }  // if palindromic prime
    num++;  
    }  // while
  } // main

  public static boolean Prime(int num){
    for (int divisor = 2; divisor <= num / 2; divisor++) {
      if (num % divisor == 0) { // If true, number is not prime
        return false; 
      } // if
    } // for  
    
    return true;
  } // Prime

  public static int Reversal(int num){
   int temp, reversal = 0;
    while (num != 0){
      temp = num % 10;
      reversal = reversal * 10 + temp;
      num = num / 10;
    } // while
    return reversal;
  } // Reversal
  
  public static boolean Palindrome(int num){
    if (num == Reversal(num))
      return true;
    return false;
  } // Palindrome
  
} // Emirp class
