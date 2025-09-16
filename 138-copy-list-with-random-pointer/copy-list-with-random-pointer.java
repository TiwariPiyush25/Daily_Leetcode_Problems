class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;

        // creating deep copy without random pointer
        Node newhead=new Node(head.val);
        Node temp2=newhead;
        Node temp=head.next;

        while(temp!=null){
            Node dup=new Node(temp.val);
            temp2.next=dup;
            temp2=temp2.next;
            temp=temp.next;
        }

        // fill map with original nodes && new nodes
        HashMap<Node,Node> map=new HashMap<>();
        temp2=newhead;
        temp=head;

        while(temp!=null){
            map.put(temp,temp2);
            temp=temp.next;
            temp2=temp2.next;
        }

        // connect random pointers
        for(Node original:map.keySet()){
            Node duplicate = map.get(original);
            if(original.random!=null) duplicate.random = map.get(original.random);
        }

        return newhead;
    }
}