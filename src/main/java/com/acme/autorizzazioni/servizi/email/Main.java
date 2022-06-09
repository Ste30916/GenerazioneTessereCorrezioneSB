package com.acme.autorizzazioni.servizi.email;

public class Main {

	public static void main(String[] args) {
		// Usiamo il Factory per recuperare un server a nostra scelta
		
		try {
			EmailService googleService = EmailServiceFactory.create(EmailServiceFactory.GOOGLE_EMAIL);
			
			Email email = new EnterpriseEmail("Mauro.larese@gmail.com","Messaggio di test","Prova messaggio");
			
			
				googleService.send(email);
		
		} catch (AuthorizationFailException e) {
			
			System.out.println("Contattare l'amministratore");
				
				
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
			
			
		}

	}

}
