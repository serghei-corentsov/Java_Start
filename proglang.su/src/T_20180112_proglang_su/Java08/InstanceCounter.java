package T_20180112_proglang_su.Java08;

public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount(){
        return numInstances;
    }
    private static void addInstance(){
        numInstances++;
    }
    InstanceCounter(){
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println();
        System.out.println("Начиная с " + InstanceCounter.getCount() + " -го экземпляра");
        for (int i = 0; i < 50; i++) {
            new InstanceCounter();
        }
        System.out.println("Создано " + InstanceCounter.getCount() + " экземпляров");
    }
}
