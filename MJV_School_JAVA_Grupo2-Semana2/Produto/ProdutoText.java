public class ProdutoText{

    public static void main(String [] args){
        //Construtor Padrão
        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.valor = 1.50f;

        //Construtor dois paramentro
        Produto p2 = new Produto("Caneta Vermelha", "Faber");
        p2.valor = 1.69f;

        //Construtor tr~es parametros
        Produto p3 = new Produto("Borracha", "Mercur", 1.89f);

        //Objeto
        System.out.println("Nome:" + p1.nome + "Marca:" + p1.marca + "Valor:" + p1.valor) ;
    }
}

    