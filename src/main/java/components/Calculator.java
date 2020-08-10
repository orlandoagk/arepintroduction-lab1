package components;

public class Calculator {
    public static double mean(LinkedList lista) throws Exception {
        double sumaDeValores = 0;
        lista.restartView();
        sumaDeValores+=lista.nowNode.value;
        for(int i = 0; i< lista.size-1;i++){
            sumaDeValores+=lista.nextNode().value;
        }

        return sumaDeValores/lista.size;
    }
    public static double deviation(LinkedList lista,double avg) throws Exception {
        double sumaDeValores = 0;
        lista.restartView();

        sumaDeValores+=lista.nowNode.value;
        for(int i = 0; i< lista.size-1;i++){
            double valorIteracion = Math.pow((lista.nextNode().value - avg),2);
            sumaDeValores+=valorIteracion;
        }

        double valorDentroRaiz = sumaDeValores/(lista.size-1);
        return Math.sqrt(valorDentroRaiz);
    }
}
