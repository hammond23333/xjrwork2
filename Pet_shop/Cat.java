public class Cat extends Animal{


    public Cat(String anmail_name, int anmail_age, String anmail_gender) {
        super(anmail_name,anmail_age,anmail_gender);
        this.anmail_price=200;

    }

    public Cat() {

    }


    @Override
    public String toString() {
        return "猫{" +
                "名字='" + anmail_name + '\'' +
                ", 年龄=" + anmail_age +
                ", 性别='" + anmail_gender + '\'' +
                ", 价格=" + anmail_price +
                '}';
    }
}
