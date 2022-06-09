package com.acme.autorizzazioni.servizi.email;

public class EmailFactory {
	public static final int ENTERPRISE_EMAIL = 1;
	
	
	public static Email create() throws WrongEmailTypeException {
		return create(ENTERPRISE_EMAIL);
	}
		
	public static Email create(String to, String message, String subject) throws WrongEmailTypeException {
		return create(ENTERPRISE_EMAIL, to, message, subject);
	}
	
	public static Email create(int tipoEmail, String to, String message, String subject) throws WrongEmailTypeException {
		Email email = create(tipoEmail);
		email.setTo(to);
		email.setMessage(message);
		email.setSubject(subject);
		
		return email;
	}
	
	public static Email create(int tipoEmail) throws WrongEmailTypeException {
		if(tipoEmail == ENTERPRISE_EMAIL) {
			return new EnterpriseEmail();
		} else { throw new WrongEmailTypeException("Tipologia di email non prevista");
		}
		}
	}

