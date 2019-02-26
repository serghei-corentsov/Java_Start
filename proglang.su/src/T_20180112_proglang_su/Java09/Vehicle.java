package T_20180112_proglang_su.Java09;

class Vehicle {}


class Car extends Vehicle {
    public static void main(String args[]){
        Vehicle a = new Car();
        boolean result =  a instanceof Car;
        System.out.println();
        System.out.println( result );
    }
}