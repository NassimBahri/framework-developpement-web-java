package tn.isamm.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DisplayMessage {

    IMessage message;

    public DisplayMessage(@Qualifier("messageEn") IMessage m){
        message = m;
    }

    public void afficher(){
        message.hello();
        message.goodbye();
    }

}
