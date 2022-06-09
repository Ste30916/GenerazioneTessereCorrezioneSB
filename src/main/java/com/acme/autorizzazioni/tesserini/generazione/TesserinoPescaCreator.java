package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.licenze.LicenzaPesca;
import com.acme.autorizzazioni.servizi.email.AuthorizationFailException;
import com.acme.autorizzazioni.servizi.email.EmailNotValideException;
import com.acme.autorizzazioni.servizi.email.MailServerNotAvaibleException;
import com.acme.autorizzazioni.servizi.email.MissingSubjectAndMessageException;
import com.acme.autorizzazioni.servizi.email.WrongEmailTypeException;
import com.acme.autorizzazioni.tesserini.Tesserino;
import com.acme.autorizzazioni.tesserini.TesserinoFactory;
import com.acme.autorizzazioni.tesserini.WrongTesserinoTypeException;

public class TesserinoPescaCreator {

	public static void create(LicenzaPesca licenza, int annoInCorso) throws WrongTesserinoTypeException, AuthorizationFailException, WrongEmailTypeException, MissingSubjectAndMessageException, MailServerNotAvaibleException, EmailNotValideException {
		Tesserino tesserino = TesserinoFactory.create(TesserinoFactory.TESSERINO_PESCA);
		tesserino.setAnnoValidita(annoInCorso);
		System.out.println("Tesserino di " + licenza.getTitolare().getCognome() + 
				" pesca inviato ad a " + licenza.getLocalita());
		
		TesserinoSendEmail.send(tesserino, "Pesca");
		}
	}

