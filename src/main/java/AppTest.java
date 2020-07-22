import java.util.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class AppTest {

    public static boolean checkBST(Node root) {
        if (root == null)
            return false;
        boolean right;
        boolean left;
        if (root.left != null && root.right != null) {
            if (root.left.data >= root.right.data)
                return false;
        }
        right = checkBST(root.right);
        if (!right)
            return false;
        left = checkBST(root.left);
        if (!right)
            return false;

        return true;
    }

    public static int height(Node root) {
        if (root == null)
            return -1;

        int depthLeft, depthRight, depthval;

        depthLeft = height(root.left);
        depthRight = height(root.right);
        depthval = 1 + (depthLeft > depthRight ? depthLeft : depthRight);
        return depthval;
    }

    public static void topView(Node root) {
        class MyPair {
            int level;
            Node node;

            MyPair(int level, Node node) {
                this.node = node;
                this.level = level;
            }
        }
        if (root == null)
            return;

        final TreeMap<Integer, Node> map = new TreeMap<>();
        int level = 0;
        final Queue<MyPair> queue = new LinkedList<>();
        MyPair currentPair = new MyPair(0, root);
        queue.add(currentPair);

        while (!queue.isEmpty()) {
            currentPair = queue.poll();
            if (!map.containsKey(currentPair.level)) {
                map.put(currentPair.level, currentPair.node);
            }

            if (currentPair.node.left != null) {
                level = currentPair.level - 1;
                queue.add(new MyPair(level, currentPair.node.left));
            }
            if (currentPair.node.right != null) {
                level = currentPair.level + 1;
                queue.add(new MyPair(level, currentPair.node.right));
            }
        }
        for (Map.Entry<Integer, Node> entry : map.entrySet())
            System.out.print(entry.getValue().data);
    }

    public static void postOrder(Node root) {
        if (root == null)
            return;

        final Stack<Node> stack = new Stack<>();
        final Stack<Integer> dataStack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            final Node current = stack.pop();
            if (current == null)
                continue;

            dataStack.push(current.data);
            stack.push(current.left);
            stack.push(current.right);
        }
        while (!dataStack.isEmpty()) {
            System.out.print(String.format("%d ", dataStack.pop()));
        }
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;

        final ArrayList<Integer> list = new ArrayList<>();
        final Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentPair = queue.poll();
            list.add(currentPair.data);

            if (currentPair.left != null)
                queue.add(currentPair.left);
            if (currentPair.right != null)
                queue.add(currentPair.right);
        }
        Collections.sort(list);
        list.forEach(l -> System.out.print(String.format("%d ", l)));
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        Node cur;
        if (data <= root.data) {
            cur = insert(root.left, data);
            root.left = cur;
        } else {
            cur = insert(root.right, data);
            root.right = cur;
        }
        return root;
    }

    public static int addTwoDigits(int n) {
        return n/10 + n%10;
    }


    public static void main(String[] args) {
        System.out.println(addTwoDigits(48));
    }

}
