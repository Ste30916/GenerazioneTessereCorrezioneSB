package com.acme.autorizzazioni.servizi.email;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EnterpriseEmail extends EmailImp {
	
	public EnterpriseEmail(String to, String message, String subject) {
		super(to, message, subject);
	}

}
