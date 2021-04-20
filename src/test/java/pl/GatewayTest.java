package pl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.SMSGateway.Gateway;
import pl.SMSGateway.SMSGateway;
import pl.SMSGateway.SMSGatewayException;
import pl.SMSGateway.Sms;

class GatewayTest {

    public static final String NUMER_TEL = "123456789";
    public static final String TRESC_SMS = "Witaj !";
    private Gateway gateway;

    @BeforeEach
    void setUp(){
        gateway = new Gateway(new SMSGateway()); // Gateway może być w przyszłości rozszerzany, wieć jak obiekt
    }

    @AfterEach
    void tearDown(){
        gateway = null;
    }

    @Test
    void wyslijSms() {
        //given
        Sms sms = new Sms(NUMER_TEL,TRESC_SMS);
        //when
        gateway.wyslijSms(NUMER_TEL, TRESC_SMS);
        //then
//        Assertions.assertNotNull(sentSMS,"Nie wysłano wiadomości sms");
        Assertions.assertThrows(SMSGatewayException.class, () -> {
            gateway.wyslijSms(NUMER_TEL, TRESC_SMS);
        });
    }
}