package OOP2.phoneContact;

public class Contact {
    private String fullName;
    private String phoneNr;

    public Contact(String fullName, String phoneNr) {
        this.fullName = fullName;
        this.phoneNr = phoneNr;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public boolean equals (Contact obj){
        if ( !this.fullName.equals(obj.fullName) &&
             !this.phoneNr.equals(obj.phoneNr))
            return  false;
        return true;

    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                '}';
    }
}
