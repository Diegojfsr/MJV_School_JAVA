package fichaprofissional.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import fichaprofissional.model.Informacoes;

public class InformacaoPrint {
    public void imprimir(Informacoes informacoes){

        //NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.ENGLISH);

        StringBuilder ficha = new StringBuilder();

        ficha.append("*****************************************************************************************************************\n");
        
        ficha.append("----------------------------- FICHA PROFISSIONAL -----------------------------\n");
		
        ficha.append("NOME:" + informacoes.getNome() + "\n");
        ficha.append("PROFISSAO:" + informacoes.getProfissao() + "\n");
        
        ficha.append("DATA NASC.:" + informacoes.getDataNascimento());   ficha.append(" / CPF:" + informacoes.getCpf()); ficha.append(" / RG:" + informacoes.getRg() + "\n");
        ficha.append("ENDERECO:" + informacoes.getEndereco() + "\n");
        ficha.append("NUM.:" + informacoes.getNumeroCasa());   ficha.append(" / BAIRRO:" + informacoes.getBairro()); ficha.append(" / MUNICIPIO:" + informacoes.getRg()); ficha.append(" / UF:" + informacoes.getUf() + "\n");
        ficha.append("CEP:" + informacoes.getCep());   ficha.append(" / NATURALIDADE:" + informacoes.getNaturalidade()); ficha.append(" / PAIS:" + informacoes.getPais() + "\n");
        ficha.append("TELEFONE:" + informacoes.getTelefone());   ficha.append(" / CEL.:" + informacoes.getCelular() + "\n");
        ficha.append("EMAIL:" + informacoes.getEmail() + "\n");
        

        ficha.append("----------------------------- SALARIO REQUERIDO -----------------------------\n");
        //ficha.append(" => MINIMO:" + nf.format(informacoes.getSalarioMinimo()) + "\n");
        ficha.append(" => MINIMO: R$" + informacoes.getSalarioMinimo() + "\n");    
        ficha.append(" => MAXIMO: R$" + informacoes.getSalarioMaximo() + "\n");


        ficha.append("----------------------------- GRAU DE INSTRUÇÃO-----------------------------\n");
        ficha.append("Analfabeto                []"); ficha.append("  | Ensino Fundamental      []"); ficha.append("  | Superior  [X]\n");
        ficha.append("Le e Escreve              []"); ficha.append("  | Ensino Medio Incompleto []"); ficha.append("  | Mestrado  []\n");
        ficha.append("Fundamental Incompleto    []"); ficha.append("  | Ensino Medio Completo   []"); ficha.append("  | Doutorado []\n");

        ficha.append("----------------------------------------------------------------------------\n");

        ficha.append("*****************************************************************************************************************\n");



        System.out.println(ficha);
    }
}
