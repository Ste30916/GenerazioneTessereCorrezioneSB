package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.servizi.email.AuthorizationFailException;
import com.acme.autorizzazioni.servizi.email.Email;
import com.acme.autorizzazioni.servizi.email.EmailFactory;
import com.acme.autorizzazioni.servizi.email.EmailNotValideException;
import com.acme.autorizzazioni.servizi.email.EmailService;
import com.acme.autorizzazioni.servizi.email.EmailServiceFactory;
import com.acme.autorizzazioni.servizi.email.MailServerNotAvaibleException;
import com.acme.autorizzazioni.servizi.email.MissingSubjectAndMessageException;
import com.acme.autorizzazioni.servizi.email.WrongEmailTypeException;
import com.acme.autorizzazioni.tesserini.Tesserino;

public class TesserinoSendEmail {

	public static void send(Tesserino tesserino, String tipoTesserino) throws AuthorizationFailException, WrongEmailTypeException, MissingSubjectAndMessageException, MailServerNotAvaibleException, EmailNotValideException {
		EmailService googleEmailServer = EmailServiceFactory.create(EmailServiceFactory.GOOGLE_EMAIL);
		
		Email mail = EmailFactory.create(tesserino.getLicenza().getTitolare().getEmail(), 
				"Le comunichiamo di avver provveduto all'invio del suo tesserino caccia", 
				"Notifica di avvenuto invio del tesserino Caccia");
		googleEmailServer.send(mail); 
	}
}

