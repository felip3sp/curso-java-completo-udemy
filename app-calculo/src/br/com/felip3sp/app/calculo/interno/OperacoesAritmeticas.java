package br.com.felip3sp.app.calculo.interno;

import java.util.Arrays;

import br.com.felip3sp.app.logging.Logger;

public class OperacoesAritmeticas {

	public double soma(double... nums) {
		Logger.info("Somando...");
		return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
	}
}
