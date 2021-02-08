package marsaint.arshiva;

public class Contact {

    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    //method to construct a new Contact with parameters receive from outside
    public static Contact createContact(String name, String phone) {
        return new Contact(name, phone);
    }
}
