import java.util.*;


class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
    }
}

public class pathSum{

    public static Node build(Scanner sc){
        int data = sc.nextInt();
        if(data == -1) return null;
        Node root = new Node(data);
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            Node curr = que.poll();
            int left = sc.nextInt();
            if(left != -1){
                curr.left = new Node(left);
                que.offer(curr.left);
            }
            int right = sc.nextInt();
            if(right != -1){
                curr.right = new Node(right);
                que.offer(curr.right);
            }
        }
        return root;
    }

    public static void pathSum(Node root, int sum){ 
        if(root == null) return;
        sum += root.data;
        if(root.left == null && root.right == null){
            System.out.println("Path sum: " + sum);
        }

        pathSum(root.left, sum);
        pathSum(root.right, sum);
    }
    
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        Node root = build(sc);

        pathSum(root,0 );
    }
}