package tn.notifapp.service;

import org.springframework.stereotype.Component;

@Component
public class SmsSender  implements NotificationSender{
    @Override
    public void envoyer(String destinataire, String message) {
        System.out.println("[SMS] à " + destinataire + " : " + message);
    }
}