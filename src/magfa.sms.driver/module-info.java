module magfa.sms.driver {
    
    requires sms.driver;
    
    provides sms.driver.SMSDriver
            with magfa.sms.driver.MagfaSMSDriver;
}