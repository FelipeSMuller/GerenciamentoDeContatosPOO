package treinandoOOP;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class PraticandoPOO {

	public static void main(String[] args) {

		// Adicionar diversos dados em um único array é uma prática mais coesa.
		ArrayList<String> listaDeContatos = new ArrayList<>();

		int contagem = 0;

		int opcao = 0;

		String nomeUsuario, telefoneUsuario, emailUsuario, enderecoUsuario;

		do {

			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"CADASTRO DE CONTATOS" + " \n1-Inserir novo contato pessoal"
								+ " \n2-Inserir contato profissional "
								+ "\n3-Excluir contato específico \n4-Excluir todos os contatos"));

				// Bloco try catch, recebe a entrada no prompt

			} catch (NullPointerException | NumberFormatException erro) {

				// Se o programa for fechado ou receber dados não numéricos gera um erro no
				// prompt
				JOptionPane.showMessageDialog(null,
						"Dados não numéricos foram inseridos ou o programa foi finalizado incorretamente!!!", null,
						JOptionPane.ERROR_MESSAGE);

				break;
			}

			switch (opcao) {

			case 1:

				// Entrada de dados , iniciando pelo nome
				nomeUsuario = JOptionPane.showInputDialog(null, "Insira o nome da pessoa: ");

				// ----------

				// Entrada do telefone do contato
				telefoneUsuario = JOptionPane.showInputDialog(null, "Insira o telefone dessa pessoa: ");

				// -----------

				// Email do contato
				emailUsuario = JOptionPane.showInputDialog(null, "Insira o email dessa pessoa: ");

				// Endereço do contato.

				enderecoUsuario = JOptionPane.showInputDialog(null, "Insira o endereço do contato");

				// Específicando o índice, e qual elemento será adicionado no array dinâmico,
				// nesse caso o nome e assim por diante
				listaDeContatos.add(contagem, nomeUsuario);

				listaDeContatos.add(contagem + 1, telefoneUsuario);

				listaDeContatos.add(contagem + 2, emailUsuario);

				listaDeContatos.add(contagem + 3, enderecoUsuario);

				// -----------

				// Instanciando um novo objeto do tipo Pessoal ( contato pessoal)

				// Utilizando uma convenção em Java

				Pessoal pessoal1 = new Pessoal(nomeUsuario, telefoneUsuario, emailUsuario, enderecoUsuario);

				// Acessando os atributos privados com getters e setters , que recebem os
				// dados inseridos como parametro

				pessoal1.setNome(nomeUsuario);

				pessoal1.setEmail(emailUsuario);

				pessoal1.setTelefone(telefoneUsuario);

				pessoal1.setEndereco(enderecoUsuario);

				// Imprime no console todos os dados do usuário, nome, email e telefone

				pessoal1.exibirInformacoes(listaDeContatos);

				contagem++;

				break;

			case 2:

				// Entrada de dados , iniciando pelo nome
				nomeUsuario = JOptionPane.showInputDialog(null, "Insira o nome da pessoa: ");

				// ----------

				// Entrada do telefone do contato
				telefoneUsuario = JOptionPane.showInputDialog(null, "Insira o telefone dessa pessoa: ");

				// -----------

				// Email do contato
				emailUsuario = JOptionPane.showInputDialog(null, "Insira o email dessa pessoa: ");

				// Endereço do contato.

				enderecoUsuario = JOptionPane.showInputDialog(null, "Insira o nome da empresa");

				// -------------------

				// Instanciando um novo objeto do tipo Contato Profissional
				Profissional profissional1 = new Profissional(nomeUsuario, telefoneUsuario, emailUsuario,
						enderecoUsuario);

				// Getters e setters atuando como intermediadores
				profissional1.setNome(nomeUsuario);

				profissional1.setTelefone(telefoneUsuario);

				profissional1.setEmail(emailUsuario);

				profissional1.setNomeEmpresa(enderecoUsuario);

				// Imprime no prompt o cadastro do contato profissional
				profissional1.exibirInformacoes(listaDeContatos);

				break;

			case 3:

				nomeUsuario = JOptionPane.showInputDialog(null, "Insira o nome que deseja excluir da lista");

				nomeUsuario = nomeUsuario.toLowerCase();
				// Um Iterator é uma interface em Java que permite iterar sobre os elementos de
				// uma coleção, como uma lista.
				Iterator<String> iterator = listaDeContatos.iterator();

				boolean ecnontrado = false;

				// A condição iterator.hasNext() verifica se ainda existem elementos não
				// iterados na lista. O loop continuará enquanto houver elementos para iterar.
				while (iterator.hasNext()) {

					// usando o método next() do iterador e armazenando-o na variável contato. O
					// método next() move o iterador para o próximo elemento da lista e retorna esse
					// elemento.
					String contato = iterator.next();

					// Verfica se o valor fornecido é igual ao elemento que está sendo pesquisado
					if (contato.equals(nomeUsuario)) {

						iterator.remove(); // Remove o elemento da lista

						ecnontrado = true;

						break; // Termina o loop assim que o elemento for encontrado e removido
					}
				}

				if (ecnontrado) {

					JOptionPane.showMessageDialog(null, "O nome foi encontrado e removido da lista!!");

				} else {

					JOptionPane.showMessageDialog(null, "O nome não foi encontrado!!!", null,
							JOptionPane.WARNING_MESSAGE);
				}

				break;

			case 4:

				// Atua sobre o array removendo todos os dados, nesse caso os nomes,emails e
				// telefones e endereços presentes
				// nenhum valor(void).

				listaDeContatos.clear();

				break;

			// Se nenhuma opção for selecionada , o programa é finalizado!!
			default:

				// Gera uma mensagem no prompt, com um ícone intuitivo ao usuário
				JOptionPane.showMessageDialog(null,

						"Nenhuma opção foi selecionada, portanto o programa foi finalizado!", null,

						JOptionPane.WARNING_MESSAGE);

				break;
			}

		} while (contagem <= 10 && opcao > 0);

	}

}
