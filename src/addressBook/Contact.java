package addressBook;

/**
 * Created by student on 23-Aug-16.
 */
public class Contact extends Person {

    private String phoneNum;
    private String email;
    private String facebook;
    private String twitter;

    private Person p;
    private Address a;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    Contact() {}

    public Contact(Person p, Address a, String email, String facebook, String phoneNum, String twitter) {
        this.a = a;
        this.email = email;
        this.p = p;
        this.phoneNum = phoneNum;
        this.twitter = twitter;
    }
    @Override
    public String toString() {
        return String.format("Contacts: %s %s %s %s %s %s",
                this.p, this.a, this.phoneNum, this.email, this.facebook, this.twitter);
    }
}

