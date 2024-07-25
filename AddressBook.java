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

}
