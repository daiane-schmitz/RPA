package CobrancaRPA;

public class Calculo extends Dados{


	public void CalcularINSS() {
		
		
		if (this.getValorServico() <= 965.67) {
			this.setValorINSS(this.getValorServico()*0.08);
		} else if (this.getValorServico() > 965.67 && this.getValorServico() < 1609.45) {
			this.setValorINSS(this.getValorServico()*0.09);
		} else if (this.getValorServico() > 1609.45 && this.getValorServico() < 3218.9) {
			this.setValorINSS (this.getValorServico()*0.11);
		} else if (this.getValorServico() > 3218.9) {
			this.setValorINSS(354.08);
		}
	}
	
	public void CalcularValorLiquido() {
		
		this.setValorLiquido(this.getValorServico() - this.getValorINSS());
		
	}
	
	
	public void CalcularIR() {
		
		if (this.getValorLiquido() <= 1434.0) {
			this.setValorIR(0);
		} else if (this.getValorLiquido() >= 1434.01 && this.getValorLiquido() <= 2150.0) {
			this.setValorIR((this.getValorLiquido()*0.075)+ 107.55);
		} else if (this.getValorLiquido() >= 2150.01 && this.getValorLiquido() <= 2866.0) {
			this.setValorIR((this.getValorLiquido()*0.15) + 268.8);
		} else if (this.getValorLiquido() >= 2866.01 && this.getValorLiquido() <= 3582.0) {
			this.setValorIR((this.getValorLiquido()*0.225) + 483.75);
		} else if (this.getValorLiquido() >= 3582.01) {
			this.setValorIR((this.getValorLiquido()*0.275) + 662.85);
		}
	
		this.setValorPagamento((this.getValorLiquido() - this.getValorIR()));

		}
	}
