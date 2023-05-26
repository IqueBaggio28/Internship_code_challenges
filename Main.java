import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);



        String date = "2014-FEV-20"; // iniciando variaveis
        String year= "";
        String month = "";
        String day = "";

        if(date.contains("/")){ // se é formatado com '/' vai ver se comeca com ano ou dia ou mes
            if(date.substring(0,date.indexOf("/")).length() == 4){ // comeca com ano

                year = date.substring(0,date.indexOf("/"));
                month = date.substring(date.indexOf("/")+1,date.lastIndexOf("/"));
                day = date.substring(date.lastIndexOf("/")+1);


            }else{ // começa com dia/mes
                year = date.substring(date.lastIndexOf("/")+1);
                month = date.substring(date.indexOf("/")+1,date.lastIndexOf("/"));
                day = date.substring(0,date.indexOf("/"));

            }

        }
        if(date.contains("-")) { // se é formatado com '/' vai ver se comeca com ano ou dia ou mes
            if (date.substring(0, date.indexOf("-")).length() == 4) { // comeca com ano
                year = date.substring(0,date.indexOf("-"));
                month = date.substring(date.indexOf("-")+1,date.lastIndexOf("-"));
                day = date.substring(date.lastIndexOf("-")+1);

            } else { // começa com dia/mes
                year = date.substring(date.lastIndexOf("-")+1);
                month = date.substring(date.indexOf("-")+1,date.lastIndexOf("-"));
                day = date.substring(0,date.indexOf("-"));
            }
        }

        if(date.contains(" ")) { // se é formatado com '/' vai ver se comeca com ano ou dia ou mes
            if (date.substring(0, date.indexOf(" ")).length() == 4) { // comeca com ano
                year = date.substring(0,date.indexOf(" "));
                month = date.substring(date.indexOf(" ")+1,date.lastIndexOf(" "));
                day = date.substring(date.lastIndexOf(" ")+1);

            } else { // começa com dia/mes
                year = date.substring(date.lastIndexOf(" ")+1);
                month = date.substring(date.indexOf(" ")+1,date.lastIndexOf(" "));
                day = date.substring(0,date.indexOf(" "));
            }
        }





        System.out.println(day + "/" + month + "/" + year);

//        System.out.println("Qual o formato que deseja?\n(1) - com espaço separando\n(2) - com '-' separando\n(3) - MM/DD/YYYY\n" +
//                "(4) - DD/MM/YYYY");
//
//        int choice = s.nextInt(); // variavel que vai decidir o formato em relaçao ao que o usuario escolher
//        switch (choice) {
//            case 1:
//                System.out.println(month + " " + day + " " + year);
//                break;
//
//            case 2:
//                System.out.println(month + "-" + day + "-" + year);
//                break;
//
//            case 3:
//                System.out.println(month + "/" + day + "/" + year);
//                break;
//
//            case 4:
//                System.out.println(day + "/" + month + "/" + year);
//                break;
//        }

    }
}