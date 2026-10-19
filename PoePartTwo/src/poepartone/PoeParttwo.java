/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepartone;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PoeParttwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login register = new Login();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n=====Register=====");
        
        //Username input and checker
        System.out.println("Please enter your username");
        String name = scan.nextLine();
        
       
        //Password input and checker
        System.out.println("Please enter your password");
        String password = scan.nextLine();
        
        //Cellphone input and checker
        System.out.println("Please enter your cellphone number");
        String cellphone = scan.nextLine();
        
        System.out.println(register.registerUser(name, password, cellphone));
        if(!register.registerstatus(name, password, cellphone)){
            return;
        }
        
        System.out.println("\n======Login=====");
        System.out.println("Enter username: ");
        String loginName = scan.nextLine();
        
        System.out.println("Enter password: ");
        String loginPass = scan.nextLine();
        
        boolean loginSuccess = register.loginUser(loginName, loginPass);
        System.out.println(register.returnLoginSatus(loginSuccess));
        
        Message msg = new Message();
        
         int option;
        do{
           System.out.println("\n======Select any one of the given options below======");
           System.out.println("1. Send message");
           System.out.println("2. Coming soon");
           System.out.println("3. Exit");
           option = scan.nextInt();
           switch(option){
               case 1 -> msg.sendingMessages();
               case 2 -> System.out.println("Coming soon");
               case 3 -> System.out.println("Goodbye!!");
               default -> System.out.println("Invalid option");
           }
        }
        while(option != 3);
        
    }
    
}

        
        
    
     
