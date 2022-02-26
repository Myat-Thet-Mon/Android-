package ch5Project;

import java.util.Scanner;

class AccountLogIn {
    private String accountName = "Myat Thet";
    private String gmail = "myat@.com";
    private String password = "weareone12";
    private int phNo = 1234;
    private boolean isLoginSuccess = false;

    /**
     * if this method return null,that mean your password is incorrect
     *
     * @param password
     * @return
     */
    public void login(String password) {
      if(this.password.equals(password)){
          isLoginSuccess = true;
      }
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public void writeOutput(){
        if(isLoginSuccess == true){
            System.out.println(accountName);
            System.out.println(this.gmail);
        }else{
            System.out.println("Please login first");
        }

    }

}

public class LogIn {
    public static void main(String[] args) {
        AccountLogIn logIn = new AccountLogIn();
        Scanner input = new Scanner(System.in);
        System.out.println("enter your password");
        logIn.login(input.next());
        System.out.println(logIn);
        System.out.println(logIn.toString());
        logIn.setAccountName("Hun");

    }

}
