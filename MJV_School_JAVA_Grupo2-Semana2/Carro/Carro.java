public class Carro {
    //atributos
    String nome;
    String marca;
    int ano;
    int vel;
    
    //metodos
    void acelerar(int aceleração){
        vel += aceleração;
    }
    void acelerar(int reduzir){
        vel -= reduzir;
    }
    void buzinar(){
        System.out.println("Buzinar");
    }
}
