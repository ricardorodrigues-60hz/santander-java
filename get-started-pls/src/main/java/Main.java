public class Main {

    public static void main(String[] args) {

        ///////////////////////////////////////
        // Tipos & Variáveis
        ///////////////////////////////////////

        // Declara-se variáveis usando <tipo> <nome> [
        // Byte - inteiro de 8 bits com sinal complementado a dois
        // (-128 <= byte <= 127)
        byte fooByte = 100;

        // Short - inteiro de 16 bits com sinal complementado a dois
        // (-32,768 <= short <= 32,767)
        short fooShort = 10000;

        // Integer - inteiro de 32 bits com sinal complementado a dois
        // (-2,147,483,648 <= int <= 2,147,483,647)
        int fooInt = 1;

        // Long - inteiro de 64 bits com sinal complementado a dois
        // (-9,223,372,036,854,775,808 <= long <= 9,223,372,036,854,775,807)
        long fooLong = 100000L;
        // L é usado para indicar que o valor da variável é do tipo Long;
        // sem o L, tudo é tratado como inteiro por padrão.

        // Nota: Java não tem tipos sem sinal

        // Float - Ponto Flutuante 32-bits, de precisão simples no padrão IEEE 754
        float fooFloat = 234.5f;
        // f é usado para indicar que o valor da variável é do tipo float;
        // caso contrário, ela é tratada como double.

        // Double - Ponto Flutuante 64-bits, de precisão dupla no padrão IEEE 754
        double fooDouble = 123.4;

        // Boolean - true & false
        boolean fooBoolean = true;
        boolean barBoolean = false;

        // Char - Um caractere Unicode de 16 bits
        char fooChar = 'A';

        // Usa-se o final para fazer com que a variável seja imutável.
        final int HORAS_QUE_TRABALHEI_POR_SEMANA = 9001;

        // Strings
        String fooString = "Aqui está minha String!";

        // \n é um caractere de escape que inicia uma nova linha
        String barString = "Imprimir em uma nova linha?\nSem problemas!";
        // \t é um caractere de escape que adiciona um caractere de tabulação
        String bazString = "Você quer adicionar tabulação?\tSem problemas!";
        System.out.println(fooString);
        System.out.println(barString);
        System.out.println(bazString);

        // Arrays
        //O tamanho do array precisa ser determinado na sua declaração
        //O formato para declarar um array é:
        //<tipo de dado> [] <nome da variável> = new <tipo de dado>[<tamanho do array>];
        int [] intArray = new int[10];
        String [] stringArray = new String[1];
        boolean [] booleanArray = new boolean[100];

        // Outra maneira de declarar e inicializar um array
        int [] y = {9000, 1000, 1337};

        // Indexando um array - Acessando um elemento
        System.out.println("intArray no índice 0: " + intArray[0]);

        // O primeiro termo de um array é o 0 e eles são mutáveis.
        intArray[1] = 1;
        System.out.println("intArray no índice 1: " + intArray[1]); // => 1

        // Outras estruturas que devem ser vistas
        // ArrayLists - São parecidos com os arrays, porém oferecem mais funcionalidades
        //             e o tamanho é mutável.
        // LinkedLists
        // Maps
        // HashMaps

        ///////////////////////////////////////
        // Operadores
        ///////////////////////////////////////
        System.out.println("\n->Operadores");

        int i1 = 1, i2 = 2; // Forma abreviada de escrever múltiplas declarações.

        // Aritmética é feita da forma convencional
        System.out.println("1+2 = " + (i1 + i2)); // => 3
        System.out.println("2-1 = " + (i2 - i1)); // => 1
        System.out.println("2*1 = " + (i2 * i1)); // => 2
        System.out.println("1/2 = " + (i1 / i2)); // => 0 (0.5 arredondado para baixo)

        // Módulo
        System.out.println("11%3 = "+(11 % 3)); // => 2

        // Operadores de comparação
        System.out.println("3 == 2? " + (3 == 2)); // => false
        System.out.println("3 != 2? " + (3 != 2)); // => true
        System.out.println("3 > 2? " + (3 > 2)); // => true
        System.out.println("3 < 2? " + (3 < 2)); // => false
        System.out.println("2 <= 2? " + (2 <= 2)); // => true
        System.out.println("2 >= 2? " + (2 >= 2)); // => true

        // Operadores bit-a-bit!
        /*
        ~       Complemento de um
        <<      Deslocamento a esquerda com sinal
        >>      Deslocamento a direita com sinal
        >>>     Deslocamento a direita sem sinal
        &       E bit-a-bit
        |       OU bit-a-bit
        ^       OU exclusivo bit-a-bit
        */
        var value1 = 6;
        var binary = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da opreção %s (representação binária %s\n", value1, binary);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Primeiro número da opreção %s (representação binária %s\n", value2, binary2);
        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (representação binária %s\n", value1, value2, result, binaryResult);
        /*
        0 = false
        1 = true
        101
        110
        111
        */

        // Incrementações
        int i = 0;
        System.out.println("\n->Inc/Dec-rementação");
        System.out.println(i++); //i = 1. Pós-Incrementação
        System.out.println(++i); //i = 2. Pre-Incrementação
        System.out.println(i--); //i = 1. Pós-Decrementação
        System.out.println(--i); //i = 0. Pre-Decrementação




    }

}