package com.alfamidia.desenvolvedorjava.semana002.aula006;

public class ImcNovo extends Imc {
	public ImcNovo() { }
	
	public ImcNovo(double p, double h) {
		super(p, h);
	}
	
	@Override
	public String classificacaoImc() {
		calculaImc();
		if (this.getImc() < 16) {
			return "Magreza grave";
		} else if (this.getImc() < 17) {
			return "Magreza moderada";
		} else if (this.getImc() < 18.5) {
			return "Magreza leve";
		} else if (this.getImc() < 25) {
			return "Saudável";
		} else if (this.getImc() < 30) {
			return "Sobrepeso";
		} else if (this.getImc() < 35) {
			return "Obesidade grau I";
		} else if (this.getImc() < 40) {
			return "Obesidade grau II";
		} else {
			return "Obesidade grau III";
		}
	}
}
