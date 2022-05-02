package com.example.testandco;

public class TestAndCo {
    public static void main(String[] args) {
        int boxes = 34;
        int capacityTruck = 9;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        while (boxes > 0){
            if (boxes < capacityTruck) {
                System.out.println("tu as fait un voyage de : "+ boxes);
            }
            else {
                System.out.println("tu as fait un voyage de : "+ capacityTruck);
            }
            boxes -= capacityTruck;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        boxes = 34;

        for (int i=boxes; i>0; i-=capacityTruck) {
            if (i < capacityTruck) {
                System.out.println("tu as fait un voyage de : "+ i);
            }
            else {
                System.out.println("tu as fait un voyage de : "+ capacityTruck);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
