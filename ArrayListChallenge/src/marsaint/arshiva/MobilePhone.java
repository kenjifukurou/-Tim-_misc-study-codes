package marsaint.arshiva;

import java.util.ArrayList;

public class MobilePhone {
    //mobile phone arraylist to store, add, modify contacts
    //the arraylist is use to hold list of Contacts
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    //need to check if the contact already exist
    public void addNewContact(Contact contact) {
        //if found contact
        if (findContact(contact.getName()) >= 0) {
            System.out.println("contact already exist, add contact cancelled");
            return;
        }
        //if not found, add contact
        contactList.add(contact);
        System.out.println("contact added");
    }

    public void updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index <= 0) {
            System.out.println("contact not found");
            return;
        }
        this.contactList.set(index, newContact);
    }

    //return found contact index, private only
    private int findContact(Contact contact) {
        int index = contactList.indexOf(contact);
        return index;
    }

    public int findContact(String contactName) {
        for (int i = 0; i < this.contactList.size(); i++) {
            Contact thisContact = this.contactList.get(i);
            if (thisContact.getName().equals(contactName)) {
                return i; // return found contact index
            }
        }
        return -1;
    }

    public void printContact() {
        for (int i = 0; i < this.contactList.size(); i++) {
            System.out.println(this.contactList.get(i).getName());
        }
    }

}
