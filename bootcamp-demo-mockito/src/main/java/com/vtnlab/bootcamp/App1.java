package com.vtnlab.bootcamp;

/**
 * Hello world!
 *
 */
public class App1 
{
    private App2 app2;
    public App1(App2 app2){
        this.app2=app2;
    }
    // developerA
    public int add(int x, int y){
        return  this.app2.provider(x*2, y)+1000;
    }
    //developerB
    // public static int provider(int x, int y){
    //     return x+y;
    // }
}
