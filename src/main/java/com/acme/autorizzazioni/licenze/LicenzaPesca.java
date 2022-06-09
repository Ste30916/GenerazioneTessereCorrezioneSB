package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LicenzaPesca extends LicenzaImp {
	private String tipoLicenza;
	private String localita;

	public LicenzaPesca(String numeroLicenza, Persona titolare, int annoDiScadenza, 
			String tipoLicenza, String localita) {
		super(numeroLicenza, titolare, annoDiScadenza);
		this.tipoLicenza = tipoLicenza;
		this.localita = localita;
	
	}

}
