package T_20180112_proglang_su.Java11;

public class Test11_05_switch_case {
    public static void main(String args[]){
        //char grade = args[0].charAt(0);
        char grade = 'C';

        switch(grade)
        {
            case 'A' :
                System.out.println("case A");
                break;
            case 'B' :
                System.out.println("case B");
                break;
            case 'C' :
                System.out.println("case C"+"\n");
                break;
            case 'D' :
                System.out.println("case D");
                break;
            case 'F' :
                System.out.println("case F");
                break;
            default :
                System.out.println("Неверная оценка");
        }
        System.out.println("Ваша оценка " + grade);
    }
}