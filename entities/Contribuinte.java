package entities;

public abstract class Contribuinte {

	protected String name;
	protected Double rendaAnual;

	public Contribuinte() {

	}

	public Contribuinte(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public Double getRandaAnual() {
		return rendaAnual;
	}

	public abstract Double calcularImposto();

}
