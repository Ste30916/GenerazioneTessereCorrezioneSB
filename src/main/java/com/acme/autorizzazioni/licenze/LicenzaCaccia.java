package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LicenzaCaccia extends LicenzaImp {
	private String atc;
	private String numeroDiSerieArma;
	private String tipologiaPreda;

	public LicenzaCaccia(String numeroLicenza, Persona titolare, int annoDiScadenza, 
			String atc, String numeroDiSerieArma, String tipologiaPreda) {
		super(numeroLicenza, titolare, annoDiScadenza);
		this.atc = atc;
		this.numeroDiSerieArma = numeroDiSerieArma;
		this.tipologiaPreda = tipologiaPreda;
	
	}

}
