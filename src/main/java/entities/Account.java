package entities;

public class Account {
     private String accountID;
     private String fullName;
     private String passWord;
     private String email;
     private String phone;
     private byte status;

     public String getAccountID() {
          return accountID;
     }

     public void setAccountID(String accountID) {
          this.accountID = accountID;
     }

     public String getFullName() {
          return fullName;
     }

     public void setFullName(String fullName) {
          this.fullName = fullName;
     }

     public String getPassWord() {
          return passWord;
     }

     public void setPassWord(String passWord) {
          this.passWord = passWord;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getPhone() {
          return phone;
     }

     public void setPhone(String phone) {
          this.phone = phone;
     }

     public byte getStatus() {
          return status;
     }

     public void setStatus(byte status) {
          this.status = status;
     }

     public Account(String accountID, String fullName, String passWord, String email, String phone, byte status) {
          this.accountID = accountID;
          this.fullName = fullName;
          this.passWord = passWord;
          this.email = email;
          this.phone = phone;
          this.status = status;
     }

     public Account() {
     }

     @Override
     public String toString() {
          return "Account{" +
                  "accountID='" + accountID + '\'' +
                  ", fullName='" + fullName + '\'' +
                  ", passWord='" + passWord + '\'' +
                  ", email='" + email + '\'' +
                  ", phone='" + phone + '\'' +
                  ", status=" + status +
                  '}';
     }
}
