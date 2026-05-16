package com.example;
public class App {
    public static void main(String[] args){
        App app = new App();
        int result = app.Add(2,3);
        System.out.println("2+3:"+ result);
        System.out.println("Application executed successfully!");
    }
    public int Add(int a, int b){
        return a+b;
    }
}
