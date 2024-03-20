package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
     Properties properties ;
     public ReadConfig(){
         File src = new File("configuration/config.properties");

         try {
            FileInputStream fis = new FileInputStream(src);
             properties = new Properties();
             properties.load(fis);
         } catch (IOException e) {
             System.out.println("Exception is : "+e.getMessage());
         }


     }
     public String getApplicationURL(){
         String url = properties.getProperty("baseURL");
         return url ;
     }
     public String getUsername(){
         String username = properties.getProperty("username");
         return username ;
     }
     public String getPassword(){
         String password = properties.getProperty("password");
         return password ;
     }
     public String getChromePath(){
         String chromePath = properties.getProperty("chromePath");
         return chromePath ;
     }
     public String getedgePath(){
         String edgePath = properties.getProperty("edgePath");
         return edgePath ;
     }
     public String getfirefoxPath(){
         String firefoxPath = properties.getProperty("firefoxPath");
         return firefoxPath ;
     }

}
