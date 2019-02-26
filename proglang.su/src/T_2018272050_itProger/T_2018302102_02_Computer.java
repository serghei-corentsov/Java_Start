package T_2018272050_itProger;

public class T_2018302102_02_Computer {
    class Processor {
        private boolean isStart = false;
        public void start() {
            isStart = true;
        }
        public void shutdown() {
            isStart = false;
        }
    }
    class RAM {
        private boolean isStart = false;
        public void start() {
            isStart = true;
            System.out.println("isStart " + isStart);
        }
        public void shutdown() {
            isStart = false;
            System.out.println("isStart " + isStart);
        }
    }

    Processor i7 = new Processor();
    RAM transfer = new RAM();
}