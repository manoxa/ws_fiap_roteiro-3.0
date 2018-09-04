package com.fiap.faturamento.processor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.LoggingLevel;
import org.apache.camel.util.CamelLogger;

import com.fiap.faturamento.jaxb.notafiscal.Notafiscal;
import com.fiap.faturamento.jaxb.pedido.Pedido;

public class PedidoProcessor {

	private final CamelLogger logger = new CamelLogger(PedidoProcessor.class.getCanonicalName(), LoggingLevel.INFO);
	
	public Notafiscal processar(Pedido pedido) {
		logger.getLog().info("Processando o pedido: " + pedido.getId());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Notafiscal nf = new Notafiscal();
		
		nf.setNumeroNf(pedido.getId());
		nf.setVencimento(pedido.getVencimento());
		nf.setCpf(pedido.getCpf());
		nf.setValor(pedido.getValor());
		nf.setImpostos(pedido.getValor()*0.17);
		nf.setTransportadora(pedido.getTransportadora());
		nf.setProduto(pedido.getProduto());
		nf.setEmissao(sdf.format(new Date()));
		
		return nf;
	}

}
