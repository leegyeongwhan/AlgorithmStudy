package codesquad.week2;
import java.util.LinkedList;

public class MyHashtable {
    class Node {
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        String value() {
            return value;
        }

        void value(String value) {
            this.value = value;
        }
    }

    LinkedList<Node>[] data;

    public MyHashtable(int size) {
        this.data = new LinkedList[size];
    }

    int getHash(String key) {
        int hashcode = 0;
        for (char ch : key.toCharArray()) {
            hashcode += ch;
        }
        return hashcode;
    }

    int convertToIdexnt(int hashcode) {
        return hashcode % data.length;
    }

    Node searchKey(LinkedList<Node> data, String key) {
        if (data == null) return null;
        for (Node node : data) {
            if (node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }

    void put(String key, String value) {
        int hashcode = getHash(key);
        int index = convertToIdexnt(hashcode);
        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<>();
        }
        Node node = searchKey(list, key);
        if (node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.value(value);
        }
    }

    String getKey(String key) {
        int hashCode = getHash(key);
        int idx = convertToIdexnt(hashCode);
        LinkedList<Node> list = data[idx];
        Node node = searchKey(list, key);
        return node == null ? "not fount" : node.value;
    }
}
