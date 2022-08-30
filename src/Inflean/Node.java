package Inflean;

public class Node {
    int data = 0;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}


class Main1 {
    Node root;
    public void dfs(Node root) {
            if(root == null){
                return;
                /////// 이진트리 에서 출력을 어디에서  하느냐를 중요시 생각하자
            }else {
                System.out.print(root.data+" "); //전위
                dfs(root.lt);
                System.out.print(root.data+" "); //중위
                dfs(root.rt);
                System.out.print(root.data+" "); //후위
            }
    }

    public static void main(String[] args) {
        Main1 tree = new Main1();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.dfs(tree.root);
    }
}