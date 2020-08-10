package components;

public class Calculator {
    public static double mean(LinkedList lista) throws Exception {
        double sumaDeValores = 0;
        lista.restartView();
        sumaDeValores+=lista.nowNode.value;
        for(int i = 0; i< lista.size-1;i++){
            sumaDeValores+=lista.nextNode().value;
        }

        return Math.round(sumaDeValores/lista.size*100.0)/100.0;
    }
    public static double deviation(LinkedList lista,double avg) throws Exception {
        double sumaDeValores = 0.0;
        lista.restartView();

        sumaDeValores+=(Math.pow((lista.nowNode.value - avg),2));
        double valorIteracion = 0.0;
        for(int i = 0; i< lista.size-1;i++){
            valorIteracion = Math.pow((lista.nextNode().value - avg),2);
            sumaDeValores+=valorIteracion;
        }

        double valorDentroRaiz = sumaDeValores/(lista.size-1);
        return Math.round(Math.sqrt(valorDentroRaiz)*100.0)/100.0;
    }
}
