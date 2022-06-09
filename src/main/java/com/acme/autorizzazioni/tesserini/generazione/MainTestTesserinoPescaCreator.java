package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.licenze.LicenzaFactory;
import com.acme.autorizzazioni.licenze.LicenzaPesca;
import com.acme.autorizzazioni.licenze.titolari.TitolareDiLicenzaFactory;
import com.acme.autorizzazioni.persone.Persona;

public class MainTestTesserinoPescaCreator {


	public static void main(String[] args) {
		LicenzaPesca lp;
		Persona pe;
		
		try {
			pe = TitolareDiLicenzaFactory.create();
			pe.setNome("Mauro");
			pe.setCognome("Larese");
			lp = (LicenzaPesca) LicenzaFactory.create( LicenzaFactory.LICENZA_DI_PESCA);
			lp.setLocalita("Lago Maggiore");
			lp.setTitolare(pe);
			
			TesserinoPescaCreator.create(lp, 2022);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			
		
		}
		

	}

}
