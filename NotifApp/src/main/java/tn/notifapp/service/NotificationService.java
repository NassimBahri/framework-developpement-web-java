package tn.notifapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class NotificationService {

    public final NotificationSender sender;
    @Autowired
    private DateTimeFormatter formatter;

    public NotificationService(NotificationSender sender){
        this.sender = sender;
        System.out.println("Service créé avec : " + sender.getClass().getSimpleName());
    }

    public void notifier(String destinataire, String message) {
        LocalDateTime date = LocalDateTime.now();
        sender.envoyer(destinataire, date.format(formatter) + " - " + message);
    }

}
