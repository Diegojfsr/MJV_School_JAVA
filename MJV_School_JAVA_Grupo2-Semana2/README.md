# MJV_School_JAVA_Grupo2

<p>Repositório destinado a documentar todos os trabalhos, exercícios e projetos desenvolvidos em Grupos durante todo o DevSchool-MJV.</p>
<h4>Grupo 02: DiegoJfsr/Camila/elisabete/Erika/Isael/Mariana/NataliaS/Priscila</h4>
<h2>DESAFIO:</h2>

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h4>1-Realizar uma breve descrição da classe em questão;</h4>
<h6>Classes Wrappers</h6>
<p> 
 	Os Wrapper são conhecidos na linguagem Java como classes especiais que possuem métodos capazes de fazer conversões em variáveis primitivas e também de encapsular tipos primitivos para serem trabalhados como objetos, ou seja, é feita um embrulho de streams que são fluxo de dados através de canais.
	Sendo assim, existe uma classe Wrapper para cada tipo primitivo identificado pelo mesmo nome do tipo que possui e tendo a primeira letra maiúscula. Essa regra de declaração é aplicada a todos os tipos, exceto aos que são, char classificados como Character e boolean como Boolean. 
</p>
<h6>Java.lang.Integer</h6>
<p>
	Integer é uma classe Wrapper do tipo primitivo int, ou seja, uma tipologia que quando você declara não é inicializada pela linguagem. O integer aceita o mesmo tipo de valores que a o int.
	Sua principal diferença é que, na declaração, Integer começa com letra maiúscula e possibilita a declaração de valores nulos. Sendo assim, mesmo que o usuário digitou 0 você saberá que ele digitou algo. Caso não tenha digitado nada a variável traz um valor nulo ("null).
</p>
<h6>Java.Lang.Double</h6>
<p>
 	Double é uma classe wrapper para o tipo primitivo double que contém vários métodos para lidar com um valor duplo, como convertê-lo em uma representação de string e vice-versa.
</p>

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h4>2-Apresentar alternativas de instanciação de objetos com construtor ou metódo singleton;</h4>
<h5>Classe Java.lang.Integer </h5>

- `Integer (int b)`: Cria um objeto Integer inicializado com o valor fornecido.
<p>Sintaxe:</p>

```
public Integer(int b)
```
Parâmetros:

```
b : value with which to initialize
```

- `Integer (String s)`:  Cria um objeto Integer inicializado com o valor int fornecido pela representação de string. A raiz padrão é considerada 10.

Sintaxe: 
```
public Integer(String s) throws NumberFormatException
```
Parâmetros:
```
s : string representation of the int value 
```
<h5>Classe Java.Lang.Double </h5>

- `Double (double b)`:  Cria um objeto Double inicializado com o valor fornecido. 

Sintaxe:
```
public Double(Double d)
````
Parâmetros: 

```
d : value with which to initialize
```
- `Double (String s)`:  Cria um objeto Double inicializado com o valor double analisado fornecido pela representação de string. A raiz padrão é considerada 10. 

Sintaxe:

```
public Double(String s) throws NumberFormatException
```
Parâmetros:

```
s : string representation of the byte value 
```

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h4>3-Apresentar no mínimo 04 métodos mais utilizados destacando o seu contrato (tipo retorno + nome + parâmetros);</h4>

<br>

**ToString()**
<p> O java.lang.Integer.toString() é um método embutido em Java que é usado para retornar o objeto String que representa o valor deste Integer.</p>

Sintaxe:

public static String toString()

Parâmetros: o método não aceita nenhum parâmetro.
<br> Valor de retorno: O método retorna o objeto string do valor inteiro específico.

O programa abaixo ilustra o método Java.lang.Integer.toString():
```
// Java programa ilustração
// Metodo toString() 
import java.lang.*;
  
public class Exemplo{
  
public static void main(String[] args) {
  
    Integer obj = new Integer(8);
      
    //Retorno da representação string  
    String stringvalue1 = obj.toString();
    System.out.println("Valor String= " + 
                            stringvalue1);
      
        Integer obj3 = new Integer(10);
      
    //Retorno da representação string
    String stringvalue3 = obj3.toString();
    System.out.println("Valor String = " + 
                            stringvalue3);
      
}
}
````
Saída:

```
Valor da string = 8
Valor da string = 10

```

**valueOf()**

<p> O java.lang.Integer.valueOf ( int a ) é um método embutido que é usado para retornar uma instância Integer que representa o valor int especificado a. </p>

Sintaxe:

public static Integer valueOf ( int a )

Parâmetros: O método aceita um único parâmetro a do tipo inteiro que representa o parâmetro cuja instância Integer deve ser retornada.
<br>Valor de retorno: O método retorna uma instância Integer que representa a .


O programa abaixo ilustram o método java.lang.Integer.valueOf (int a). 

```
import java.lang.*;
  
public class Exemplo {
  
    public static void main(String[] args)
    {
  
        Integer obj = new Integer(10);
  
        System.out.println("Valor Saída = " + 
                            obj.valueOf(85));
    }
}

```
Saída:

```
Valor de saída = 85
```

O **java.lang.Integer.valueOf ( String str )** é um método embutido que é usado para retornar um objeto Integer, mantendo o valor do String str especificado .
Sintaxe:
```
public static Integer valueOf ( String str )
```
Parâmetros: Este método aceita um único parâmetro str do tipo String que deve ser analisado.

Valor de retorno: O método retorna um objeto Integer contendo o valor representado pelo argumento string.

O programa abaixo ilustram o método java.lang.Integer.valueOf (String str):

```
import java.lang.*;
  
public class Examplo {
  
    public static void main(String[] args)
    {
  
        Integer obj = new Integer(8);
  
        String str = "424";
        // It will return  a Integer instance
        // representing  the specified string
        System.out.println("Valor inteiro = " + 
                            obj.valueOf(str));
    }
}
```
Saída:

```
Valor inteiro = 424
````

**parseDouble()**

parseDouble(): retorna o valor duplo ao analisar a string. Difere de valueOf() porque retorna um valor duplo primitivo e valueOf() retorna um objeto Double. 

```
Syntax : public static double parseDouble(String val)
             throws NumberFormatException
Parameters :
val : String representation of double 
Throws :
NumberFormatException : if String cannot be parsed to a double value in given radix.
```
```
public class Exemplo
{
 
    public static void main(String[] args)
    {
   
   	String bb = "45";
	Double y = new Double(bb);
    
      // parseDouble()
        // return primitive double value
        double zz = Double.parseDouble(bb);
        System.out.println("parseDouble(bb) = " + zz);
	
	}
 
}
```
Saída:

```
parseDouble(bb) = 45.0
```


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h4>4-Apresentar se alguns dos métodos é sobrecarregado;</h4>


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h4>5-Realizar uma demonstração adaptando o uso dos métodos (mínimo 04) em situações do cotidiando (use a imaginação);</h4>


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h2>Referências:</h2>
https://cursos.alura.com.br/forum/topico-o-que-e-um-interger-57527
<br>https://acervolima.com/classe-java-lang-double-em-java/
<br>https://acervolima.com/classe-java-lang-integer-em-java/

