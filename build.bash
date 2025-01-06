# remove old compiled classes
bash ./clean.bash
# create .class files
bash ./compile.bash
# build jar file
jar -cvf mods/sms.driver.jar -C out/sms.driver .
jar -cvf mods/otp.service.jar -C out/otp.service .
jar -cvf mods/magfa.sms.driver.jar -C out/magfa.sms.driver .
jar -cvf mods/kavenegar.sms.driver.jar -C out/kavenegar.sms.driver .
jar -cvf mods/ghasedak.sms.driver.jar -C out/ghasedak.sms.driver .

