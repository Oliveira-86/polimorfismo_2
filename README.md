# Herança e Polimorfismo

## - Herança

• É um tipo de associação que permite que uma classe herde todos dados e
comportamentos de outra
• Definições importantes
• Vantagens
• Reuso
• Polimorfismo
• Sintaxe
• class A extends B.

### Exemplo:

### 1.  A SuperClasse:



	public abstract class Pessoa {
	private String name;
	private Double rendaAnual;
	
	public Pessoa() {
	}

	public Pessoa(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double imposto();
	}
	
### 2. A SubClasse herda os atributos da Superclasse:


	public class PessoaFisica extends Pessoa {
	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

#### Obs.: Herança é uma associação entre classes (e não entre objetos).


### - Upcasting
 • Casting da subclasse para superclasse
 • Uso comum: polimorfismo

### - Downcasting 
 • Casting da superclasse para subclasse
 • Palavra instanceof
 • Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)

### - Polimorfismo
Em Programação Orientada a Objetos, polimorfismo é recurso que
permite que variáveis de um mesmo tipo mais genérico possam
apontar para objetos de tipos específicos diferentes, tendo assim
comportamentos diferentes conforme cada tipo específico.

A associação do tipo específico com o tipo genérico é feita em tempo de
execução (upcasting). O compilador não sabe para qual tipo específico a chamada do método.

#### Exemplo:

			if(ch == 'f') {
				System.out.print("Health expenditures: ");
				Double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Número de Funcionarios: ");
				int func = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, func));
			}
			}
			
### Sobreposição ou sobrescrita

• É a implementação de um método de uma superclasse na subclasse:
• É fortemente recomendável usar a anotação ###@Override em um método sobrescrito

	@Override
	public Double imposto() {
		if(getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - gastoSaude * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - gastoSaude * 0.5;
		} 
	}

### Palavra super
É possível chamar a implementação da superclasse usando a palavra super.
#### Exemplo:
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
