package calculo;

public class CalculoImc {

	private double peso;
	private double altura;
	private double Altura;

	public double getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = Double.parseDouble(peso);
	}

	public double getAltura() {
		return altura;

	}

	public void setAltura(String altura) {
		this.peso = Double.parseDouble(altura);
	}

	public double calcularImc() {
		double imc = peso / Math.pow(altura, 2);
		return imc;

	}
	
	public String mostrarImcComoString() {
		return String.valueOf(calcularImc());
	}

	
	public String mostrarStatusImc() {
		if (calcularImc() <= 18.5) {
			return "Abaixo do Peso!";
		} else if (calcularImc() >= 18.6 && calcularImc() < 25) {
			return "Peso Ideal";
		} else if (calcularImc() >= 25.0 && calcularImc() < +30) {
			return "Levemente Acima do peso";
		} else if (calcularImc() >= 30.0 && calcularImc() < 35) {
			return "Obesidade Grau 1";
		} else if (calcularImc() >= 35.0 && calcularImc() < 40) {
			return "Obesidade Grau 2";
		} else {
			return "Obesidade Grau 3";
		}

	}

}
