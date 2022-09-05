/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> que = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        que.add(root);
        que.add(null);
        while(que.peek()!=null){
            List<Integer> tmp = new ArrayList<Integer>();
            while(que.peek()!=null){
                Node cur = que.poll();
                tmp.add(cur.val);
                for(Node node:cur.children){
                    que.add(node);
                }
            }
            que.poll();
            que.add(null);
            result.add(tmp);
        }
        return result;
    }
}
