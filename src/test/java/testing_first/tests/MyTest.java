package testing_first.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testing_first.dev.DevClass;
import testing_first.dev.WrongLoginException;
import testing_first.dev.WrongPasswordException;

public class MyTest {

    private String validLogin = "123zxc";
    private String invalidLogin = "123!!!";
    private String validPassword = "zxcvbn12345";
    private String validPassword1 = "987654321";
    private String invalidPassword = "!!!789";
    @Test
    public void LoginTest() throws WrongPasswordException, WrongLoginException {
        boolean actual = DevClass.logIn(validLogin, validPassword, validPassword);
        Assert.assertTrue(actual, "actual is not true");
    }
    @Test
    public void PasswordTest () throws WrongPasswordException, WrongLoginException {
        boolean actual = DevClass.logIn(validLogin, validPassword, validPassword);
        Assert.assertTrue(actual, "error");
    }

    @Test
    public void FirstTest(){
        String actual = DevClass.reverseWord("1234");
        Assert.assertEquals(actual,"4321", "reverse word is not correct");

    }
    @Test (expectedExceptions = IllegalArgumentException.class)
    public void SecondTest(){
        String actual = DevClass.reverseWord(null);

    }
    @Test (expectedExceptions = RuntimeException.class)
    public void OneSignTest(){
        String actual = DevClass.reverseWord("1");
}
    @Test (expectedExceptions = RuntimeException.class)
    public void PassTest(){
        String actual = DevClass.reverseWord(" ");
    }

    @Test (expectedExceptions = RuntimeException.class)
    public void EmptyTest(){
        String actual = DevClass.reverseWord("");
    }

}
