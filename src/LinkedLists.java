//public class LinkedLists {
//    class  Node{
//        String data;
//        Node next;
//
//        Node(String data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//    public void addFirst(String data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            return;
//        }
//
//        newNode.next = head;
//        head newNode;
//    }
//
//    public void addLast (String data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            return;
//        }
//
//        Node currNode = head;
//        while(currNode.next != null){
//            currNode = currNode.next;
//        }
//
//        currNode.next = newNode;
//    }
//
//    public static void main(String[] args) {
//        LinkedLists list = new LinkedLists();
//        list.addFirst("a");
//    }
//}
//
