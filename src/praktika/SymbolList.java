package praktika;

public class SymbolList {
    private  int size = 0;
    private class Node{
        Character symbol;
        Node next;
    }
    private Node head;

    public int size() {
        return size;
    }

    public void add(char a){
        Node adder = new Node();
        adder.symbol = a;
        if (head == null) {
            head = adder;
            size++;
        } else {
            Node temp = head;
            if (sovpadenie(a)) {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = adder;
                size++;
            }
        }

    }

    private boolean sovpadenie(char c){
        Node temp = head;
        if(c == head.symbol){
            return false;
        }
        while (temp.next != null) {
            if (temp.next.symbol == c) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    public void delete(int index){
        Node tmp = head;
        Node newtmp = tmp;
        for(int i = 0; i != index; i++){
            if(tmp == null){
                throw new ArrayIndexOutOfBoundsException();
            }
            newtmp = tmp;
            tmp = tmp.next;
        }
        if(index == 0 ) {
            head = tmp.next;
            size--;
        }else{
            newtmp.next = tmp.next;
            size--;
        }
    }


    public char getElement(int index){
        Node temp = head;
        if(temp == null){
            throw new ArrayIndexOutOfBoundsException();
        }

        for(int i = 0; i != index; i++){
            if(temp == null){
                throw new ArrayIndexOutOfBoundsException();
            }
            temp = temp.next;
        }
        return temp.symbol;
    }


    public void clear(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void changeElement(int index, char c){
        int i = 0;
        Node tmp = head;
        Node newtmp = tmp;
        for(i = 0; i != index; i++){
            if(tmp.next == null){
                throw new ArrayIndexOutOfBoundsException();
            }
            tmp = tmp.next;
        }
        if(sovpadenie(c)){
            tmp.symbol = c;
        }

    }

    public void printList(){
        for(int i = 0; i < this.size; i++){
            System.out.println(getElement(i));
        }
        if(isEmpty()){
            System.out.println("Пусто");
        }
    }


}