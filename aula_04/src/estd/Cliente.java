package estd;

import java.util.List;

public abstract class Cliente extends Entidade {
	public String nome;
	public String telefone;
	public String endereco;
	public List<Emprestimo> emprestimos;
}
