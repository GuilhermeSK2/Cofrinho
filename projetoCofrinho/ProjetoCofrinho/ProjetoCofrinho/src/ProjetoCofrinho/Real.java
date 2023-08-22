package ProjetoCofrinho;

public class Real extends Moeda{
	public Real(double valor) {
		super(valor);
		
	}
	
	@Override
	public double converter() {
		return valor;
	}
	@Override
	public void info() {
		System.out.println("Não e necessário fazer a conversão!");
	}
	@Override
	public String toString() {
		return "Real: " + this.converter();
	}
	
}
