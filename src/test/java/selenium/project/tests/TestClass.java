package selenium.project.tests;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import selenium.framework.rest.RestManager;
import selenium.project.model.ListMyPost;
import selenium.project.model.MyPost;
import selenium.project.model.MyUser;
import selenium.utils.Fixtures;
import selenium.utils.JsonUtils;

import java.util.List;

//import selenium.project.pages.MainPage;

public class TestClass extends BaseTest {
//    private WebDriver driver;

//
//    public void test() {
//        MainPage mainPage = new MainPage();
//        mainPage.open();
//        mainPage.clickLogIn();
//        AuthorizationPage authorizationPage = new AuthorizationPage();
//        authorizationPage.fillLogin("julik200890");
//        authorizationPage.clickIn();
//        authorizationPage.fillPasswd(" ");
//
//
//        WebElement in2 = driver.findElement(By.xpath("//button[@id='passp:sign-in']"));
//        in2.click();
//        WebElement in3 = driver.findElement(By.xpath("//button[@data-t='button:action']"));
//        in3.click();
//        WebElement catalog = driver.findElement(By.xpath("//span[text()='Каталог']"));
//        catalog.click();
//        List<WebElement> elements = driver.findElements(By.xpath("//li[@data-zone-name = 'category-link']"));
//        Assert.assertEquals(elements.size(), 26, " ");
//        int random = (int) (Math.random() * elements.size());
//        elements.get(random).click();
//
//        Assert.assertEquals(homePage.getText(), "{\n" +
//                "  \"authenticated\": true, \n" +
//                "  \"user\": \"user\"\n" +
//                "}", "text does not match");

//        Assert.assertEquals(homePage.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor", "text does not match");
//        homePage.switchIframe();
//        homePage.clearText();
//        homePage.sendText("0123456789");
//        Thread.sleep(2000);
//    }


//    public void test2() throws InterruptedException {
//        HomePage homePage = new HomePage();
//        homePage.open();
//        homePage.clickJSAlert();
//        Assert.assertEquals(ManagerAlert.getText(), "I am a JS Alert", "text does not match");
//        ManagerAlert.closeAlert();
//        Assert.assertEquals(homePage.getMessage(), "You successfully clicked an alert", "text did not appear");
//        homePage.clickJSConfirm();
//        Assert.assertEquals(ManagerAlert.getText(), "I am a JS Confirm", "text does not match");
//        ManagerAlert.closeAlert();
//        Assert.assertEquals(homePage.getMessage2(), "You clicked: Ok", "text did not appear");
//        homePage.clickJSprompt();
//        Assert.assertEquals(ManagerAlert.getText(), "I am a JS prompt", "text does not match");
//        ManagerAlert.closeAlert();
//        Assert.assertEquals(homePage.getMessage3(), "You entered: hello\n" +
//                "\n", "text did not appear");

    @Test
    public void testPostId88() {
        HttpResponse<JsonNode> response = Unirest.get("https://jsonplaceholder.typicode.com/posts/88").asJson();
        System.out.println(response.getBody().toPrettyString());

        HttpResponse<JsonNode> responseId88 = RestManager.getPostById(88);
        Assert.assertNotNull(responseId88, "responseId88 is null");
        Assert.assertEquals(responseId88.getStatus(), 200);
//        Assert.assertEquals(responseId88.getBody().toPrettyString(), "{\n" +
//                "  \"userId\": 9,\n" +
//                "  \"id\": 88,\n" +
//                "  \"title\": \"sapiente omnis fugit eos\",\n" +
//                "  \"body\": \"consequatur omnis est praesentium\\nducimus non iste\\nneque hic deserunt\\nvoluptatibus veniam cum et rerum sed\"\n" +
//                "}");

        MyPost expected = JsonUtils.createObject(Fixtures.POST_ID_88, MyPost.class);
        MyPost actual = JsonUtils.createMyPostByJson(responseId88.getBody().toString());
        Assert.assertEquals(actual, expected, "");


//         HttpResponse<JsonNode> responseId1 = RestManager.getUserById(1);
//         Assert.assertNotNull(responseId1, "responseId1 is null");
//         Assert.assertEquals(responseId1.getStatus(), 200);
//         Assert.assertEquals(responseId1.getBody().toPrettyString(), "{\n" +
//                 "  \"id\": 1,\n" +
//                 "  \"name\": \"Leanne Graham\",\n" +
//                 "  \"username\": \"Bret\",\n" +
//                 "  \"email\": \"Sincere@april.biz\",\n" +
//                 "  \"address\": {\n" +
//                 "    \"street\": \"Kulas Light\",\n" +
//                 "    \"suite\": \"Apt. 556\",\n" +
//                 "    \"city\": \"Gwenborough\",\n" +
//                 "    \"zipcode\": \"92998-3874\",\n" +
//                 "    \"geo\": {\n" +
//                 "      \"lat\": \"-37.3159\",\n" +
//                 "      \"lng\": \"81.1496\"\n" +
//                 "    }\n" +
//                 "  },\n" +
//                 "  \"phone\": \"1-770-736-8031 x56442\",\n" +
//                 "  \"website\": \"hildegard.org\",\n" +
//                 "  \"company\": {\n" +
//                 "    \"name\": \"Romaguera-Crona\",\n" +
//                 "    \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
//                 "    \"bs\": \"harness real-time e-markets\"\n" +
//                 "  }\n" +
//                 "}");


//         MyPost actualPost = JsonUtils.createMyPostByJson(responseId88.getBody().toString());
//         MyPost expectedPost = JsonUtils.createMyPostByJson("");
    }

    public void testPost101() {

        HttpResponse<JsonNode> responseId101 = RestManager.getPostById(101);
        Assert.assertNotNull(responseId101, "responseId101 is null");
        Assert.assertEquals(responseId101.getStatus(), 404);
        Assert.assertEquals(responseId101.getBody().toPrettyString(), "{}");

    }


    public void testUserAll() {
        HttpResponse<JsonNode> responseIdAll = RestManager.getUserAll();
        Assert.assertNotNull(responseIdAll, "responseIdAll is null");
        Assert.assertEquals(responseIdAll.getStatus(), 200);


        MyUser expected = JsonUtils.createObject(Fixtures.USER_ID_5, MyUser.class);
        String user5Text = responseIdAll.getBody().getArray().get(4).toString();
        MyUser actual = JsonUtils.createMyUserByJson(user5Text);
        Assert.assertEquals(actual, expected, "");

        HttpResponse<JsonNode> responseId5 = RestManager.getUserById(5);
        MyUser expected5 = JsonUtils.createObject(Fixtures.USER_ID_5, MyUser.class);
        MyUser actual5 = JsonUtils.createMyUserByJson(responseId5.getBody().toString());
        Assert.assertEquals(actual5, expected5, "");


    }

    public void testPostAll() {
        HttpResponse<JsonNode> responseIdAll = RestManager.getPostAll();
        Assert.assertNotNull(responseIdAll, "responseIdAll is null");
        Assert.assertEquals(responseIdAll.getStatus(), 200);
        List<MyPost> listMyPosts = JsonUtils.getListMyPosts(responseIdAll.getBody().getArray());

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
        for (int i = 0; i < listMyPosts.size() - 1; i++) {
            if (listMyPosts.get(i).getId() >= listMyPosts.get(i + 1).getId()) {
                softAssert.fail("post with: " + listMyPosts.get(i).getId() + "<" + listMyPosts.get(i + 1).getId());

            }

        }

    }

    @Test
    public void checkPostAll() {
        HttpResponse<JsonNode> responseIdAll = RestManager.getPostAll();
        Assert.assertNotNull(responseIdAll, "responseIdAll is null");
        Assert.assertEquals(responseIdAll.getStatus(), 200);
        ListMyPost expectedAllPosts = JsonUtils.createObject(Fixtures.ALL_POSTS, ListMyPost.class);
        List<MyPost> actualAllPosts = JsonUtils.getListMyPosts(responseIdAll.getBody().getArray());

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualAllPosts.size(), expectedAllPosts.getMyPostList().size(), "");
        for (int i = 0; i < expectedAllPosts.getMyPostList().size(); i++) {

        }

    }

    @Test
    public void sendMyPost(){
        MyPost expected = JsonUtils.createObject(Fixtures.POST_ID_88, MyPost.class);
        HttpResponse<JsonNode> sendPostAll = RestManager.getPostAll();
        Assert.assertNotNull(sendPostAll, "responseIdAll is null");
        Assert.assertEquals(sendPostAll.getStatus(), 201);

    }


}
