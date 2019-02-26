package T_20180112_proglang_su.Java04;

class FreshJuice {

    enum FreshJuiceSize {Small, Medium, Large, ExtraLarge, SuperSmall}
    FreshJuiceSize size;
}

class FreshJuiceTest{

    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.Small;

        System.out.println();
        System.out.println("Размер: " + juice.size);
    }
}