package source;

public class Product {
	
	private String malha;
	private String tipo;
	private String cor;
	private double peso;
	private String data;
	private double yield;
	
	
	public Product(String tipo, String malha, String cor) {		
		this.tipo = tipo;
		this.malha = malha;
		this.cor = cor;
	}

	public String getMalha() {
		return malha;
	}

	public void setMalha(String malha) {
		this.malha = malha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPeso() {
		return  peso;
	}

	public double setPeso(double peso) {
		return this.peso = peso;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
    
	public double rendimento(double peso, double quantity) {
		
		yield = quantity / peso;
		return yield;
	}
	
	public String toString() {
		
		return malha + " - " + cor + " - "  +  peso + "\n "
				+ "rendimento: " + String.format("%.2f", yield) ;
	}
	
}
