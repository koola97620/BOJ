package Question1991;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


class TreeNode {
    private List<Node> nodes;

    public TreeNode() {
        this.nodes = new ArrayList<Node>();
    }
    public Node rootNode() {
        return this.nodes.get(0);
    }

    public void addNodeInTree(Node node) {
        this.nodes.add(node);
    }

    public Node searchNode(String str) {
        if(nodes.size() == 0) {
            System.out.println("빈 트리다!");
            return null;
        } else {
            for(int i=0; i < nodes.size() ; i++) {
                if(nodes.get(i).getStr().equals(str)) {
                    return nodes.get(i);
                }
            }

        }
        return null;
    }
}
class Node {
    private String str;
    private Node left;
    private Node right;
    public Node(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        TreeNode tree = new TreeNode();


        for(int i=0 ; i < num ; i++) {
            String line = br.readLine();
            String[] strs = line.split(" ");

            if(i==0) {
                Node n1 = new Node(strs[0]);
                Node n2 = new Node(strs[1]);
                Node n3 = new Node(strs[2]);
                n1.setLeft(n2); n1.setRight(n3);
                tree.addNodeInTree(n1);tree.addNodeInTree(n2);tree.addNodeInTree(n3);
                continue;
            }


            // strs[0] = root , strs[1] = left , strs[2] = right;
            Node nodeRoot = tree.searchNode(strs[0]);
            if(nodeRoot == null) {
                nodeRoot = new Node(strs[0]);
                tree.addNodeInTree(nodeRoot);
            }
            Node nodeLeft = new Node(strs[1]);
            Node nodeRight = new Node(strs[2]);

            nodeRoot.setLeft(nodeLeft);
            nodeRoot.setRight(nodeRight);

            tree.addNodeInTree(nodeLeft);
            tree.addNodeInTree(nodeRight);

        }



        visitLeft(tree.rootNode());
        System.out.println();

        vistRoot(tree.rootNode());
        System.out.println();

        visitRight(tree.rootNode());

    }

    //중위순회.
    public static void vistRoot(Node node) {
        if(node!=null) {
            vistRoot(node.getLeft());
            if(!node.getStr().equals(".")) {
                System.out.print(node.getStr());
            }
            vistRoot(node.getRight());
        }
    }

    // 전위순회.
    public static void visitLeft(Node node) {
        if(node!=null) {
            if(!node.getStr().equals(".")) {
                System.out.print(node.getStr());
            }
            visitLeft(node.getLeft());
            visitLeft(node.getRight());
        }

    }

    // 후위순회.
    public static void visitRight(Node node){
        if(node!=null) {
            visitRight(node.getLeft());
            visitRight(node.getRight());
            if(!node.getStr().equals(".")) {
                System.out.print(node.getStr());
            }
        }

    }

}
