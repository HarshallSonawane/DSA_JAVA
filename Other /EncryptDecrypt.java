import java.util.*;
public class EncryptDecrypt {
    
  public static void main(String[] args) {
    
    char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    Scanner s = new Scanner(System.in);
    System.out.println("1. Generate key \n 2. Encrypt Message \n 3. Decrypt Message 4.Exit");
    int ch = s.nextInt();
    System.out.println("Enter your Choice");
    String decmsg="";
    double key=0,enckey=0,deckey=0;
    do{
    switch (ch) {
        case 1:
            key = Math.random();
            System.out.println("Your key is: " +key);
            enckey = key;
            deckey = key;
            break;
        
        case 2:
            System.out.println("Enter plain text to encrypt");
            String plainstr = s.next();
            decmsg = plainstr;
            System.out.println("Do you want to encrypt text!?");
            String ans = s.next();
            if (enckey == key && ans=="yes"){
                for(int i=0;i<key;i++){
                    char temp = letters[i];
                    letters[i] = letters[i+1];
                    letters[i+1] = temp;

                    System.out.println("Your encrypted text:" +letters[i]);
                }

            }
        case 3:
            System.out.println("Enter key for Decryption");
            deckey = s.nextDouble();
            if(deckey == key);{
                System.out.println("DECRYPTED MESSAGE IS: " +decmsg);
            }
    
        default:
            break;
    }
    }while(ch!=4);
}
}