package CobrancaRPA;

public abstract class PrestadorServico {

	private String nomeCompleto;
	private String endereco;
	private String cpf;
	private String matriculaINSS;
	
	protected double valorServico;
	protected double valorPagamento;

	public PrestadorServico() {
		
	}

	public PrestadorServico(String nomeCompleto, String endereco, String cpf, String matriculaINSS, double valorServico,
			double valorPagamento) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.endereco = endereco;
		this.cpf = cpf;
		this.matriculaINSS = matriculaINSS;
		this.valorServico = valorServico;
		this.valorPagamento = valorPagamento;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatriculaINSS() {
		return matriculaINSS;
	}

	public void setMatriculaINSS(String matriculaINSS) {
		this.matriculaINSS = matriculaINSS;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}

	public double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	@Override
	public String toString() {
		return "PrestadorServico [nomeCompleto=" + nomeCompleto + ", endereco=" + endereco + ", cpf=" + cpf
				+ ", matriculaINSS=" + matriculaINSS + ", valorServico=" + valorServico + ", valorPagamento=" + valorPagamento
				+ "]";
	}


}