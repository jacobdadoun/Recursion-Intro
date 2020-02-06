package edu.touro.mco264;


public class Recursion {

    int i = 0;
    int j = 0;
    int k = 0;

    public int add(int x, int y){
        if(x != 0){
            i++;
            return add((x-1), y);
        }
        if(y != 0){
            i++;
            return add(x, (y-1));
        }
        return i;
    }


    public int mult(int x, int y){

        if(y != 0){
            k += add(x,0);
            return mult(x, (y-1));

        }
        return i;
    }

    public int pow(int x, int y){
        if(y != 0){
           j = (x * pow(x, y -1)) ;
        }
        return j;
    }



}
