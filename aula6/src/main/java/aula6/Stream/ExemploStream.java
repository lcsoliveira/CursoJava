package aula6.Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

public class ExemploStream {

	public static void main(String[] args) throws IOException {

		// Exemplo leitura de Arquivo

		gravarArquivo();
		lerArquivo();
		gravarArquivoComWriter();
		lerArquivoReader();
	}

	private static void gravarArquivoComWriter() throws IOException {

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				"/home/java01/exemplo_writer.txt"))) {

			bufferedWriter.write("Gravando em arquivo usando writer");
		}

	}

	private static void lerArquivoReader() throws FileNotFoundException,
			IOException {
		// TODO Auto-generated method stub

		try (BufferedReader reader = new BufferedReader(new FileReader(
				"/home/java01/exemplo_writer.txt"))) {

			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}

		}
	}

	private static void lerArquivo() throws IOException {
		try (FileInputStream fileInputStream = new FileInputStream(
				"/home/java01/exemplo.txt")) {

			byte buffer[] = new byte[1024]; // leitura com buffer estamos lendo
											// parte a parte do arquivo
			int read = fileInputStream.read(buffer); // como se sabe que a
														// leitura do arquivo
														// chegou no fim? Quando
														// read = -1

			while (read != -1) {

				System.out.println(new String(buffer, 0, read));
				read = fileInputStream.read(buffer);
				// buffer é a quantidade de bytes que está lendo por vez
			}
		}
	}

	private static void gravarArquivo() throws IOException,
			FileNotFoundException {
		String conteudoDoArquivo = "Meu conteudo do arquivo usando java";

		// Poderiam ser criado qualquer tipo de arquivo desde que eu passe os
		// bytes corretos para o arquivo
		try (FileOutputStream out = new FileOutputStream(
				"/home/java01/exemplo.txt")) {

			out.write(conteudoDoArquivo.getBytes());

		}
	}

}
