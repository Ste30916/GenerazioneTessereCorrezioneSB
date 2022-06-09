package com.acme.autorizzazioni.licenze;

import com.acme.autorizzazioni.persone.Persona;

public interface Licenza {

	int getAnnoDiScadenza();

	String getNumeroLicenza();

	Persona getTitolare();

	void setAnnoDiScadenza(int annoDiScadenza);

	void setNumeroLicenza(String i);

	void setTitolare(Persona titolare);
	
	boolean isValid();

}