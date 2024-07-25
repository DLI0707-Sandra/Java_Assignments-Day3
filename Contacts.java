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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
