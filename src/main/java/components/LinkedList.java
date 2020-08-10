package components;

public class LinkedList {
    public Node head;
    public Node previousNode;
    public Node nowNode;
    public int size;

    public LinkedList(){
        head = null;
        nowNode = null;
        previousNode = null;
        size = 0;
    }

    public void restartView(){

        nowNode = head;
    }

    public void addNode(double value){
        Node nodoTMP = new Node(value);
        if(head == null){
            head = nodoTMP;

        } else {
            previousNode = nowNode;
            nowNode.changeNext(nodoTMP);
        }
        nowNode = nodoTMP;
        size++;
    }

    public void removeNode() throws Exception {
        if(nowNode==null){
            throw new Exception("Its no a next node");
        } else if(head == nowNode) {
            head = null;
            nowNode = null;
            previousNode = null;

        } else {
            previousNode.changeNext(null);
            nowNode = previousNode;
        }
        size--;
    }

    public Node nextNode() throws Exception {
        if(nowNode.next == null){
            throw new Exception("Its no a next node");
        } else {
            previousNode = nowNode;
            nowNode = nowNode.next;
        }
        return nowNode;
    }

    public Node getNowNode(){
        return nowNode;
    }


}
