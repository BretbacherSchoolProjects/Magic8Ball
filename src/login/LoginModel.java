package login;

public class LoginModel {
    final private String username;
    final private String password;

    public LoginModel(){
        username="admin";
        password="admin";
    }

    public boolean isCorrectLogin(String name, String pwd){
        if (name.equals(username) && pwd.equals(password)){
            return true;
        }else{
            System.out.println("Wrong input");
            return false;
        }
    }
}
