package az.company.easy;

public class Main {
    static void main(String[] args) {

        System.out.println(Operation.PLUS.apply(5,7));
        System.out.println(Operation.MINUS.apply(15, 5));
        System.out.println(Operation.MULTIPLY.apply(15, 5));
        System.out.println(Operation.DIVIDE.apply(15, 5));

        }
    }
