package edu.guilford;

public class Individual {

    // three attributes for name, email, phone, password, security question,
    // address, and avatar
    private String name;
    private String email;
    private String phone;
    private String password;
    private String securityQuestion;
    private String address;
    private String avatar;

    // constructor that gives default data
    // constructor
    public Individual() {
        // set the name attribute "put your name here"
        name = "put your name here";
        // set the email attribute to "put your email here"
        email = "put your email here";
        // set the phone attribute to "what is your phone #"
        phone = "what is your phone #";
        // set the password attribute to "insert password here"
        password = "insert password here";
        // set the security question attribute to "What is your favorite color?"
        securityQuestion = "Should be simple!";
        // set the address attribute to "put your address here"
        address = "put your address here";
        // set the avatar attribute to "avatar name?"
        avatar = "avatar name?";
    }

    // constructor that takes String parameters
    public Individual(String name, String email, String phone, String password, String securityQuestion, String address,
            String avatar) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.securityQuestion = securityQuestion;
        this.address = address;
        this.avatar = avatar;
    }

    // generate all getters and setters for the attributes
    // getters and setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters and setters for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // getters and setters for phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // getters and setters for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // getters and setters for security question
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    // getters and setters for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // getters and setters for avatar
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    // to string method
    @Override
    public String toString() {
        return "Individual{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", securityQuestion='" + securityQuestion + '\'' +
                ", address='" + address + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
