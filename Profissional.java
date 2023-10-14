package treinandoOOP;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import metodos.TratamentoDados;

public class Profissional extends Contato {

	// Atributo do objeto profissional(contato profissional).
	private String nomeEmpresa;

	public Profissional(String nome, String telefone, String email, String nomeEmpresa) {
		super(nome, telefone, email);
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	// O encapsulamento atua como um intermediário entre o parametro e o atributo

	public void setNomeEmpresa(String nomeEmpresa) {

		// Método para tratamento de Strings, verificando se o valor corresponde
		TratamentoDados.verificarStrings(nomeEmpresa);

		this.nomeEmpresa = nomeEmpresa;
	}

	public void exibirInformacoes(ArrayList<String> listaDeContatos) {

		JOptionPane.showMessageDialog(null,
				"DADOS CADASTRADOS COM SUCESSO!" + "\nNome:  " + nome + "\nTelefone:  "
						+ TratamentoDados.formatarTelefone(telefone) + "\nE-mail:  "
						+ TratamentoDados.formatarEmail(email) + "\nNome da empresa:  "
						+ nomeEmpresa);

	}

}
