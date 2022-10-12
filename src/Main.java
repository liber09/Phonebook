import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> phoneBook = new CaseInsensitiveMap();
        phoneBook.put("Joe Steven", "0380-42312");
        phoneBook.put("Johan Neil", "08-556412");
        phoneBook.put("Leona Williams", "079-3541248");
        phoneBook.put("Michael Daws", "073-88866550");
        phoneBook.put("Walter Swatson", "0922-51000");
        phoneBook.put("Bob Robson", "031-1529632");
        int selection;
        do {
            System.out.println("1.Search PhoneNumber\n2.Add new contact\n0.Exit application");
            selection = input.nextInt();
            input.nextLine();
            switch (selection) {
                case 1:
                    System.out.println("Who do you want to call?");
                    String wantToCall = input.nextLine();
                    String phoneNumber = phoneBook.get(wantToCall);
                    if (phoneNumber == null) {
                        System.out.println("There is no " + wantToCall + " in the PhoneBook!");
                        System.out.println("Do you want to add " + wantToCall + " as a contact?(y/n)");
                        String addContact = input.nextLine();
                        if (addContact.equalsIgnoreCase("y")) {
                            System.out.println("Contact number: ");
                            String number = input.nextLine();
                            phoneBook.put(wantToCall, number);
                        }
                    } else {
                        System.out.println("The PhoneNumber to " + wantToCall + " is " + phoneNumber);
                    }
                    break;
                case 2:
                    System.out.println("Contact name: ");
                    String name = input.nextLine();
                    System.out.println("Contact number: ");
                    String number = input.nextLine();
                    phoneBook.put(name, number);
                    break;
            }
        } while (selection > 0);


    }
}