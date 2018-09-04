package com.fiap.banco.processor;

import org.apache.camel.LoggingLevel;
import org.apache.camel.util.CamelLogger;

import com.fiap.banco.model.Boleto;

public class TituloProcessor {

	private final CamelLogger logger = new CamelLogger(TituloProcessor.class.getCanonicalName(), LoggingLevel.INFO);
	
	public Boleto processa(Boleto boleto) {
		
		double prop = Math.random() * 100;
		
		logger.getLog().info("Probabilidade = " + prop);
		
		/*
		 * Simula uma situacao onde
		 * 30% dos titulos nao sao pagos e os
		 * demais 70% sao pagos normalmente.
		 */
		if (prop > 30) {
			boleto.setPago(true);
			logger.getLog().info("Boleto " + boleto.getId() + " pago.");
		} else {
			boleto.setPago(false);
			logger.getLog().info("Boleto " + boleto.getId() + " nao pago.");
		}

		
		return boleto;
	}
	
}
