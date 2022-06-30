package br.com.infnet.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.infnet.rh.model.Funcionario;

public interface ValidacaoDescontos {

	BigDecimal descontoPorFalta(Funcionario funcionario,BigDecimal faltas);
	
}
