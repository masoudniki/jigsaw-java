package magfa.sms.driver;
import sms.driver.SMSDriver;
public class MagfaSMSDriver implements SMSDriver {
    @Override
    public void send(){
        System.out.println("THIS IS MAGFA DRIVER");
    }
}