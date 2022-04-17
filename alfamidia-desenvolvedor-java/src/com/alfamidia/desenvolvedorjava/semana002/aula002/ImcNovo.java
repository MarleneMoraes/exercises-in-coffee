package com.alfamidia.desenvolvedorjava.semana002.aula002;

public class ImcNovo extends Imc {
	public ImcNovo() { }
	
	public ImcNovo(double p, double h) {
		super(p, h);
	}
	
	public String classificacaoImc() {
		calculaImc();
		if (this.imc < 16) {
			return "Magreza grave";
		} else if (this.imc < 17) {
			return "Magreza moderada";
		} else if (this.imc < 18.5) {
			return "Magreza leve";
		} else if (this.imc < 25) {
			return "Saudável";
		} else if (this.imc < 30) {
			return "Sobrepeso";
		} else if (this.imc < 35) {
			return "Obesidade grau I";
		} else if (this.imc < 40) {
			return "Obesidade grau II";
		} else {
			return "Obesidade grau III";
		}
	}
}
