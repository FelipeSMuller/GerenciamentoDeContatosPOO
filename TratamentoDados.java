package metodos;

import javax.swing.JOptionPane;

public class TratamentoDados {

	// Método de verificação para strings
	public static void verificarStrings(String palavra) {

		// Verifica se o campo está vazio, se estiver gera um erro
		if (palavra.equals("")) {

			// Imprime no prompt uma mensagem de erro com um ícone intuitivo
			JOptionPane.showMessageDialog(null, "O campo está vazio, porém precisa ser preenchido corretamente!!", null,
					JOptionPane.ERROR_MESSAGE);
		}

		else {

			// Converte uma palavra em letras minusculas.

			palavra = palavra.toUpperCase();

			// remove os espaços iniciais e finais de um dado fornecido.

			palavra = palavra.trim();

		}
	}

	public static String formatarTelefone(String telefone) {

		// Substitui a primeira ocorrencia DE por X.
		String telefoneFormatado = telefone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

		return telefoneFormatado;

	}

	public static String formatarEmail(String email) {

		String emailFormatado = email.replaceFirst("_", "@");

		return emailFormatado;

	}

}
