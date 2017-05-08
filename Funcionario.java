
public class Funcionario {

	protected double salarioBase;
	protected int nivel;	
	private Strategy cargo;
	
    
    
    public Funcionario(Strategy cargo, double salarioBase, int nivel) {
		this.salarioBase = salarioBase;
		this.nivel = nivel;
		this.cargo = cargo;
		
	}
    
    
    public double calcularGratificacao() {
		return cargo.calcularGratificacao(this);
	}


	public double getSalarioBase() {
		return salarioBase;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	
	
	

}
