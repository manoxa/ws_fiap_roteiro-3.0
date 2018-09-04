package com.fiap.cobranca.processor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Body;
import org.apache.camel.LoggingLevel;
import org.apache.camel.util.CamelLogger;

import com.fiap.cobranca.model.jaxb.boleto.Boleto;
import com.fiap.cobranca.model.jaxb.pedido.Pedido;

public class BoletoProcessor {

	private final CamelLogger logger = new CamelLogger(BoletoProcessor.class.getCanonicalName(), LoggingLevel.INFO);
	
	/**
	 * Processa um boleto.
	 * 
	 * A anotacao antes do parametro ajuda o Camel a fazer as conversoes corretas.
	 * 
	 * @param boleto
	 * @return
	 */
	public Boleto processa( @Body Pedido pedido ) {
		
		logger.getLog().info("*** BoletoProcessor.processa(): Processando o pedido "+pedido.getId());

		Boleto boleto = new Boleto();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		boleto.setId(pedido.getId());
		boleto.setCpf(pedido.getCpf());
		boleto.setValor(pedido.getValor());
		boleto.setVencimento(pedido.getVencimento());
		boleto.setDeposito(false);
		boleto.setPago(false);
		boleto.setRecebedora("Banco Itau");
		boleto.setProcessamento(sdf.format(new Date()));
		
		return boleto;
	}
	
	/**
	 * Simula a situacao de um boleto ter sido pago por deposito ou nao.
	 * A estimativa eh de que 60% dos boletos sao pagos em depositos diretos
	 * na conta da empres ao inves do banco.
	 * 
	 * @param boleto
	 * @return
	 */
	public Boleto verificaDeposito( Boleto boleto) {

		logger.getLog().info("*** BoletoProcessor.verificaDeposito(): Verificando o deposito do titulo "+boleto.getId());

		double prop = Math.random() * 100;
		
		logger.getLog().info("*** verificaDeposito(): Probabilidade = " + prop);
		
		/*
		 * Simula que
		 * 60% dos boletos nao pagos no banco
		 * sao pagos via deposito em conta, 
		 * os demais 40% permanecem em aberto.
		 */
		if (prop > 60) {
			boleto.setDeposito(true);
			logger.getLog().info("*** Boleto " + boleto.getId() + " pago por deposito.");
		} else {
			boleto.setDeposito(false);
			logger.getLog().info("*** Boleto " + boleto.getId() + " nao pago.");
		}
		
		return boleto;
	}

}
