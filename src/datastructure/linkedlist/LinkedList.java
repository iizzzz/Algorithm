package src.datastructure.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int currentSize;

    /** currentSize 변수 설명
     * 시간복잡도 효율을 높이기 위한 포인터 변수, 리스트에 요소 추가시 + 1 +d
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
    /* ----------------- Remove First ----------------- */
    public E removeFirst() {

        if (head == null) {
            return null;
        }

        // 삭제할 첫번째 요소의 데이터
        E tmp = head.data;

        // head와 tail이 같을때 (요소가 1개일때) head 와 tail을 둘 다 바꿔줌
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next; // head가 2번쨰 노드를 가리키게 함
        }
        currentSize--;

        return tmp;
    }
    /* ----------------- Remove Last ----------------- */
    public E removeLast() {
        // 비어있을때
        if (head == null) {
            return null;
        }

        // 하나의 요소만 있을때
        if (head == tail) {
            return removeFirst();
        }

        // 그 외, 임시포인터 current, privious를 활용하여 마지막 노드 제거
        Node<E> current = head;
        Node<E> previous = null;

        // 리스트의 끝에 도착 할때까지 요소들을 하나씩 살펴보기
        while (current != tail) {
            previous = current; // 순서 중요 previous가 먼저 head를 가리켜야함
            current = current.next;
        }

        // 리스트의 끝에 도달 했을 시
        previous.next = null;
        tail = previous;
        currentSize--;
        return current.data;
    }
    /* ----------------- Remove ----------------- */
    public E remove(E obj) {

        Node<E> current = head, previous = null;

        // current가 마지막 요소 까지 갈동안 필터링
        // current가 아닌 current.next를 while 조건 안에 두면 마지막 요소는 확인을 못한다
        while (current != null) {

            // current.data가 지우고자 하는 데이터와 같으면 (compareTo == 0)
            if (((Comparable<E>) obj).compareTo(current.data) == 0) {

                // 첫 요소 & 마지막 요소인지 필터링
                if (current == head) {
                    return removeFirst();
                }
                if (current == tail) {
                    return removeLast();
                }

                // 지우고자 하는 요소를 찾았을때 지울 노드의 data 리턴
                // previous에서 current를 가리키던 포인트를 삭제 해야 하므로 그 다음으로 건너뛰어서 가리킴
                currentSize--;
                previous.next = current.next;
                return current.data;
            }
            // 찾고자 하는 요소가 아닐 때 current가 끝까지 도달할때 까지 다시 이동
            previous = current;
            current = current.next;
        }

        return null;
    }

    /* ----------------- Find ----------------- */
    public boolean contains(E obj) {
        Node<E> current = null;

        while (current != null) {
            if (((Comparable<E>) obj).compareTo(current.data) == 0) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    /* ----------------- Peek ----------------- */
    public E peekFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public E peekLastt() {
        if (tail == null) {
            return null;
        }
        return tail.data;
    }

    /* ----------------- Iterator ----------------- */
    class IteratorHelper implements Iterator {

        Node<E> index;

        public IteratorHelper() {
            index = head;
        }

        // index가 null 이면 반환할게 없다 (비어있거나, 요소의 끝에 왔을때)
        @Override
        public boolean hasNext() {
            return (index != null);
        }

        /**
         * hasNext가 false면 Exception을 던지고
         * 요소가 있으면 임의의 변수인 val에 현재 포인터가 가리키는 데이터를 반환하고
         * 포인터를 다음 요소로 옮긴다
         */
        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            E val = index.data;
            index = index.next;
            return val;
        }
    }
}
