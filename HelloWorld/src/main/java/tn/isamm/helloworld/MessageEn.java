package tn.isamm.helloworld;

import org.springframework.stereotype.Component;

@Component("messageEn")
public class MessageEn implements IMessage {
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public void goodbye() {
        System.out.println("Goog Bye");
    }
}
