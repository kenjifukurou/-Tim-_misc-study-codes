package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        MobilePhone myPhone = new MobilePhone();
        Contact xContact = new Contact("ars", "016");
        Contact yContact = new Contact("xyz", "017");
        Contact aContact = new Contact("abc", "011");

        myPhone.addNewContact(xContact);
        myPhone.addNewContact(yContact);
        myPhone.addNewContact(aContact);


        System.out.println(myPhone.findContact("ars"));
        myPhone.printContact();

    }
}
