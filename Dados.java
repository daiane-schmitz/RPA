package CobrancaRPA;

public abstract class Dados extends PrestadorServico{

	private double valorIR;
	protected double valorPagamento;
	private double valorINSS;
	protected double valorLiquido;
	private PrestadorServico prestador;
	
	public Dados() {
		
	}


	public Dados(double valorIR, double valorPagamento, double parcelaIR, double valorINSS,
			double aliquotaINSS, double valorLiquido, PrestadorServico prestador) {
		super();
		this.valorIR = valorIR;
		this.valorPagamento = valorPagamento;
		this.valorINSS = valorINSS;
		this.valorLiquido = valorLiquido;
		this.prestador = prestador;
	}


	public double getValorIR() {
		return valorIR;
	}


	public void setValorIR(double valorIR) {
		this.valorIR = valorIR;
	}


	public double getValorPagamento() {
		return valorPagamento;
	}


	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}


	public double getValorINSS() {
		return valorINSS;
	}


	public void setValorINSS(double valorINSS) {
		this.valorINSS = valorINSS;
	}



	public double getValorLiquido() {
		return valorLiquido;
	}


	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}


	public PrestadorServico getPrestador() {
		return prestador;
	}


	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}


	@Override
	public String toString() {
		return "Dados [valorIR=" + valorIR + ", valorPagamento=" + valorPagamento + ", valorINSS=" + valorINSS + ", valorLiquido=" + valorLiquido + ", prestador=" + prestador + "]";
	}
	
}