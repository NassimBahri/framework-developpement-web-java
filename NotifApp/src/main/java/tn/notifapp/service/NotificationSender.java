package tn.notifapp.service;

public interface NotificationSender {
    void envoyer(String destinataire, String message);
}
