/*
class Node{
  int data;
  Node next;
  
  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
  public static boolean checkForCycle(Node head){
    //write your code here.
    if(head == null) return false;
    
    Node slow=head;
    Node fast=head.next;
    
    while(slow != fast){
        if(fast==null || fast.next == null){
            return false;
        }
        slow=slow.next;
        fast=fast.next.next;
    }
    return true;
  }
}
