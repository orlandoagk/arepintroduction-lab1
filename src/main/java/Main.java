import components.Calculator;
import components.LinkedList;


import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new FileReader("ficherodedatos.txt"));
        LinkedList valores = null;


        String c;
        while((c=buffer.readLine())!=null){
            valores = new LinkedList();
            String[] arregloSplit = c.split(" ");
            for(int i = 0; i<arregloSplit.length; i++){
                valores.addNode(Double.parseDouble(arregloSplit[i]));

            }

            double mean = Calculator.mean(valores);
            System.out.println("Values: "+c);
            System.out.println("Mean: "+mean);
            System.out.println("Standard Deviation:"+Calculator.deviation(valores,mean));
            System.out.println("--------------------------------------");


        }






    }
}
