module ghasedak.sms.driver {
    requires sms.driver;
    
    provides sms.driver.SMSDriver
            with ghasedak.sms.driver.GhasedakSMSDriver;
}