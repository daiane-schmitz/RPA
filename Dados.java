package CobrancaRPA;

public abstract class Dados extends PrestadorServico{

	private double valorIR;
	protected double valorPagamento;
	private double parcelaIR;
	private double aliquotaIR;
	private double valorINSS;
	private double aliquotaINSS;
	protected double valorLiquido;
	private PrestadorServico prestador;
	
	
	public Dados() {
		
	}


	public Dados(double valorIR, double valorPagamento, double parcelaIR, double aliquotaIR, double valorINSS,
			double aliquotaINSS, double valorLiquido, PrestadorServico prestador) {
		super();
		this.valorIR = valorIR;
		this.valorPagamento = valorPagamento;
		this.parcelaIR = parcelaIR;
		this.aliquotaIR = aliquotaIR;
		this.valorINSS = valorINSS;
		this.aliquotaINSS = aliquotaINSS;
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


	public double getParcelaIR() {
		return parcelaIR;
	}


	public void setParcelaIR(double parcelaIR) {
		this.parcelaIR = parcelaIR;
	}


	public double getAliquotaIR() {
		return aliquotaIR;
	}


	public void setAliquotaIR(double aliquotaIR) {
		this.aliquotaIR = aliquotaIR;
	}


	public double getValorINSS() {
		return valorINSS;
	}


	public void setValorINSS(double valorINSS) {
		this.valorINSS = valorINSS;
	}


	public double getAliquotaINSS() {
		return aliquotaINSS;
	}


	public void setAliquotaINSS(double aliquotaINSS) {
		this.aliquotaINSS = aliquotaINSS;
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
		return "Dados [valorIR=" + valorIR + ", valorPagamento=" + valorPagamento + ", parcelaIR=" + parcelaIR
				+ ", aliquotaIR=" + aliquotaIR + ", valorINSS=" + valorINSS + ", aliquotaINSS=" + aliquotaINSS
				+ ", valorLiquido=" + valorLiquido + ", prestador=" + prestador + "]";
	}
	
}