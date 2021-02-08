package marsaint.arshiva;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //method to instantiate contact
    public Contact Contact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        return newContact;
    }
}
