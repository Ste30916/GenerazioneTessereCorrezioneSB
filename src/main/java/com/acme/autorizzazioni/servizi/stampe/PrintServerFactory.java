package com.acme.autorizzazioni.servizi.stampe;

public class PrintServerFactory {
	public static final int SERVER_UFFICIO_CACCIA = 1;
	public static final int SERVER_UFFICIO_PESCA = 2;
	
	public static PrintServer create(int tipoServer) throws WrongPrintServerException {
		PrintServer server = new PrintServer();
		if(tipoServer == SERVER_UFFICIO_CACCIA) {
			server.setUserName("Admin");
			server.setPassword("werty");
			server.setNetworkName("CACCIA_SRV_PRINT");
		} else if (tipoServer == SERVER_UFFICIO_PESCA) {
			server.setUserName("Admin");
			server.setPassword("7865");
			server.setNetworkName("PESCA_SRV_PRINT");
		} else {
			throw new WrongPrintServerException("Tipo server non previsto");
		}
		
		
		return server;
	}

}
