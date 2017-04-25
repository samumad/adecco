package com.gmv.vodafone;

import java.io.Serializable;
import java.time.LocalDate;

/*
 * Simular entidad recuperada de la BBDD
 */
public class Oferta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int codigoOferta;
	private String referencia;
	private LocalDate fecahaInicio;
	
	public Oferta(){}
	
	
	public int getCodigoOferta() {
		return codigoOferta;
	}
	public void setCodigoOferta(int codigoOferta) {
		this.codigoOferta = codigoOferta;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public LocalDate getFecahaInicio() {
		return fecahaInicio;
	}
	public void setFecahaInicio(LocalDate fecahaInicio) {
		this.fecahaInicio = fecahaInicio;
	}


	@Override
	public String toString() {
		return "Oferta [codigoOferta=" + codigoOferta + ", referencia=" + referencia + ", fecahaInicio=" + fecahaInicio
				+ "]";
	}
	
	

}
