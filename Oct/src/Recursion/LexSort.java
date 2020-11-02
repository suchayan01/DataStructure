package Recursion;

import java.util.ArrayList;
import java.util.Collections;

class LexSort
{
    // complete the function
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> op= new ArrayList<>();
        subset(op,s, "",0);
        Collections.sort(op);
		return op;
    }
    //ArrayList<String> op= new ArrayList<>();
    static void subset(ArrayList<String> op,String s,String curr,int index){
        if(index==s.length()){
            op.add(curr);
            return ;
        }
        subset(op,s,curr,index+1);
        subset(op,s,curr+s.charAt(index),index+1);
        
    }
    
    public static void main(String[] args) {
		System.out.println(powerSet("ABC"));
	}
}
