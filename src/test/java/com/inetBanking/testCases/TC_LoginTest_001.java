package com.inetBanking.testCases;

import com.inetBanking.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {
    @Test
    public void loginTest(){

        LoginPage lp = new LoginPage(driver);

        lp.setTxtUserName(username);

        lp.setTxtPassword(password);

        lp.setBtnLogin();
        if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);

        }else{
            Assert.fail();

        }

    }

}
