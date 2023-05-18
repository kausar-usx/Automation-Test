package Main;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class test2 extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        
        driver.findElementById("com.labpbm.uaspbm:id/btn_daftar").click();
        driver.findElementById("com.labpbm.uaspbm:id/profile").click();
        driver.findElementById("com.labpbm.uaspbm:id/log_out").click();

    }
}
