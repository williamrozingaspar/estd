package estd;

import java.util.Date;
import java.util.List;

public class Emprestimo extends Entidade{
	public int prazo;
	public Date data;
	public Double valorTotal;
	public Double taxaJuros;
	public List<Parcela> parcelas;
}
