import java.util.Scanner;

public class AddressBookMain
{
    public static void main(String[] args)
    {

        String firstname;
        String lastname;
        String address;
        String city;
        String state;
        int zip;
        String  phonenumber;
        String email;
        Contacts contact;
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
                    firstname=scannerobject.next();
                    System.out.println("Lastname:");
                    lastname=scannerobject.next();
                    System.out.println("Address:");
                    address=scannerobject.next();
                    System.out.println("City:");
                    city=scannerobject.next();
                    System.out.println("State:");
                    state=scannerobject.next();
                    System.out.println("zip:");
                    zip=scannerobject.nextInt();
                    System.out.println("Phonenumber:");
                    phonenumber=scannerobject.next();
                    System.out.println("Email:");
                    email=scannerobject.next();
                    contact=new Contacts(firstname,lastname,address,city,state,email,phonenumber,zip);
                    addressBook.addContact(contact);
                    break;
                case 2:
                    System.out.println("Enter the name of contact to be edited:");
                    String name= scannerobject.next();
                    Contacts oldcontact=addressBook.searchContact(name);
                    System.out.println("Enter the field to be edited:");
                    String field=scannerobject.next();
                    switch (field)
                    {
                        case "firstname":
                                            System.out.println("Enter the new first name:");
                                            firstname=scannerobject.next();
                                            oldcontact.setFirstname(firstname);
                                            break;
                        case "lastname":    System.out.println("Enter the new last name:");
                                            lastname=scannerobject.next();
                                            oldcontact.setLastname(lastname);
                                            break;
                        case "address":     System.out.println("Enter the new address:");
                                            address=scannerobject.next();
                                            oldcontact.setAddress(address);
                                            break;
                        case "city":    System.out.println("Enter the new city:");
                                        city=scannerobject.next();
                                        oldcontact.setCity(city);
                                        break;
                        case "state":   System.out.println("Enter the new state:");
                                        state=scannerobject.next();
                                        oldcontact.setState(state);
                                        break;
                        case "zip":     System.out.println("Enter the new zip:");
                                        zip=scannerobject.nextInt();
                                        oldcontact.setZip(zip);
                                        break;
                        case "email":   System.out.println("Enter the new email:");
                                        email=scannerobject.next();
                                        oldcontact.setEmail(email);
                                        break;
                        case "phonenumber":
                                        System.out.println("Enter the new phone number:");
                                        phonenumber=scannerobject.next();
                                        oldcontact.setPhonenumber(phonenumber);
                                        break;
                    }
                    System.out.println("Contact changed.New values:");
                    System.out.println(oldcontact);
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
