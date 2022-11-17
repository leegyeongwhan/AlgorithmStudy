package Inflean;

public class NodeDfs {
    int data = 0;
    NodeDfs lt, rt;

    public NodeDfs(int val) {
        data = val;
        lt = rt = null;
    }
}


class Main1 {
    NodeDfs root;
    public void dfs(NodeDfs root) {
            if(root == null){
                return;
                /////// 이진트리 에서 출력을 어디에서  하느냐가 중요함
            }else {
            //   System.out.print(root.data+" "); //전위
                dfs(root.lt);
               System.out.print(root.data+" "); //중위
                dfs(root.rt);
           //    System.out.print(root.data+" "); //후위
            }
    }

    public static void main(String[] args) {
        Main1 tree = new Main1();
        tree.root = new NodeDfs(1);
        tree.root.lt = new NodeDfs(2);
        tree.root.rt = new NodeDfs(3);
        tree.root.lt.lt = new NodeDfs(4);
        tree.root.lt.rt = new NodeDfs(5);
        tree.root.rt.lt = new NodeDfs(6);
        tree.root.rt.rt = new NodeDfs(7);
        tree.dfs(tree.root);
    }
}