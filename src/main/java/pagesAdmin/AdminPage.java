package pagesAdmin;

import org.openqa.selenium.By;

public class AdminPage {
    public static By obj_UserName_Edit =By.xpath("//*[@id='login-txt-username']");

    public static By obj_Password_Edit=By.xpath("//*[@id='login-txt-pwd'']");
  public static By obj_Login_Button=By.xpath("//*[@id='login-btn-submit']");
  public static By obj_LoginPage_Title=By.xpath("//*[@id='root']/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[2]/h4");
}
