package CobrancaRPA;

public class Teste extends PrestadorServico{
	
	public static void main(String[] args) {

		
		PrestadorServico prestador1 = new PrestadorServico();
		prestador1.setNomeCompleto("Pessoa");
		prestador1.setCpf("8485151");
		prestador1.setEndereco("Rua X");
		prestador1.setMatriculaINSS("15152");
		
		
		Calculo calculo1 = new Calculo();
		calculo1.setValorServico(1000.00);
		calculo1.CalcularINSS();
		calculo1.CalcularValorLiquido();
		calculo1.CalcularIR();
		
		System.out.println(calculo1);
	}

}
