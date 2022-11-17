package Inflean;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Queue;

public class NodeBfs {
    int data = 0;
    NodeBfs lt, rt;

    public NodeBfs(int val) {
        data = val;
        lt = rt = null;
    }
}


class Main2 {
    NodeBfs root;

    public void bfs(NodeBfs root) {
        Queue<NodeBfs> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                NodeBfs cur = queue.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) queue.offer(cur.lt);
                if (cur.rt != null) queue.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
            Main2 tree = new Main2();
        tree.root = new NodeBfs(1);
        tree.root.lt = new NodeBfs(2);
        tree.root.rt = new NodeBfs(3);
        tree.root.lt.lt = new NodeBfs(4);
        tree.root.lt.rt = new NodeBfs(5);
        tree.root.rt.lt = new NodeBfs(6);
        tree.root.rt.rt = new NodeBfs(7);
        tree.bfs(tree.root);
    }
}