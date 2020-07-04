package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public final Double calcularImposto() {
		Double totalImposto = 0.0;

		if (rendaAnual < 20000) {

			totalImposto = rendaAnual * 0.15;

		} else {

			totalImposto = rendaAnual * 0.25;
			

		}

		if (gastosSaude > 0) {
			totalImposto -= (gastosSaude / 2);
		}

		return totalImposto;

	}

}
