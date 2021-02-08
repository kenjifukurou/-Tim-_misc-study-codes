package marsaint.arshiva;

import java.util.ArrayList;

public class Mobile {

    private String thisPhoneNumber;
    private ArrayList<Contact> contactList;

    // a constructor that will create new arrayList when initiated
    public Mobile(String thisPhoneNumber) {
        this.thisPhoneNumber = thisPhoneNumber;
        this.contactList = new ArrayList<Contact>();
    }

    public boolean printContact() {
        if (contactList.isEmpty()) {
            System.out.println("contact list is empty");
            return false;
        }
        for (int i = 0; i < contactList.size(); i++) {
            String name = contactList.get(i).getName();
            String phone = contactList.get(i).getPhone();
            System.out.println("Contact: " + name + " -> " + phone);
        }
        return true;
    }

    public boolean addContact(Contact contact) {
//        check if name existed, name only
        if (findContactByName(contact.getName()) >= 0) {
            System.out.println("match found, " + contact.getName() + " already in file");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int oldContactPosition = findContact(oldContact);
        if (oldContactPosition >= 0) {
            contactList.set(oldContactPosition, newContact);
            System.out.println("contact " + newContact.getName() + " has been updated");
            return true;
        }
        System.out.println("old contact not found");
        return false;
    }

    public boolean removeContact(Contact contact) {
        int contactPosition = findContact(contact);
        if (contactPosition >= 0) {
            contactList.remove(contactPosition);
            System.out.println(contact.getName() + " has been removed");
            return true;
        }
        System.out.println("contact not in list");
        return false;
    }

    private int findContact(Contact contact) {
        int contactPosition = contactList.indexOf(contact);
        return contactPosition;
    }

    private int findContactByName(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            String contactName = contactList.get(i).getName();
            if (contactName.equals(name)) {
                return i;
            }
        }
        System.out.println(name + " not found");
        return -1;
    }

    public String queryContact(Contact contact) {
        // check contact info: name and phone
        if (findContact(contact) >= 0) {
            String name = contact.getName();
            String phone = contact.getPhone();
            return "Contact: " + name + " -> " + phone;
        }
        System.out.println("contact not found");
        return null;
    }

    public Contact queryContactByName(String name) {
        int contactPosition = findContactByName(name);
        if (contactPosition >= 0) {
            System.out.println("contact found");
            Contact foundContact = contactList.get(contactPosition);
            System.out.println(queryContact(foundContact));
            return foundContact;
        }
        return null;
    }
}
