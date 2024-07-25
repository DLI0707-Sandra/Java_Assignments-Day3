import java.util.Scanner;

public class AddressBookMain
{
    public static void main(String[] args)
    {

        
        AddressBook addressBook=new AddressBook();
        System.out.println("Welcome to Address Book Program");
        int choice;
        Scanner scannerobject= new Scanner(System.in);
        do {
            System.out.println("1.Add Contact\n2.Edit a contact using name\n3.Delete contacy using name\n4.Add multiple contacts\n5.Exit");
            System.out.println("Enter your choice:");
            choice=scannerobject.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter the contact details:");
                    System.out.println("Firstname:");
                    String firstname=scannerobject.next();
                    System.out.println("Lastname:");
                    String lastname=scannerobject.next();
                    System.out.println("Address:");
                    String address=scannerobject.next();
                    System.out.println("City:");
                    String city=scannerobject.next();
                    System.out.println("State:");
                    String state=scannerobject.next();
                    System.out.println("zip:");
                    int zip=scannerobject.nextInt();
                    System.out.println("Phonenumber:");
                    String  phonenumber=scannerobject.next();
                    System.out.println("Email:");
                    String email=scannerobject.next();
                    Contacts contact=new Contacts(firstname,lastname,address,city,state,email,phonenumber,zip);
                    addressBook.addContact(contact);
                    break;
                case 2:
                    System.out.println("Enter the name of contact to be edited:");
                    break;
                case 3:
                    System.out.println("Enter the name of the contact to be deleted:");
                    break;
                case 4:
                    System.out.println("Enter the number of contacts to be added:");
                    break;
                case 5:
                    System.out.println("Exiting!");
                    break;
                default:
                    System.out.println("Invalid Input!");
            }

        }while(choice!=5);
    }
}
