const LinkedListNode = class {
    constructor(nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

// Complete the function below

function reverse(head) {
      let  prev=null;
    let current=head;
    let next=null;
    while(current != null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    head=prev;
    return head;
}
