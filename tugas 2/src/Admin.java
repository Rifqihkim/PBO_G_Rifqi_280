public class Admin {
    private String username = "rifqi";
    private String password = "1234";

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}
