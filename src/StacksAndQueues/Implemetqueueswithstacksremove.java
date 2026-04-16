// this is removal efficient
//here insertion takes O(n) and removal takes O(1),where n is the size of first stack.
package StacksAndQueues;

import java.util.Stack;

public class Implemetqueueswithstacksremove {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public Implemetqueueswithstacksremove(){
        first=new Stack<>();
        second=new Stack<>();
    }
    public void add(int item) throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int remove()throws Exception{
        return first.pop();
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
    public int peek(){
        return first.peek();
    }
}
