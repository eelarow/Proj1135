package OOP2.phoneContact1;

public class Program {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(5);
        phoneBook.addContact(new Contact("A","123"));
        phoneBook.addContact(new Contact("B","1234"));
        phoneBook.addContact(new Contact("C","123345"));
        System.out.println(phoneBook.toString());
        phoneBook.deContact(0);
        System.out.println(phoneBook);
        Contact c = phoneBook.findContact("B");
        if (c != null) {
            System.out.println("found");
            System.out.println(c);
        }
        else {
            System.out.println("not found");
            System.out.println(c);

        }

    }
}
