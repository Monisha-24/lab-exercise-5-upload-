/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online
                
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex5;

import java.util.Scanner;

/*
 */
public class methodoverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        Bank b;  //reference
        char c;
        do
        {
            System.out.println("1.Press 'A' for Bank_A\n2.Press 'B' for Bank_B\n3.Press 'C' for Bank_C\nEnter your choice:");
            char ch=obj.next().charAt(0);
            switch(ch)
            {
                case 'A':
                    b=new Bank_A();
                    System.out.println("Amount Deposited in Bank_A is: $"+(b.getBalance()));
                    break;
                case 'B':
                    b=new Bank_B();
                    System.out.println("Amount Deposited in Bank_B is: $"+(b.getBalance()));
                    break;
                case 'C':
                     b=new Bank_C();
                     System.out.println("Amount Deposited in Bank_C is: $"+(b.getBalance()));
                     break;
                default:
                     System.out.println("ENTER VALID CHOICE !!");
                     break;
            }    
            System.out.println("==================\nIf you wanna continue press 'y' or 'Y'.... ");
            c=obj.next().charAt(0);
        }while(c=='y' || c=='Y');
        
    }
    
}
class Bank
{
    int getBalance()
    {
        return 0;
    }
}
class Bank_A extends Bank
{
    int getBalance()
    {
        return 1000;
    }
}
class Bank_B extends Bank
{
    int getBalance()
    {
        return 1500;
    }
}
class Bank_C extends Bank
{
    int getBalance()
    {
        return 2000;
    }
}


