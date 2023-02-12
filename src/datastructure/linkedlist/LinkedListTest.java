package src.datastructure.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        int n = 10;

        // 연결 리스트 생성
        for (int i=0; i<n; i++) {
            list.addFirst1(i);
            System.out.println(i);
        }

//        // 연결 리스트 생성
//        for (int i=0; i<n; i++) {
//            list.addLast1(i);
//        }

        // 연결 리스트 삭제
        for (int i=n-1; i>=0; i++) {
            int x = list.removeFirst();
            System.out.println(x);
        }

//        // 연결 리스트 삭제
//        for (int i=0; i<n; i++) {
//            int x = list.removeLast();
//        }

    }
}
