package com.acme.autorizzazioni.servizi.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailService {
	private String nome;
	private String userNamePerInvio;
	private String password;
	
	
	public void send(Email mail) throws 
	MissingSubjectAndMessageException, 
	MailServerNotAvaibleException, 
	AuthorizationFailException, 
	EmailNotValideException {
		
		if(!isEmailValid(mail.getTo())) {
			throw new EmailNotValideException("Email non valida");
		}
		
		if(mail.getMessage() == null || mail.getMessage().isBlank()) {
			
			if(mail.getSubject()==null || mail.getMessage().isBlank()) {
				throw new MissingSubjectAndMessageException("Manca sia il messaggio che l'oggetto della email");
			}
			
		}
		
		// controllo se le credenziali sono valide
		
		connectToServer();
		
		if (!isServerAvailable()) {
			throw new MailServerNotAvaibleException("Il server è momentaneamente offline");
		}
		
		System.out.println("Email:" + mail.getMessage());
	}

	public void connectToServer() throws AuthorizationFailException {
		boolean connected = true;
		
		if (!connected) {
			throw new AuthorizationFailException("Credenziali errate");
		}
		
	}
	
	private boolean isEmailValid(String email) {
		return true;
	}
	private boolean isServerAvailable() {
		
		return true;
	}
	
}
