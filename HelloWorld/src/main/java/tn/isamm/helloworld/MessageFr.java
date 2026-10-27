package tn.isamm.helloworld;

import org.springframework.stereotype.Component;

@Component("messageFR")
public class MessageFr implements IMessage{
    @Override
    public void hello() {
        System.out.println("Bonjour");
    }

    @Override
    public void goodbye() {
        System.out.println("Au revoir");
    }
}
