package inheritance_example;

public class User {
    private String userName;
    private String password;
    private long phoneNo;
    private String emailId;

    public User(String userName, String password, long phoneNo, String emailId){
        this.userName = userName;
        this.password = password;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    public void getDetails() {
        System.out.println("Username : " + userName);
        System.out.println("Phone No : " + phoneNo);
        System.out.println("Email ID : " + emailId);
    }
}