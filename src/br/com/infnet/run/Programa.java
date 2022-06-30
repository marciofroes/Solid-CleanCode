package br.com.infnet.run;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.infnet.rh.model.Cargo;
import br.com.infnet.rh.model.Funcionario;
import br.com.infnet.rh.service.reajuste.ReajusteService;
import br.com.infnet.rh.service.reajuste.ValidacaoPercentualReajuste;
import br.com.infnet.rh.service.reajuste.ValidacaoReajuste;

public class Programa {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Tulio", "123123132", Cargo.ASSISTENTE, new BigDecimal("5.000"));
		System.out.println("############################### Reajuste Salario ###############################");
		System.out.println("Funcionario : " + funcionario.getNome());
		System.out.println("Salario atual : " + funcionario.getSalario());

		ValidacaoPercentualReajuste percentualReajuste = new ValidacaoPercentualReajuste();
		List<ValidacaoReajuste> validacoes = new ArrayList<>();
		validacoes.add(percentualReajuste);

		ReajusteService reajusteService = new ReajusteService(validacoes);
		reajusteService.reajustarSalarioDoFuncionario(funcionario, new BigDecimal("0.20"));
		System.out.println("############################### Reajuste Salario ###############################");
		System.out.println("Funcionario : " + funcionario.getNome());
		System.out.println("Salario ajustado : " + funcionario.getSalario());
	}

}
