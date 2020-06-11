package entities;

public class Lanchonete {


	public Integer code;
	private Integer quant;
	private Double total;
	
	public Lanchonete(int code, int quant) {
		this.code = code;
		this.quant = quant;
		
	}
	
	public Lanchonete(int code, int quant, double total) {
		this.code = code;
		this.quant = quant;
		this.total = total;
	}


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}

	public Double getTotal() {
		return total;
	}


	public double totalfinal(double total) {
		 return total;
	}
		
	
	
}
