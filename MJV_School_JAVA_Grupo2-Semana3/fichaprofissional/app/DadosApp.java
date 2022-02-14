package fichaprofissional.app;

import java.util.List;

import fichaprofissional.model.Informacoes;
import fichaprofissional.util.InformacaoPrint;
import fichaprofissional.util.LeitorInformacoes;

public class DadosApp {
	public static void main(String[] args) {
		LeitorInformacoes leitor = new LeitorInformacoes();
		
		List<Informacoes> informacoes = leitor.converter("C:\\Users\\diego\\OneDrive\\Área de Trabalho\\MJV_School_JAVA_Grupo2-Semana2\\informacoes.csv");
	
        InformacaoPrint printer = new InformacaoPrint();

		//todas as informações de uma so vez
		for(Informacoes t : informacoes){
			printer.imprimir(t);
		}

		//Uma informaçao por vez
        //printer.imprimir(informacoes.get(0));
		//printer.imprimir(informacoes.get(1));
		
	}
}
