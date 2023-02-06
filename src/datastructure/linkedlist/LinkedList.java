package src.datastructure.linkedlist;

public class LinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int currentSize;

    /** currentSize 변수 설명
     * 시간복잡도 효율을 높이기 위한 포인터 변수, 리스트에 요소 추가시 + 1
     * O(n) -> O(1)로 효율성 증대
     */
    public LinkedList() {
        head = null; // 노드의 시작 포인터
        currentSize = 0;
    }

    // 노드 객체. next가 static이 아닌 내부 클래스에 있지 않으면, 외부에서 next의 값을 변경할 수 있다.
    class Node<E> {
        E data; // E타입의 객체
        Node<E> next; // 다른 노드를 가리키는 포인터

        public Node(E obj) {
            data = obj;
            next = null;
        }
    }

    /* ----------------- Add First ----------------- */
    // 새로운 요소를 리스트의 맨 앞에 위치시킬때
    public void addFirst1(E obj){
        Node<E> node = new Node<E>(obj); // 1
        node.next = head; // 2
        head = node; // 3
        currentSize++;
    }

    // 비어있는 리스트에 첫 요소를 추가할때
    public void addFirst2(E obj){
        Node<E> node = new Node<E>(obj); // 1
        node.next = null; // 2
        head = node; // 3
        currentSize++;
    }

    /* ----------------- Add Last ----------------- */
    // tail 변수가 없을때 시간복잡도는 O(N)
    public void addLast1(E obj){
        // 임시 포인터 tmp와 마지막에 추가할 요소인 node 생성
        Node<E> tmp = head;
        Node<E> node = new Node<E>(obj);

        // head가 null일 때 (리스트가 비어있을때) head를 새로만든 node를 가리키게한다
        if (head == null) {
            head = node;
            currentSize++;
            return;
        }

        /** 리스트가 비어있지 않을 때
         *  계속 .next를 타다가 next가 null일 경우 (리스트의 끝에 도달했을 경우)
         *  while문을 빠져나와서 tmp.next에 새로만든 node를 가리키게 한다
         */
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next=node;
        currentSize++;
    }

    // ---------------------------------------------------------------

    /** tail 포인터가 추가됐을때 시간복잡도는 O(1)
     *  tail 포인터를 사용하는 이유
     *  리스트의 맨 마지막을 가리키는 임시 포인터를 두어 사용하면 시간복잡도를 O(1)로 줄일 수 있다
     */
    public void addLast2(E obj) {
        // 마지막에 추가할 요소인 node 생성
        Node<E> node = new Node<E>(obj);

        /** head가 null일 때 (리스트가 비어있을때)
         *  head와 tail이 node를 가리키게 한다
         *  head를 바꿀때 tail도 같이 바꿔주지 않으면 NullPointerException 발생
         */
        if (head == null) {
            head = tail = node;
            currentSize++;
            return;
        }

        tail.next = node;
        tail = node;
        currentSize++;
        return;
    }
}
