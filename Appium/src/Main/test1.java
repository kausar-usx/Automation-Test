package Main;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class test1 extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
    
    driver.findElementById("com.labpbm.uaspbm:id/inputnama").sendKeys("Muhammad Kausar");
    driver.findElementById("com.labpbm.uaspbm:id/inputemail").sendKeys("kausar@gmail.com");
    driver.findElementById("com.labpbm.uaspbm:id/inputpassword").sendKeys("kausar123");
    driver.findElementById("com.labpbm.uaspbm:id/btn_daftar").click();
}
}
