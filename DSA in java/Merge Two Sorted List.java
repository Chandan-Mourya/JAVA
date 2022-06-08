/*
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/
class Solution{
  public Node mergeTwoLinkedList(Node a,Node b){
    //write your code here.
    if(a==null) return b;
    if(b==null) return a;
    
    Node dummy=new Node(0);
    Node curr=dummy;
    while(a!=null && b!=null){
        if(a.data<b.data){
            curr.next=a;
            a=a.next;
        }else{
            curr.next=b;
            b=b.next;
        }
        curr=curr.next;
    }
    if(a==null) curr.next=b;    //bache hue nodes ko add karne ke liye
                                //because one is 3 and another is 5 size list then 
    else curr.next=a;           //loop to 3 pe hi finish ho jayega so bakiyo ko bhi add karne ke liye
    return dummy.next;
    
  }
}
