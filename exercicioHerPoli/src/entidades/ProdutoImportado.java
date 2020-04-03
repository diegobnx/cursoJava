package entidades;

public class ProdutoImportado extends Produto{

	private Double taxaAlfandega;
	
	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}
	
	public void setTaxaAlfandega() {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double precoTotal() {
		return getPreco() + taxaAlfandega;
	}
	
	@Override
	public String etiqueta() {
		return getNome() + " $ " + String.format("%.2f", precoTotal()) + "(Taxa da Alfandega: $" + String.format("%.2f", taxaAlfandega) + ")";
	}
}
