package entities;

public class PessoaJuridica extends Pessoa{
	
	private Integer func;

	public PessoaJuridica(String name, Double rendaAnual, Integer func) {
		super(name, rendaAnual);
		this.func = func;
	}
	
	public Integer getFunc() {
		return func;
	}

	public void setFunc(Integer func) {
		this.func = func;
	}

	@Override
	public Double imposto() {
		if(func < 10) {
			return getRendaAnual() * 0.16;
		}
		else {
			return getRendaAnual() * 0.14;
		}
			
	}
	
	
	

}
