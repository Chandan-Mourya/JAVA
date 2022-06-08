/*
class Node{
  int data;
  Node next;
  public Node(){
    this.next = null;
    this.data = 0;
  }
  public Node(int data,Node next){
    this.next = next;
    this.data = data;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/

class Solution{
  
  public static Node rotateNode(Node head,int k,int n){
    if(head == null || head.next == null)
    {
        return head;
    }
    
    while(k != 0)
    {
        Node last = head;
        Node second_last = head;
    
        while(last.next != null)
        {
            second_last = last;
            last = last.next;
        }
    
        last.next = head;
        head = last;
        second_last.next = null;
        
        k--;
    }
    
    return head;
  }
}
