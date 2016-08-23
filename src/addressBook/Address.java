package addressBook;

/**
 * Created by student on 23-Aug-16.
 */
public class Address {
    private String firstLine;
    private String postcode;

    public Address(String firstLine, String postcode) {

        this.firstLine = firstLine;
        this.postcode = postcode;

    }


    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }



    @Override
    public String toString() {
        return String.format("Address: %s %s %s ",
                this.firstLine,  this.postcode,  this.postcode);
    }
}
