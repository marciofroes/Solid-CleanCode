package br.com.infnet.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.infnet.rh.model.Funcionario;

public class DescontoSalarial implements ValidacaoDescontos{

	@Override
	public BigDecimal descontoPorFalta(Funcionario funcionario, BigDecimal faltas) {
		BigDecimal quantidadeFaltaPermitida = new BigDecimal(1);
		BigDecimal valorDoDesconto = new BigDecimal(0);
		if (quantidadeFaltaPermitida.compareTo(faltas) == -1) {
			BigDecimal salarioAtual = funcionario.getSalario();
			BigDecimal valorDiario = salarioAtual.divide(new BigDecimal(30));
			valorDoDesconto = valorDiario.multiply(faltas);
			return valorDoDesconto;
		}
		return valorDoDesconto;
		
	}

}
