package br.com.accenture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioAccentureApplication {
	public static char converterNumeroPraTecla(int numTeclas, char tecla) {
		char retorno = ' ';
		switch (tecla) {
		case '2':
			switch (numTeclas) {
			case 1:
				retorno = 'A';
				break;
			case 2:
				retorno = 'B';
				break;
			case 3:
				retorno = 'C';
				break;
			default:
				break;
			}
			break;
		case '3':
			switch (numTeclas) {
			case 1:
				retorno = 'D';
				break;
			case 2:
				retorno = 'E';
				break;
			case 3:
				retorno = 'F';
				break;
			default:
				break;
			}
			break;
		case '4':
			switch (numTeclas) {
			case 1:
				retorno = 'G';
				break;
			case 2:
				retorno = 'H';
				break;
			case 3:
				retorno = 'I';
				break;
			default:
				break;
			}
			break;
		case '5':
			switch (numTeclas) {
			case 1:
				retorno = 'J';
				break;
			case 2:
				retorno = 'K';
				break;
			case 3:
				retorno = 'L';
				break;
			default:
				break;
			}
			break;
		case '6':
			switch (numTeclas) {
			case 1:
				retorno = 'M';
				break;
			case 2:
				retorno = 'N';
				break;
			case 3:
				retorno = 'O';
				break;
			default:
				break;
			}
			break;
		case '7':
			switch (numTeclas) {
			case 1:
				retorno = 'P';
				break;
			case 2:
				retorno = 'Q';
				break;
			case 3:
				retorno = 'R';
				break;
			case 4:
				retorno = 'S';
				break;
			default:
				break;
			}
			break;
		case '8':
			switch (numTeclas) {
			case 1:
				retorno = 'T';
				break;
			case 2:
				retorno = 'U';
				break;
			case 3:
				retorno = 'V';
				break;
			default:
				break;
			}
			break;
		case '9':
			switch (numTeclas) {
			case 1:
				retorno = 'W';
				break;
			case 2:
				retorno = 'X';
				break;
			case 3:
				retorno = 'Y';
				break;
			case 4:
				retorno = 'Z';
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
		return retorno;
	}
	
	public static String converterNumerosParaTexto(String numeros) {
		char tecla = '2';
		char teclaRetorno = ' ';
		String numerosRetorno = "";
		int numTeclas = 0;
		if (numeros.charAt(numeros.length() - 1) != ' ') {
			numeros = numeros + " ";
		}
		char[] numCharArray = numeros.toCharArray();
		for (char output : numCharArray) {
			switch (output) {
			case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
				tecla = output;
				numTeclas++;
				break;
			case ' ':
				teclaRetorno = converterNumeroPraTecla(numTeclas, tecla);
				numerosRetorno = numerosRetorno + teclaRetorno;
				numTeclas = 0;
				break;
			}
		}
		return numerosRetorno;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioAccentureApplication.class, args);
	}

}
