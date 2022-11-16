package MyProject_Selenium_Java.Infra.Facebook_Infra;

public class Login implements FacebookConst {

    private String UserName;
    private String Password;

    public String getUserName() {
        this.UserName = FacebookConst.User_elm;

        return UserName;
    }

    public String setUserName(String UserName) {
        this.UserName = UserName;
        return UserName;


    }

    public String getPassword() {
        this.Password = FacebookConst.Pass_elm;
        return Password;
    }

    public String setPassword(String Password) {

        this.Password = Password;
        return Password;
    }
}
