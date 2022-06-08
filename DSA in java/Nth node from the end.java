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
  Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
  public int nthNode(Node head,int n){
    //write your code here.

    int count=0;
    Node curr=head;
    while(curr.next!=null){
        count++;
        curr=curr.next;
    }
    int len=count-n+1;
    Node start = head;
    while(len>0){
        len--;
        start=start.next;
    }
    return start.data;
  }
}
