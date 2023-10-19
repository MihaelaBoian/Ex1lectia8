public class Staff extends Person {

    private String school;
    private double pay;
    public Staff(){
        }
    public Staff(String name,String address,String school,double pay){
        super(name, address);
        this.school=school;
        this.pay=pay;

    }

    @Override
    public String toString() {
        return super.toString()+ "Staff{" +
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}


