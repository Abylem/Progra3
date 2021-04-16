package com.abby.Negocio;


import com.abby.Entidades.Loguin;

public class ClsLoguin {
	
	public int acceso(Loguin log) {
		int acceso = 0;
		if(log.getUser().equals("Abigail") && log.getPass().equals("123")) {
			acceso = 1;
			
		}
		else {
			
		}
		return acceso;
	}

}
