package Bakjun_Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_1991_트리순회 {
    //노드의 시작은 A부터 시작한다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputNumber = Integer.parseInt(st.nextToken());
        MyTree tree = new MyTree();

        for (int i = 0; i < inputNumber; i++) {
            st = new StringTokenizer(br.readLine());
            char data = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            tree.createNode(data, left, right);
        }
        tree.preDfs(tree.root);
        System.out.println();
        tree.inDfs(tree.root);
        System.out.println();
        tree.postDfs(tree.root);
        System.out.println();
    }
}

class Node {
    char data;
    Node left;
    Node right;

    public Node(char data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class MyTree {
    Node root;

    void createNode(char data, char leftData, char rightData) {
        //시작노드 A라면
        if (root == null) {
            if (data != '.') {
                root = new Node(data);
            }
            if (leftData != '.') {
                root.left = new Node(leftData);
            }
            if (rightData != '.') {
                root.right = new Node(rightData);
            }
        } else {
            search(root, data, leftData, rightData);
        }
    }

    /**
     * data 와 맞는 노드를 찾아 값을계속넣어준다. 좌우를탐색해가며
     *
     * @param root
     * @param data
     * @param leftData
     * @param rightData
     */
    private void search(Node root, char data, char leftData, char rightData) {
        if (root == null) {
            return;
        }
        if (root.data == data) {
            if (leftData != '.') {
                root.left = new Node(leftData);
            }
            if (rightData != '.') {
                root.right = new Node(rightData);
            }
        } else {
            search(root.left, data, leftData, rightData);
            search(root.right, data, leftData, rightData);
        }
    }

    //전위
    void preDfs(Node root) {
        if(root == null){
            return;
        }
        if (root.data == '.') {
            return;
        }
        System.out.print(root.data);
        preDfs(root.left);
        preDfs(root.right);
        return;
    }

    //중위
    void inDfs(Node root) {
        if(root == null){
            return;
        }
        if (root.data == '.') {
            return;
        }
        inDfs(root.left);
        System.out.print(root.data);
        inDfs(root.right);
        return;
    }

    //후위
    void postDfs(Node root) {
        if(root == null){
            return;
        }
        if (root.data == '.' || root == null) {
            return;
        }
        postDfs(root.left);
        postDfs(root.right);
        System.out.print(root.data);
        return;
    }
}