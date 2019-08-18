public class Main {

    public static void main(String[] args) {
        System.out.println("Hoy es viernes");
        //a la salida del sistema imprimir "Hoy es Viernes"

        Integer numA = 2;
        Integer numB = 6;
        Double numE = 4.0;
        String numeroTexto = "8";

        Integer numC = numA + numB;

        System.out.println(numA + numC);

        Double numD = 5.0;
        Double algo = numA + numD;
        System.out.println(algo);
        System.out.println(numB/numA);
        System.out.println(numB/numE);



        Boolean valorVerdad = 3>2;

        if (valorVerdad){
            System.out.println("Condición verdadera");
        }
        else{
            System.out.println("Condición Falsa");
        }



        Integer numero = 0;
        Integer numeroB = 9;

        if (numero>0 || numeroB>4){
            System.out.println("Positivo");
        }else if (numero==0){
            System.out.println("Es cero");
        }
        else{
            System.out.println("Negativo");
        }
    }
}
