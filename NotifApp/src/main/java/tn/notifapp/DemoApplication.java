package tn.notifapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tn.notifapp.service.EmailSender;
import tn.notifapp.service.NotificationSender;
import tn.notifapp.service.NotificationService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		/**
		 * // Code avant de mettre les annotations (Partie 1 du TP)
		NotificationService notifService = new NotificationService();
		notifService.notifier("contact@gmail.com", "Bonjour...");
		*/
		/*
		// Code avec les annotations (Partie 2.1 du TP)
		NotificationService notifService = context.getBean(NotificationService.class);
		notifService.notifier("contact@gmail.com", "Bonjour...");
		// Afficher les Beans (classes qui sont chargées automatiquemet)
		for(String name: context.getBeanDefinitionNames()){
			// Récupérer le nom du package (pour afficher seuelement les Beans créés par nous)
			String packageName = context.getBean(name).getClass().getPackageName();
			if(packageName.startsWith("tn.notifapp")){
				System.out.println(name);
			}
		}*/
		// Partie 3 et 4
		// par nom + type
		NotificationSender s1 = context.getBean("emailSender", NotificationSender.class);
		// par type
		NotificationSender s2 = context.getBean(EmailSender.class);
		// par nom
		Object s3 = context.getBean("emailSender");
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		NotificationService notifService = context.getBean(NotificationService.class);
		notifService.notifier("contact@gmail.com", "Bonjour...");
	}

}
