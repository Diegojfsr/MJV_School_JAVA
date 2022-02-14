package fichaprofissional.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import fichaprofissional.model.Informacoes;
import fichaprofissional.model.UnidadeFederativa;

public class LeitorInformacoes {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//dataconverter = converte o campo datanascimento
	
	
	private List<String> ler(String caminhoArquivo) {
		 try {
	            List<String> informacoes = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.ISO_8859_1);
	            return informacoes;

	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	}
	public List<Informacoes> converter (String caminhoArquivo){
		List<String> registros = ler(caminhoArquivo);
		List<Informacoes> informacoes = new ArrayList<>();
		for(String linha: registros) {
			
			String[] campos=linha.split(";");
			Informacoes i = new Informacoes();
			i.setProfissao(campos[0]);
			i.setNome(campos[1]);
			i.setSalarioMinimo(Double.valueOf(campos[2]));
			i.setSalarioMaximo(Double.valueOf(campos[3]));
			i.setCpf(campos[5]);
			i.setRg(campos[6]);
			i.setEndereco(campos[7]);
			i.setNumeroCasa(campos[8]);
			i.setBairro(campos[9]);
			i.setMunicipio(campos[10]);
			i.setUf(UnidadeFederativa.valueOf(campos[11]));
			i.setCep(campos[12]);
			i.setNaturalidade(campos[13]);
			i.setPais(campos[14]);
			i.setTelefone(campos[15]);
			i.setCelular(campos[16]);
			i.setEmail(campos[17]);
			
				
			String date = campos[4];
			LocalDate data = LocalDate.parse(date,formatter);
			i.setDataNascimento(data);
			
			informacoes.add(i);
		
		}
		
		return informacoes;
	}
}