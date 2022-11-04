package utils;

import org.openqa.selenium.UsernameAndPassword;

public class Credentials {

    //TODO refactor to UsernamePasswordCredentials
//
    public static UsernameAndPassword STANDARD_USER = new UsernameAndPassword("standard_user", "secret_sauce");
//        UsernameAndPassword LOCKED_OUT_USER_LOGIN = new UsernameAndPassword("locked_out_user", "secret_sauce");
//        UsernameAndPassword PROBLEM_USER_LOGIN = new UsernameAndPassword("problem_user", "secret_sauce");
//        UsernameAndPassword PERFORMANCE_GLITCH_USER_LOGIN = new UsernameAndPassword("performance_glitch_user", "secret_sauce");

    public static final String STANDARD_USER_LOGIN = "standard_user";
    public static final String LOCKED_OUT_USER_LOGIN = "locked_out_user";
    public static final String PROBLEM_USER_LOGIN = "problem_user";
    public static final String PERFORMANCE_GLITCH_USER_LOGIN = "performance_glitch_user";

    public static final String PASSWORD_CORRECT = "secret_sauce";
    public static final String PASSWORD_INORRECT = "secret_sauce_123123";

}
