package pageObjects;

public class UserInformation {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String creditCardNumber;
    private String month;
    private String year;
    private String nameOnCard;

    public UserInformation(String name, String address, String city, String state, String zipCode, String creditCardNumber, String month, String year, String nameOnCard){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.creditCardNumber = creditCardNumber;
        this.month = month;
        this.year = year;
        this.nameOnCard = nameOnCard;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }
}