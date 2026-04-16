// this is insertion efficient
//here insetion takes O(1) and removal takes O(n),where n is the size of first stack.
package StacksAndQueues;
import java.util.*;
public class ImplementqueuewithstacksInsert {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public ImplementqueuewithstacksInsert(){
        first=new Stack<>();
        second=new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }
    public int remove()throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
    public int peek()throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked=second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
}
