package com.acme.autorizzazioni.tesserini.generazione;

import java.util.List;

import com.acme.autorizzazioni.licenze.Licenza;
import com.acme.autorizzazioni.licenze.LicenzaCaccia;
import com.acme.autorizzazioni.licenze.LicenzaPesca;
import com.acme.autorizzazioni.licenze.LicenzaScadutaException;
import com.acme.autorizzazioni.servizi.email.AuthorizationFailException;
import com.acme.autorizzazioni.servizi.email.EmailNotValideException;
import com.acme.autorizzazioni.servizi.email.MailServerNotAvaibleException;
import com.acme.autorizzazioni.servizi.email.MissingSubjectAndMessageException;
import com.acme.autorizzazioni.servizi.email.WrongEmailTypeException;
import com.acme.autorizzazioni.tesserini.Tesserino;
import com.acme.autorizzazioni.tesserini.TesserinoCaccia;
import com.acme.autorizzazioni.tesserini.TesserinoFactory;
import com.acme.autorizzazioni.tesserini.TesserinoPesca;
import com.acme.autorizzazioni.tesserini.WrongTesserinoTypeException;


public class TesserinoGenerator {
	public final static int ANNO_IN_CORSO = 2022;
	
	public static void generate(Licenza licenza) throws LicenzaScadutaException, 
	WrongTesserinoTypeException, AuthorizationFailException, MissingSubjectAndMessageException, 
	MailServerNotAvaibleException, EmailNotValideException, WrongEmailTypeException {
		
		//genera il tesserino
		if(!licenza.isValid()) {
			throw new LicenzaScadutaException("La licenza di " + licenza.getTitolare().getCognome() + " è scaduta");
		}
		
		if(licenza.getClass().getSimpleName().equals("LicenzaCaccia")) {
			TesserinoCacciaCreator.create((LicenzaCaccia) licenza, ANNO_IN_CORSO);
		} else {
			TesserinoPescaCreator.create((LicenzaPesca) licenza, ANNO_IN_CORSO);
		}
		
		
		
		
	}

	private static Tesserino generaTesserino(LicenzaCaccia licenza) throws WrongTesserinoTypeException { 
		Tesserino tesserino = TesserinoFactory.create(TesserinoFactory.TESSERINO_CACCIA);
		tesserino.setAnnoValidita(ANNO_IN_CORSO);
		System.out.println("Tesserino caccia inviato ad ATC " + licenza.getAtc());
		return tesserino;
		
	}
	private static Tesserino generaTesserino(LicenzaPesca licenza) throws WrongTesserinoTypeException {
		Tesserino tesserino = TesserinoFactory.create(TesserinoFactory.TESSERINO_PESCA);
		tesserino.setAnnoValidita(ANNO_IN_CORSO);
		System.out.println("Tesserino pesca inviato ad ATC " + licenza.getLocalita());
		return tesserino;
		
	}
		
	
	
	public static void generate(List<Licenza> licenze) throws LicenzaScadutaException, 
	WrongTesserinoTypeException, AuthorizationFailException, MissingSubjectAndMessageException, 
	MailServerNotAvaibleException, EmailNotValideException, WrongEmailTypeException {
		for (Licenza licenza : licenze) {
			generate(licenza);
			
		}
	}
	
}
