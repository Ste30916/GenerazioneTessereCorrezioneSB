package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.licenze.LicenzaCaccia;
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
import com.acme.autorizzazioni.tesserini.TesserinoFactory;
import com.acme.autorizzazioni.tesserini.WrongTesserinoTypeException;

public class TesserinoCacciaCreator {

	public static void create(LicenzaCaccia licenza, int annoInCorso) throws WrongTesserinoTypeException, 
	AuthorizationFailException, MissingSubjectAndMessageException, MailServerNotAvaibleException, 
	EmailNotValideException, WrongEmailTypeException {
		Tesserino tesserino = TesserinoFactory.create(TesserinoFactory.TESSERINO_CACCIA);
		tesserino.setAnnoValidita(annoInCorso);
		System.out.println("Tesserino caccia inviato ad ATC " + licenza.getAtc());
		
		TesserinoSendEmail.send(tesserino, "Caccia");
		}
	

	}


