import java.util.Locale;

public class TrabStrings {

    public static void main(String[] args){

        char[] texto_c = {'c','u','r','s','o',' ','d','e',' ','j','a','v','a'};
        char[] texto_c2 = new char[10];
        var texto_s = "Anderson Pires";
        int tam;
        char c;

        String s1 = "";
        String s2 = "Anderson";
        String s3;
        s3 = s2;
        String s4 = new String(texto_c);
        String s5;
        s5 = texto_s;
        String s6 = new String(texto_c,0,5);

        String nome1 = "Anderson";
        var nome2 = new String("Pires");


        System.out.println("String(s1): "+s1);
        System.out.println("String(s2): "+s2);
        System.out.println("String(s3): "+s3);
        System.out.println("String(s4): "+s4);
        System.out.println("String(s5): "+s5);
        System.out.println("String(s6): "+s6);

        //length
        tam = texto_s.length();
        System.out.println("Tamanho - String(texto_s): "+tam);

        //charAt
        c = texto_s.charAt(2);
        System.out.println("Caracter do charAt - String(texto_s): "+c);

        //getChars
        texto_s.getChars(4,11, texto_c2, 0);
        System.out.print("Resultado de [texto_s.getChars(4,10, texto_c2, 0)]: ");
        System.out.println(texto_c2);


        //equals vs ==
        if(nome1==nome2){
           System.out.println("nome1 igual a nome2");
        }else{
           System.out.println("nome1 diferente a nome2");
        }

        if(nome1.equals(nome2)){
            System.out.println("nome1 igual a nome2");
        }else{
            System.out.println("nome1 diferente a nome2");
        }

        //equalsIgnoreCase
        if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("nome1 igual a nome2");
        }else{
            System.out.println("nome1 diferente a nome2");
        }

        //compareTo
        int res = 0;
        res = nome1.compareTo(nome2);
        System.out.println(res);

        //regionMatches
        if(nome1.regionMatches(false,0,nome2,0,3)){
            System.out.println("Ok");
        }else{
            System.out.println("Não Ok");
        }


        // starsWith e endWith
        if (nome1.startsWith("And")) {
            System.out.println("INICIA COM 'And?': Sim");
        }else{
            System.out.println("INICIA COM 'And?': Não");
        }

        if (nome1.endsWith("And")) {
            System.out.println("TERMINA COM 'And?': Sim");
        }else{
            System.out.println("TERMMINA COM 'And?': Não");
        }


        // indexOf
        System.out.println(nome1.indexOf('n',2));

        //substring
        System.out.println(nome1.substring(2));
        System.out.println(nome1.substring(2,5));

        //concat
        System.out.println(nome1.concat(" "+nome2));


        //replace
        System.out.println(nome1.replace("der", "DER"));

        //toLowerCase e toUpperCase
        String texto1 = "ANDERSON";
        String texto2 = "anderson";

        System.out.println(nome1.toLowerCase(Locale.ROOT));
        System.out.println(texto1.toLowerCase(Locale.ROOT));

        System.out.println(nome1.toUpperCase(Locale.ROOT));
        System.out.println(texto2.toUpperCase(Locale.ROOT));

        //trim
        texto1 = "ANDERSON  ";
        texto2 = " PIRES DE ";
        String texto3 = texto1.trim() + texto2;

        System.out.println(texto3);


        //toCharArray
        char[] car = texto3.toCharArray();
        System.out.println(car);

        //split
        String[] str1 = texto3.split(" ");
        for(String s : str1){
            System.out.println(s);
        }

    }
}
