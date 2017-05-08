
public class MAIN {

	public static void main(String[] args) {
		
		Funcionario funcionarioDesenvolvedor = new Funcionario(Gratificacao.DESENVOLVEDOR, 100, 1);
		System.out.println(funcionarioDesenvolvedor.calcularGratificacao());
		
		
		Funcionario funcionarioDBA = new Funcionario(Gratificacao.DBA, 100, 1);
		System.out.println(funcionarioDBA.calcularGratificacao());
		
		
		Funcionario funcionarioGerente = new Funcionario(Gratificacao.GERENTE, 100, 1);
		System.out.println(funcionarioGerente.calcularGratificacao());
		
		Funcionario funcionarioLider = new Funcionario(Gratificacao.LIDER, 100, 1);
		System.out.println(funcionarioLider.calcularGratificacao());
		

	}

}
