import components.Calculator;
import components.LinkedList;
import junit.framework.*;

import java.util.ArrayList;

public class test extends TestCase{

    public void testLinkedList() throws Exception {
        LinkedList lista = new LinkedList();
        ArrayList<Double> listaParaComparar = new ArrayList<>();
        lista.addNode(3.5);
        listaParaComparar.add(3.5);
        lista.addNode(10.2);
        listaParaComparar.add(10.2);
        lista.addNode(9.7);
        listaParaComparar.add(9.7);
        lista.addNode(6);
        listaParaComparar.add((double) 6);
        lista.restartView();
        assertEquals(lista.getNowNode().value,listaParaComparar.get(0));
        for(int i = 1; i<listaParaComparar.size();i++){
            assertEquals(lista.nextNode().value,listaParaComparar.get(i));
        }
    }

    public void testMean() throws Exception {
        LinkedList lista = new LinkedList();
        lista.addNode(3.4);
        lista.addNode(5.8);
        lista.addNode(10.9);
        lista.addNode(4.3);
        lista.addNode(2.1);
        lista.addNode(9);
        lista.addNode(20);
        lista.restartView();
        assertEquals(Calculator.mean(lista),7.93);
    }

    public void testDeviation() throws Exception {
        LinkedList lista = new LinkedList();
        lista.addNode(3.4);
        lista.addNode(5.8);
        lista.addNode(10.9);
        lista.addNode(4.3);
        lista.addNode(2.1);
        lista.addNode(9);
        lista.addNode(20);
        lista.restartView();
        assertEquals(Calculator.deviation(lista,Calculator.mean(lista)),6.16);
    }

}
