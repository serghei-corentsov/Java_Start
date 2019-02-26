package T_2018272050_itProger;

public class T_2018302102_01_AnonymousClasses {
    public static void main(String[] args) {
//        T_2018302102_02_Computer comp = new T_2018302102_02_Computer();
//        comp.i7.start();
//        comp.transfer.start();
//        comp.transfer.shutdown();

        new T_2018302102_02_Computer() {
            void superCopm(){
                this.i7.start();
                this.transfer.start();
            }
        };
    }
}