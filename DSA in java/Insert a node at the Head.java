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
    static Node head;
    public Solution(){
        this.head=null;
    }
  public static Node addAtHead(Node a,int data){
  //  write your code here.
    a=new Node(data);
    if(head == null){
        head = a;
        return head;
    }
    a.next=head;
    head=a;
    return head;
    
  }
 
}
