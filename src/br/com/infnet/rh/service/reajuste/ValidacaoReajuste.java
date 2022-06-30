package br.com.infnet.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.infnet.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
