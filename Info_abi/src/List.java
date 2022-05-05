public class List {
    Node  root0; // root of list with one conection
    Node1 root1; // root of list with double conection

    public List(){
        root0 = null;
        root1 = null;
    }

    //List 0
    public void addToList0(Node n){
        if(root0 == null){
            root0 = n;
        }else{
            Node cursor = root0;
            while (cursor.hasNext()){
                cursor = cursor.getNext();
            }
            cursor.setNext(n);
        }
    }

    public int getLengthList0(){
        int i = 0;
        if(root0 == null){
            return i;
        }
        Node cursor = root0;
        while (cursor.hasNext()){
            i++;
            cursor = cursor.getNext();
        }
        return i;
    }

    public Node getNodeByIndex(int index){
        Node cursor = root0;
        if(root0 == null){
            System.out.println("[getNodeByIndex]: There is no List0");
            return null;
        }
        for (int i = 0; i < index; i++) {
            if(i == index){
                return cursor;
            }
            if (cursor.hasNext()) {
                cursor = cursor.getNext();
            }
        }
        System.out.println("[getNodeByIndex]: Could not find " + index + "in List0.");
        return null;
    }

    public int getIndexOfNode(Node n){
        int i = 0;
        if (root0 == null){
            System.out.println("[getNodeByIndex]: There is no List0");
            return 0;
        }
        Node cursor = root0;
        while (cursor != n){
            i++;
            cursor = cursor.getNext();
        }
        return i;
    }
    public Node binSearchList0(String s){
        Node n = null;
        Node cursor = root0;
        while (cursor.hasNext()){
            cursor = cursor.getNext();
        }
        return n;
    }

    public Node normalSearchList0(){
        if(root0 == null){
            System.out.println("[normalSearchList0]: There is no List0");
            return null;
        }
        Node cursor = root0;
        while (cursor.hasNext()){

            cursor = cursor.getNext();
        }
        return null;
    }

    public void bubbleSortList0(){
        boolean change = true;
        if(root0 == null){
            System.out.println("[bubbleSortList0]: There is no List0");
            return;
        }
        Node cursor;
        while(change){
            change = false;
            cursor = root0;
            while (cursor.hasNext()){
                //look up how to compare strings
                //if (cursor.getEntry() > cursor.getNext().getEntry()){
                    Node tmp = cursor;
                    int i = getIndexOfNode(cursor);
                    if(i == 0){

                    } else if (i == -1) {
                        
                    }
                //}
                cursor = cursor.getNext();
            }
        }
    }

    public void selectionSortList0(){

    }

    public void insertionSortList0(){

    }

    public void quickSortList0(){

    }


    //List 1
    public void addToList1(Node1 n){

    }

    public Node binSearchList1(){
        return null;
    }

    public Node normalSearchList1(){
        return null;
    }

    public void bubbleSortList1(){

    }

    public void selectionSortList1(){

    }

    public void insertionSortList1(){

    }

    public void quickSortList1(){

    }
}
