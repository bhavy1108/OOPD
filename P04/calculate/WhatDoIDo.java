
 

import java.util.*;

public class WhatDoIDo
{

  // Declaring random

Random rand = new Random();

public static void main(String[] args)
{  

// doing a choice for output

int menu,imptnt;

  switch(inputNumber("1-5"))
  {

     case 1:  
        int choice = select1or2("1,2");

    // output a random num from 0  to 10 if user inputs 1

    if(inputNumber("10,100")== 1)

     randomTo10();

   else
   {

     //a random num from 0 to 90 has been taken and adding 10 to it, thus outputting the results

      imptnt=randomTo90add10();

   }

  break;

  case 2:
    // a random number has been taken, it has been multiplied by 42 and added 10 to it and outputting the result

   System.out.println(randomTimes42add42());

  break;
  case 3:
  // a random number has been taken, it has been multiplied by 42 and added 1 to it and outputting the result

   System.out.println(randomTimes42add1());
  break;
  case 4:
       }  

  }
   public static int randomTimes42Add42()
   {

        int num2 = rand.nextInt();

        return((int)(num2*42+42)); 
   }

  public static int randomTimes42Add1()
  {

        int num3 = rand.nextInt();

        return(int)(num3*42+1);
  }


  public static int inputNum(String m)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("number: "+num1);
        return sc.nextInt();

    }

    // the submodule chooses a random number from the range 0 to 10 and outputs the results

   public static void randomTo10()
   {  

       int num1 = rand.nextInt(10);

       System.out.println("number: "+num1);

   }

  // the submodule takes a random number from the range 0 to 90 , adds 10 to it , outputsthe result and returns 0
  public static int randomTo90add10()
  {
        int numx = rand.nextInt(90);
        System.out.println("number: "+(numx+10));
        return 0;
   }
}
}
   
