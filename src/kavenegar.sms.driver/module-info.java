module kavenegar.sms.driver {
    
    requires sms.driver;
    
    provides sms.driver.SMSDriver
            with kavenegar.sms.driver.KaveNegarSMSDriver;
}