/*
class Node{
    int data;
    Node next;
    
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution{
    public void removeNode(Node node){
        //write your code here.
       node.data=node.next.data;
       node.next=node.next.next;
       
        
    }
}
