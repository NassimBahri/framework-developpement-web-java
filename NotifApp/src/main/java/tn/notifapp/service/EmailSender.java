package tn.notifapp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailSender implements NotificationSender{
    @Override
    public void envoyer(String destinataire, String message) {
        System.out.println("[EMAIL] à " + destinataire + " : " + message);
    }
}
