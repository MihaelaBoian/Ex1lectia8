import javax.lang.model.element.Name;

public class Person {
    private String name;
    private String address;

    public Person(){
    }
    public Person(String name,String address){
        this.name=name;
        this.address=address;

    }
        public String getName(){
        return name;
        }
        public String getAddress(){
        return address;
        }

    public void setAddress(String address) {
        this.address=address;
            }
    @Override
    public String toString() {
        return "Name"+ name + "Address"+ address;
    }

}
