import java.util.ArrayList;

public class AddressBook
{

    ArrayList<Contacts> contacts = new ArrayList<>();

    public void addContact(Contacts contact)
    {
        contacts.add(contact);
    }

    public Contacts searchContact(String name)
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            if (contacts.get(i).firstname.equals(name))
            {
                return contacts.get(i);
            }
        }
        return null;
    }

    public void deleteContact(String name)
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            if (contacts.get(i).firstname.equals(name))
            {
                contacts.remove(i);
                break;
            }
        }
    }

    public void displayContacts()
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            System.out.println("Contact "+(i+1)+":");
            System.out.println(contacts.get(i));
        }
    }
}
