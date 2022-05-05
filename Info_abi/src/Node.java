public class Node {
    private Node next;
    private Entry entry;

    public Node(Entry e,Node next){
        entry = e;
        this.next = next;
    }

    public boolean hasNext(){
        if(next != null){
            return true;
        }
        return false;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return next;
    }

    public void setEntry(Entry e){
        entry = e;
    }

    public Entry getEntry(){
        return entry;
    }
}
