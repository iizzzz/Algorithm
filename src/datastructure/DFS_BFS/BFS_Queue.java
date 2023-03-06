package src.datastructure.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS_Queue<T> {
}

class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean flag;

        public Node(int data, LinkedList<Node> adjacent, boolean flag) {
            this.data = data;
            adjacent = new LinkedList<Node>();
            this.flag = false;
        }
    }

    // 노드들을 저장할 배열
    Node[] nodes;

    Graph(int size) {
        // 간단현 구현을 위해 그래프의 노드 개수를 고정
        nodes = new Node[size];
        for (int i=0; i<size; i++) {
            nodes[i] = new Node(i);
        }
    }

    // 두 노드의 관계를 저장하는 함수
    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        // LinkedList에 서로 상대가 있는지 확인하고 없으면 추가
        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }

        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    // 첫 시작은 0번으로
    void dfs() {
        dfs(0);
    }

    // 시작 인덱스를 받아서 DFS순의 결과를 출력하는 DFS람수
    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.flag = true;

        while (!stack.isEmpty()) {
            Node r = stack.pop();

            for (Node n : r.adjacent) {
                if (n.flag == false) {
                    n.flag = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    // 노드 출력 함수
    void bfs() { bfs(0);}
    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new Queue<Node>() {

        }
    }
    void visit(Node n) {
        System.out.println(n.data + " ");
    }
}

class Test {
    public static void main(String[] args) {

    }
}
