package com.acme.autorizzazioni.licenze.titolari;

import com.acme.autorizzazioni.persone.PersonaImp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TitolareDiLicenza extends PersonaImp {

	public TitolareDiLicenza(String email, String nome, String cognome, String indirizzo, String cap, String citta) {
		super(email, nome, cognome, indirizzo, cap, citta);
	}

}
