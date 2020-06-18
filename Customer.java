/************************************************************************************************
 * Project 6 - Ice Cream
 ************************************************************************************************
 * Create system that keep tracks of customers' orders at Mal's Ice Cream Shop using abstraction
 * ______________________________________________________________________________________________
 * Meagan Nguyen
 * 09 November 2019
 * CMSC 255-002
 ***********************************************************************************************/
import java.util.ArrayList;

public class Customer {

    private String lastName;
    private String firstName;
    private String phone;
    private String email;
    private ArrayList<IceCream> iceCream;

    public Customer() {
        this.lastName = null;
        this.firstName = null;
        this.phone = null;
        this.email = null;
        this.iceCream = new ArrayList<IceCream>();
    }

    public Customer (String lastName, String firstName, String phone, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.iceCream = new ArrayList<IceCream>();
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void orderIceCream(IceCream newIceCream) {
        iceCream.add(newIceCream);
    }

    public int getNumIceCream() {
        int x = iceCream.size();
        return x;
    }

    public ArrayList<IceCream> getIceCream() {
        return iceCream;
    }

    public String toString() {
        String string = iceCream.toString().replaceAll("\n,\\s", "\n").trim();
        string = string.substring(1, string.length() - 1);
        String result = firstName + " " + lastName + "\n" + phone + "\n" + email + "\n" + "Ice Cream Order:" + "\n" + string;
        return result;
    }
}