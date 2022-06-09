package com.acme.autorizzazioni.servizi.stampe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrintObjectImp implements PrintObject {
	private String testo;
	public void assegnaTesto() {
	}
	
	@Override
	public void assegnaTesto(String testo) {
		// TODO Auto-generated method stub
		
	}
	

}
