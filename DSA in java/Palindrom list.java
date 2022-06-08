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
  public static boolean detectPalindrome(Node head){
    //complete this function.
    Node node=head;
    Stack<Integer> stack=new Stack<>();
   
    while(node !=null){
        stack.push(node.data);
        node=node.next;
    }
    Node start=head;
    while(!stack.isEmpty() && start!= null){
        if(stack.pop() != start.data){
            return false;
        }
        start=start.next;
    }
    return true;
  }
}
