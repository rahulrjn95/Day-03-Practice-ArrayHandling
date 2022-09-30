package com.bridgelabz;

//Change an Array Element3.Array Length.

public class ChangeArray {
    public static void main (String[] args){
        String [] names = {"Jack","Sam","Chris","Sunny"};
        for(int i = 0;i < names.length;i++){
            if(names[i] == "Sam"){
                names[i] = "Alex";
            }
            System.out.println(names[i]);
        }
    }
}
