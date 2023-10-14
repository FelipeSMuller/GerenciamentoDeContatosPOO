package treinandoOOP;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import metodos.TratamentoDados;

public class Pessoal extends Contato {

	// Atributos do objeto Pessoal(contato pessoal)
	private String endereco;

	public Pessoal(String nome, String telefone, String email, String endereco) {

		// Super indica que a classe SUPERCLASSE foi herdada, junto com seus atributos e
		// métodos getters e setters
		super(nome, telefone, email);

	}

	// Métodos getters e setters públicos para acessar os atributos encapsulados do
	// objeto
	public String getEndereco() {

		return endereco;
	}

	// O encapsulamento atua como um intermediário entre o parametro e o atributo
	public void setEndereco(String endereco) {

		TratamentoDados.verificarStrings(endereco);

		this.endereco = endereco;
	}

	@Override

	// Recebe como parametro um array dinâmico que armazena os dados dos clientes
	public void exibirInformacoes(ArrayList<String> listaDeContatos) {

		// Imprime no console o nome do contato.

		// Imprimindo os dados do array

		JOptionPane.showMessageDialog(null,
				"DADOS CADASTRADOS COM SUCESSO!!" + "\nNome:  " + nome + "\nTelefone:  "
						+ TratamentoDados.formatarTelefone(telefone) + "\nE-mail:  "
						+ TratamentoDados.formatarEmail(email) + "\nEndereço:  " + endereco);

	}

}
