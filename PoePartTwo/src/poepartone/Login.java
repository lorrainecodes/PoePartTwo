/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepartone;

/**
 *
 * @author Student
 */
public class Login extends Registration{
    public boolean loginUser(String name, String password){
        if(name.equals(userName) &&password.equals(passWord)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String returnLoginSatus(boolean loginStatus){
        if(loginStatus){
            return"Login successful. Welcome " + userName + "it is great to see you again";
        }
        else{
            return"Login unsuccessful, please retry by entering the correct username or password";
        }
    }
    
}
