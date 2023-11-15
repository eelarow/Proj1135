package OOP2.phoneContact;

import java.util.Arrays;

public class PhoneBook {
    private Contact[] contacts;

    public PhoneBook(int capacity) {
        this.contacts = new Contact[capacity];
    }
    public boolean addContact(Contact obj)
    {
        if (obj == null){
            System.out.println("Error Can not add Contact");
            return false;
        }
        if (this.findContact(obj.getFullName()) != null){
            return false;
        }
        for (int i = 0 ; i < contacts.length ;i++){
            if(this.contacts[i] ==null){
                this.contacts[i] = obj;
                return true;
            }
        }
        return  false;
    }

    public boolean addContact(int i,Contact obj)
    {
        if (obj == null){
            System.out.println("Error Can not add Contact");
            return false;
        }
        if (this.findContact(obj.getFullName()) != null){
            return false;
        }
        if (i < 0 || i > this.contacts.length -1)
            return false;

        this.contacts[i] = obj;
        return true;

        }
    public boolean deContact(int i)
    {

        if (i < 0 || i > this.contacts.length -1)
            return false;

        this.contacts[i] = null;
        return true;

    }

    public boolean delContact(Contact obj)
    {
        if (obj == null){
            System.out.println("Error Can not add Contact");
            return false;
        }

        for (int i = 0 ; i < contacts.length ;i++){
            if(this.contacts[i] !=null && this.contacts[i].equals(obj))
            {
                this.contacts[i] = null;
                return true;
            }
            }
        return false;

    }
    public Contact findContact(String fullName)
    {
        for (int i = 0 ; i < contacts.length ;i++){
            if(this.contacts[i] != null  &&
               this.contacts[i].getFullName().equals(fullName))
                return contacts[i];

        }
        return null;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
