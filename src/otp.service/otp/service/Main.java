package otp.service;
import java.util.ServiceLoader;
import sms.driver.SMSDriver;

class Main {
    public static void main(String[] strings){
        ServiceLoader<SMSDriver> drivers = ServiceLoader.load(SMSDriver.class);
        
        for(SMSDriver driver: drivers) {
            System.out.println(driver);
            driver.send();
        }
    }
} 