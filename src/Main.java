import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Joe Steven","0380-42312");
        phoneBook.put("Johan Neil","08-556412");
        phoneBook.put("Leona Williams","079-3541248");
        phoneBook.put("Michael Daws","073-88866550");
        phoneBook.put("Walter Swatson","0922-51000");
        phoneBook.put("Bob Robson","031-1529632");

        System.out.println("Who do you want to call?");
        String wantToCall = input.nextLine();
        String phoneNumber = phoneBook.get(wantToCall);
        if(phoneNumber.equals(null)){
            System.out.println("There is no "+wantToCall+" in the PhoneBook!");
        }else{
            System.out.println("The PhoneNumber to "+wantToCall+" is "+phoneNumber);
        }

    }
}