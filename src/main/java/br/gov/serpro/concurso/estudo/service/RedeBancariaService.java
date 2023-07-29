package br.gov.serpro.concurso.estudo.service;

import br.gov.serpro.concurso.estudo.gateway.BancoCentralGateway;

public class RedeBancariaService {

	private BancoCentralGateway bancoCentralGateway;

	public RedeBancariaService(BancoCentralGateway bancoCentralGateway) {
		super();
		this.bancoCentralGateway = bancoCentralGateway;
	}

	public long registrarBanco(String banco) {
		return bancoCentralGateway.cadastrarBanco(banco);
	}
}
