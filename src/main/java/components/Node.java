package components;

public class Node {
    public double value;
    public Node next;

    public Node(double value){
        this.value = value;
        this.next = null;
    }

    public void changeNext(Node node){
        next = node;
    }
}
