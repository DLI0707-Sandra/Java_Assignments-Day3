public class Contacts
{
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    int zip;
    String  phonenumber;
    String email;

    public Contacts(String firstname, String lastname, String address, String city, String state, String email, String phonenumber, int zip)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phonenumber = phonenumber;
        this.zip = zip;
    }

    public String toString()
    {
        return firstname+" "+lastname+"\n"+address+"\n"+city+" "+state+"\n"+zip+"\n"+phonenumber+"\n"+email;
    }

//    public static void main(String [] args)
//    {
//        Contacts contact=new Contacts("Sandra","Davis","Emprayil","Pala","Kerala","sandraemprayil@gmail.com","8590527328",686575);
//        System.out.println(contact);
//    }
}
