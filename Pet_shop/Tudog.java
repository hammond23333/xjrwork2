public class Tudog extends Animal  {

private boolean  isVaccineInjected;




    public Tudog(String anmail_name, int anmail_age, String anmail_gender, Boolean isVaccineInjected) {
        super(anmail_name, anmail_age, anmail_gender);
        this.anmail_price=100;

        this.isVaccineInjected = isVaccineInjected;
    }

    public boolean isVaccineInjected() {
        return isVaccineInjected;
    }

    public void setVaccineInjected(boolean vaccineInjected) {
        this.isVaccineInjected = false;
    }


    @Override
    public String toString() {
        return "狗{" +
                "是否注射疫苗=" + isVaccineInjected +
                ", 名字='" + anmail_name + '\'' +
                ", 年龄=" + anmail_age +
                ", 性别='" + anmail_gender + '\'' +
                ", 价格=" + anmail_price +
                '}';
    }
}
