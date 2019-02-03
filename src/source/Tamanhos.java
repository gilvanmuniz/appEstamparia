package source;

public class Tamanhos {
  
	private int pp = 0;
	private int p = 0;
	private int m = 0;
	private int g = 0;
	private int gg = 0;
	private int exg = 0;
	private int quantityTotal;
	
	public Tamanhos() {
				
	}
	
	public int getPP() {
		return pp;
	}
	public void setPP(int pP) {
		pp = pP;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getGg() {
		return gg;
	}
	public void setGg(int gg) {
		this.gg = gg;
	}
	public int getExg() {
		return exg;
	}
	public void setExg(int exg) {
		this.exg = exg;
	}
	
    public int totalQuantity() {
    	
    	quantityTotal = pp + p + m + g + gg + exg;
    	return quantityTotal;
    }
}
