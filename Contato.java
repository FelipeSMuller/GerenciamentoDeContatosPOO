package treinandoOOP;

import metodos.TratamentoDados;

import java.util.ArrayList;

public class Contato {

	// Atributos do objeto contato

	protected String nome;

	protected String telefone;

	protected String email;

//Método construtor
	public Contato(String nome, String telefone, String email) {

		this.nome = nome;

		this.telefone = telefone;

		this.email = email;
	}

	// Getters e setters para acesso dos atributos , recebem o array dinâmico como
	// parâmetro
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		// Verifica se há algum erro com o dado que foi inserido
		TratamentoDados.verificarStrings(nome);

		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {

		// Verifica se há algum erro com o dado que foi inserido

		TratamentoDados.verificarStrings(telefone);

		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {

		TratamentoDados.verificarStrings(email);

		this.email = email;
	}

	// Exibe no prompt as informações do usuário
	public void exibirInformacoes(ArrayList<String> contatos) {

	}

}
