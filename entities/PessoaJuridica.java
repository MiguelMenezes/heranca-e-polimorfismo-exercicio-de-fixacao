package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer numFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, Integer numFuncionarios) {
		super(name, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public final Double calcularImposto() {
		Double totalImposto = 0.0;

		if (numFuncionarios <= 10) {
			totalImposto = rendaAnual * 0.16;
		} else {
			totalImposto = rendaAnual * 0.14;
		}
		return totalImposto;

	}

}
