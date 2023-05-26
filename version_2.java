import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class version_2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        TEMPLATE:
            MM/DD/YYYY
            DD/MM/YYYY
            YYYY/MM/DD
            YYYY/DD/MM
            MM/YYYY/DD
            DD/YYYY/MM

           mesma coisa com YY no lugar de YYYY
           mesma coisa com '-' ou ' ' ao invez de '/'


         */
        Scanner s = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        //iniciando variaveis
        String date = "";
        String day = "";
        String month = "";
        String year= "";




        System.out.print("Escolha o separador que deseja: / - ou ' '\nSeparador: ");

        char separador = s.findInLine(".").charAt(0);

        TimeUnit.SECONDS.sleep(1);
        System.out.println("Qual o formato que ira inserir a data:\n" +
                "(1) MM" + separador + "DD" + separador + "YYYY\n" +
                "(2) DD" + separador + "MM" + separador + "YYYY\n" +
                "(3) YYYY" + separador + "MM" + separador + "DD\n" +
                "(4) YYYY" + separador + "DD" + separador + "MM\n" +
                "(5) MM" + separador + "YYYY" + separador + "DD\n" +
                "(6) DD" + separador + "YYYY" + separador + "MM\n" +
                "!O ano pode ser enviado como YY!\n" +
                "Formato: ");

        char formato = p.findInLine(".").charAt(0);


        System.out.println("Informe a data no com o formato de escolha:");
        date = sc.nextLine();
        switch (formato){
            case '1': //   MM/DD/YYYY

                day = date.substring(date.indexOf(separador)+1,date.lastIndexOf(separador));
                month = date.substring(0,date.indexOf(separador));
                year = date.substring(date.lastIndexOf(separador)+1);
                break;

            case '2': //      DD/MM/YYYY

                day = date.substring(0,date.indexOf(separador));
                month = date.substring(date.indexOf(separador)+1,date.lastIndexOf(separador));
                year = date.substring(date.lastIndexOf(separador)+1);
                break;

            case '3': //     YYYY/MM/DD

                day = date.substring(date.lastIndexOf(separador)+1);
                month = date.substring(date.indexOf(separador)+1,date.lastIndexOf(separador));
                year = date.substring(0,date.indexOf(separador));
                break;

            case '4': //     YYYY/DD/MM

                day = date.substring(date.indexOf(separador)+1,date.lastIndexOf(separador));
                month = date.substring(date.lastIndexOf(separador)+1);
                year = date.substring(0,date.indexOf(separador));
                break;

            case '5': //      MM/YYYY/DD

                day = date.substring(date.lastIndexOf(separador)+1);
                month = date.substring(0,date.indexOf(separador));
                year = date.substring(date.indexOf(separador)+1,date.lastIndexOf(separador));
                break;
            case '6': //      DD/YYYY/MM

                day = date.substring(0,date.indexOf(separador));
                month = date.substring(date.lastIndexOf(separador)+1);
                year = date.substring(date.indexOf(separador)+1,date.lastIndexOf(separador));
                break;

            default:
                System.out.println("Data de formato invalida, tente denovo");

        }
        if (year.length() == 2){ // adiciona 20 na frente case o ano tenha apenas 2 digitos
            year = "20"+year;
        }


        System.out.println(day + '/' + month + '/'+ year);

    }
}

