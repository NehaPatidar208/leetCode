/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, List<Integer>> grp = new HashMap<Integer,List<Integer>>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        Set<Integer> visited = new HashSet<>();
        visited.add(start);
        int result = 0, count=0;
        que.offer(root);
        
        while(!que.isEmpty()){
            TreeNode temp = que.poll();
            count++;
            if(temp.left !=null){
                que.offer(temp.left);
                if(grp.containsKey(temp.val)){
                    List<Integer> lst = grp.get(temp.val);
                    lst.add(temp.left.val);
                    grp.put(temp.val,lst);
                }else{
                    grp.put(temp.val,new ArrayList<Integer>(Arrays.asList(temp.left.val)));
                }
                if(grp.containsKey(temp.left.val)){
                    List<Integer> lst = grp.get(temp.val);
                    lst.add(temp.left.val);
                    grp.put(temp.val,lst);
                }else{
                    grp.put(temp.left.val,new ArrayList<Integer>(Arrays.asList(temp.val)));
                }
            }
            if(temp.right !=null){
                que.offer(temp.right);
                if(grp.containsKey(temp.val)){
                    List<Integer> lst = grp.get(temp.val);
                    lst.add(temp.right.val);
                    grp.put(temp.val,lst);
                }else{
                    grp.put(temp.val,new ArrayList<Integer>(Arrays.asList(temp.right.val)));
                }
                if(grp.containsKey(temp.right.val)){
                    List<Integer> lst = grp.get(temp.val);
                    lst.add(temp.right.val);
                    grp.put(temp.val,lst);
                }else{
                    grp.put(temp.right.val,new ArrayList<Integer>(Arrays.asList(temp.val)));
                }
            }
        }
        Queue<Integer> grpQue = new LinkedList<>();
        grpQue.offer(start);
        while(!grpQue.isEmpty()){
            int size = grpQue.size();
            while(size>0){
                int tmp=grpQue.poll();
                visited.add(tmp);
                if(grp.get(tmp)!=null){
                    for(int node:grp.get(tmp)){
                        if(!visited.contains(node))grpQue.offer(node);
                    }
                }
                size--;
            }
            result++;
        }
        return result-1;
    }
}
