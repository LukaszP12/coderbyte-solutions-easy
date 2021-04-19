package Coderbyte.Medium;

public class SimplePassword {

    public static String SimplePassword(String inputPassword) {
        if ((inputPassword.replaceAll("[A-Z]", "").length() == inputPassword.length()) ||
                (inputPassword.replaceAll("[0-9]", "").length() == inputPassword.length()) ||
                (inputPassword.replaceAll("[A-Za-z0-9]", "").equals("")) ||
                (inputPassword.toLowerCase().contains("password")) ||
                (inputPassword.length() < 8 || inputPassword.length() > 30)) {
            return "false";
        }

        return "true";
    }


    public static void main(String[] args) {
        System.out.println(SimplePassword("passWord123!!!!"));
        System.out.println(SimplePassword("turkey90AAA="));
    }

}
