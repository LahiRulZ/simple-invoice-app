import java.io.Console;

public class simpleInvoiceApp{
    public static void main(String[] args) {
       
        Console c = System.console();   //creating console object
        
        String name = c.readLine("Please enter your name: ");   
        char[] pass = c.readPassword("Please enter your password: "); 
        String pass1 = String.valueOf(pass);    //converting char array to string 
        login.auth(name, pass1);
    }
}