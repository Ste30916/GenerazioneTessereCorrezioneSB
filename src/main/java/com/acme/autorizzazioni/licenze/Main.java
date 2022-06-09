package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.licenze.titolari.TitolareDiLicenzaFactory;
import com.acme.autorizzazioni.persone.Persona;

public class Main {
	
	public static void main(String[] args) {
		try {
			Licenza licenzaCaccia = LicenzaFactory.create(LicenzaFactory.LICENZA_DI_CACCIA);
			
			licenzaCaccia.setAnnoDiScadenza(2000);
			licenzaCaccia.setNumeroLicenza("200");
			
			// Persona titolareDiLicenza = TitolareDiLicenzaFactory.create(TitolareDiLicenzaFactory.TITOLARE_LICENZA);
			/*
				Persona titolareDiLicenza = TitolareDiLicenzaFactory.create();
				titolareDiLicenza.setNome("Mauro");
				titolareDiLicenza.setCognome("Larese");
				titolareDiLicenza.setEmail("mauro.larese@gmail.com");
				titolareDiLicenza.setIndirizzo("Via Roma, 117");
				titolareDiLicenza.setCap(00942);
				titolareDiLicenza.setCitta("Belluno");
		*/
			
			Persona titolareDiLicenza = TitolareDiLicenzaFactory.create(TitolareDiLicenzaFactory.TITOLARE_LICENZA, 
					"Mauro", "Larese", "Via Roma 117", "mauro.larese@gmail.com", "00942", "Belluno");
			
			licenzaCaccia.setTitolare(titolareDiLicenza);
			
		} catch (Exception e) {
			System.out.println("Si è verificato un errore: " + e.getMessage());
		}
		
	}
	
	

}
