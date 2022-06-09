package com.acme.autorizzazioni.licenze.titolari;

import com.acme.autorizzazioni.licenze.WrongPersonTypeException;
import com.acme.autorizzazioni.persone.Persona;

public class TitolareDiLicenzaFactory {
	public final static int TITOLARE_LICENZA = 1;
	
	public final static TitolareDiLicenza create(int tipoTitolare) throws WrongPersonTypeException {
		Persona persona = null;
		
		
		if(tipoTitolare == TITOLARE_LICENZA) {
			persona = new TitolareDiLicenza();	
		} else {
			throw new WrongPersonTypeException("Tipo persona non prevista");
		}
	
		return (TitolareDiLicenza) persona;
	}

	public final static TitolareDiLicenza create() throws WrongPersonTypeException {
		return create(TITOLARE_LICENZA);
	}
	
	public final static TitolareDiLicenza create(int tipoTitolare, String nome, String cognome, String indirizzo,  String email, String cap, String citta ) throws WrongPersonTypeException {
		Persona persona = create(tipoTitolare);
		
		persona.setNome("Mauro");
		persona.setCognome("Larese");
		persona.setEmail("mauro.larese@gmail.com");
		persona.setIndirizzo("Via Roma, 117");
		persona.setCap("00942");
		persona.setCitta("Belluno");
		
		return (TitolareDiLicenza) persona;
		

	}
}
