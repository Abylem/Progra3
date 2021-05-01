package com.Abby.Negocio;

import com.Abby.DAO.ClsPersona;
import com.Abby.Entidades.Personas;

public class ComprobarDUI {
	public int acceso(Personas per) {
		int acceso = 0;
		ClsPersona clspersona = new ClsPersona();
		boolean boolean_existencia = clspersona.ComprobarExistencia(per);
		if(existencia == true) {
			acceso = 1;
			
		}
		return acceso;
	}
	
	public String ObtenerNombre(Personas per) {
		ClsPersona clspersona = new ClsPersona();
		return clspersona.ObtenerNombre(per);
	}

}
