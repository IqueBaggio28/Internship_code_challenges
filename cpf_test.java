import java.util.Scanner;

public class cpf_test {

    static boolean cnpj_test(String cnpj){ // 78622192000165
        if(cnpj.length() != 18 && cnpj.length() != 14) {
            System.out.println("O tamanho do CNPJ esta incorreto.");
            return false; // se for de um tamanho diferente do padrao do CNPJ
        }
        String test_cnpj_1 = "";
        if(cnpj.contains("/")){
            test_cnpj_1 = cnpj.substring(cnpj.indexOf("/")+1, cnpj.indexOf("-"));
            if (!test_cnpj_1.contains("0001")){
                System.out.println("CNPJ nao contem 0001.");
                return false; // se esta porcao nao é igal a "0001"
            }
        }else{
            test_cnpj_1 = cnpj.substring(8,12);
            System.out.println(test_cnpj_1);
            if (!test_cnpj_1.contains("0001")){
                return false;
            }
        }




        if (cnpj.length() == 18){
            if (cnpj.charAt(2) != '.' || cnpj.charAt(6) != '.' || cnpj.charAt(10) != '/' || cnpj.charAt(15) != '-'){
                System.out.println("O separador esta incorreto, ou posicionado incorretamente.");
                return false;
            }
        }



        // testing if the other chars are integers or something else

        String final_string = cnpj.replaceAll("\\.", "")
                .replaceAll("/","").replaceAll("-",""); // this is a string with only numbers.


////        String portion = cnpj.substring(0,cnpj.indexOf('.'));
////        String portion2 = cnpj.substring(cnpj.indexOf('.')+1, cnpj.lastIndexOf('.'));
////        String portion3 = cnpj.substring(cnpj.lastIndexOf('.')+1, cnpj.indexOf('/'));
////        String portion4 = cnpj.substring(cnpj.indexOf('-')+1,18);
//
//        final_string = portion+ portion2+portion3+portion4;

        try {
            long string_to_int = Long.parseLong(final_string);

        }catch(NumberFormatException e){
            System.out.println("CNPJ contem algo que nao seja integer");
            return false;
        }


        return true;

    }


    static boolean cpf_test(String cpf){ // 055.302.73-55

        char[] arr;
        int sum = 0, new_num = 0;


        if(cpf.length() != 14 && cpf.length() != 11) {
            System.out.println("O tamanho do CPF esta incorreto.");
            return false;
        }

        if(cpf.length() == 14){
            if (cpf.charAt(3) != '.' || cpf.charAt(7) != '.' || cpf.charAt(11)!= '-') {
                System.out.println("O separador esta incorreto, ou posicionado incorretamente.");
                return false;
            }
        }


        String just_nums = cpf.replaceAll("\\.","").replaceAll("-", "");

        try{
            long cpf_toInt = Long.parseLong(just_nums);
        }
        catch(NumberFormatException e){
            System.out.println("CNPJ contem algo que nao seja integer");
            return false;
        }



        arr = just_nums.toCharArray();

        for(int i = 0; i < just_nums.length(); i++){
            new_num = Integer.parseInt(String.valueOf(arr[i]));
            sum+= new_num;
        }
        if (sum % 11 != 0) {
            System.out.println("A soma dos digitos do CPF nao somam pra um numero divisivel por 11");
            return false;
        }



        return true;
    }


    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);

        String cnpj ="", cpf = "";

        System.out.print("Documento: ");
//        String sequencia = s.nextLine();
        String sequencia = "87.973.782/0001-23";
        System.out.println(sequencia.length());


        if((sequencia.length() == 14  && sequencia.contains("-")) || sequencia.length() == 11){ // é o CPF
            cpf = sequencia;
            System.out.println("É um CPF.\n");
            if (cpf_test(cpf)){
                System.out.println("O CPF é valido.");
            }
            else{
                System.out.println("O CPF é invalido.");
            }
        }

        else if(sequencia.length() == 18 || sequencia.length() == 14 ){ // é o CNPJ
                cnpj = sequencia;
                System.out.println("É um CNPJ.\n");
            if (cnpj_test(cnpj)){ // se a string do CNPJ esta valido ou nao
                System.out.println("O CNPJ é valido.");
            }
            else{
                System.out.println("O CNPJ é invalido.");
            }

        }
        else{
            System.out.println("Não é nem CPF nem CNPJ valido.");
        }








    }
}
