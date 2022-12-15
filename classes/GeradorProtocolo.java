package classes;

public class GeradorProtocolo {
	 public static int proximoSequencial = 0; // próximo sequencial
	  public static final int TAM = 5; // quantidade de dígitos de identificador
	  public static final int MODULO = 7; // divisor adotado em operação de módulo
	  public static final int FATORMIN = 2; // fator mínimo de multiplicação de dígitos
	  public static final int FATORMAX = 6; // fator máximo de multiplicação de dígitos

	  public static String getProximoIdentificador() {
	    proximoSequencial++; // atualização de próximo sequencial

	    int sequencial = proximoSequencial; // obtenção de novo sequencial

	    int[] digitos = new int[TAM]; // array de digitos de identificador a ser gerado

	    // identificação de dígitos de sequencial e armazenamento em array em índices
	    // decrescentes
	    for (int i = TAM - 1; i >= 0; i--) {
	      int digito = sequencial % 10; // obtenção de enésimo dígito a partir de módulo por 10 (dez)
	      digitos[i] = digito; // armazenamento de enésimo dígito em array
	      sequencial = sequencial / 10; // remoção de último dígito de sequencial dividindo-o por 10 (dez)
	    }

	    int somaProdutos = 0; // soma de produtos de dígitos

	    int proximoFator = FATORMAX; // fator de multiplicação iniciado com constante correspondente ao valor máximo
	                                 // possível

	    // multiplicação de dígitos de identificador por fatores
	    for (int i = 0; i < TAM; i++) {
	      int produto = digitos[i] * proximoFator; // produto de enésimo dígito por fator
	      somaProdutos += produto; // atualização de soma de produtos
	      if (proximoFator == FATORMIN) // se fator equivalente à constante correspondente ao valor mínimo possível...
	        proximoFator = FATORMAX; // atualização de fator para constante correspondente ao valor máximo possível
	      else // caso contrário
	        proximoFator = proximoFator - 1; // decremento de fator em 1 (uma) unidade
	    }

	    // obtenção de dígito verificador a partir de módulo de soma de produtos por
	    // divisor definido em constante
	    int digitoVerificador = somaProdutos % MODULO;

	    String identificador = ""; // identificador formatado (sequencial e dígito separador separados por hífen)

	    // concatenação de dígitos de sequencial
	    for (int i = 0; i < TAM; i++)
	      identificador += digitos[i];

	    // concatenção de hífen e dígito verificador
	    identificador = identificador + "-" + digitoVerificador;

	    return identificador; // retorno de identificador
	  }
}
