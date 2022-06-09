package com.acme.autorizzazioni.servizi.email;

public class EmailServiceFactory {
	public static final String GOOGLE_EMAIL = "google";
	public static final String LIBERO_EMAIL = "libero";
	
	public static EmailService create(String serverType) throws AuthorizationFailException {
		EmailService service = null;
		
		if(serverType.equals(GOOGLE_EMAIL) ) {
			
			service = new EmailService();
			service.setNome("email.server.google.com");
			service.setUserNamePerInvio("admin");
			service.setPassword("12345");
		} else {
			service.setNome("email.server.libero.it");
			service.setUserNamePerInvio("user");
			service.setPassword("abcdef");
		}
		
		service.connectToServer();
	
		return service;
		
		}
			
	}

