public class operadores {
    
    public static void main(String[] args) {



// operadores relacionas compara com o operador a esquerda 
int numero1 = 1;
int numero2 = 2;

boolean simNao = numero1 == numero2;

System.out.println("numero 1 é igual a numero 2? " + simNao);

    }

    public static void contatenação() {

        //contatenação        
String nomeCompleto = "LIGUAGUEM" + "JAVA";

System.out.println(nomeCompleto);

String contatenacao = "?";
contatenacao = 1 + 1 + 1 + "1";

System.out.println(contatenacao);

contatenacao = 1 + "1" + 1 + 1;

System.out.println(contatenacao);

contatenacao = "1" + 1 + 1 + 1;

System.out.println(contatenacao);

contatenacao = "1" + (1 + 1 + 1);

System.out.println(contatenacao);

    }

    public static void operadorUnários() {

        //operador unários 
int numero = 5;

System.out.println(- numero);

System.out.println(numero);
//troca de positivo para negativo
numero = - numero;

System.out.println(numero);
// torna o valor positivo novamente 
numero = numero * -1;

System.out.println(numero);

//incremento de numero 
numero++;
//igual a numero = numero + 1
System.out.println(numero);
//negando o valor 
boolean varival = true;

System.out.println(!varival);

varival = !varival;

System.out.println(varival);

    }

    public static void ternário() { 

        //ternário
    int a, b;

    a = 5;
    b = 6;

    //abreviaçao de fi e else
    String resultado = a == b ? "verdadeiro" : "falso";

    System.out.println(resultado);

    }

    public static void operadoresRelacionas() { 

        // operadores relacionas compara com o operador a esquerda 
    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    System.out.println("numero 1 é igual a numero 2? " + simNao);

}

    public static void logico() {

        //para ligar 2 condicoes 
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {

            System.out.println("as duas condicoes sao verdadeiras");

        }
         if(condicao1 || condicao2) {

            System.out.println("uma condicoes sao verdadeiras");

        }
        // relacional tembem pode ser usada
        if(condicao1 && (7 > 4)) {

            System.out.println("as duas condicoes sao verdadeiras");

        }

    }

}
