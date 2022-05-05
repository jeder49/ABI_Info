public class Node1 {
    Node next;
    Node previous;
    Entry entry;

    public Node1(Node next, Node previous, Entry entry){
        this.next = next;
        this.previous = previous;
        this.entry = entry;
    }

    public boolean hasNext(){
        if (next == null){
            return false;
        }
        return true;
    }

    public void setNext(Node n){
        this.next = n;
    }

    public Node getNext(){
        return next;
    }

    public boolean hasPrevious(){
        if (next == null){
            return false;
        }
        return true;
    }

    public void setPrevious(Node n){
        this.previous = previous;
    }

    public Node getPrevious(){
        return previous;
    }

    public void setEntry(Entry e){
        entry = e;
    }

    public Entry getEntry(){
        return entry;
    }
}
