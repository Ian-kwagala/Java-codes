public class car {
    String name;
    String make;
    String maker;
    int batchnumber;
    String classmodel;

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

    public String getmake() {
        return make;
    }
    public void setmake(String make) {
        this.make = make;
    }

    public String getmaker() {
        return maker;
    }
    public void setmaker(String maker) {
        this.maker = maker;
    }

    public int getbatchnumber() {
        return batchnumber;
    }
    public void setbatchnumber(int batchnumber) {
        this.batchnumber = batchnumber;
    }

    public String getclassmodel() {
        return classmodel;
    }
    public void setclassmodel(String classmodel) {
        this.classmodel=classmodel;
    }

    public static void main(String[] args){

        car mycar = new car();

        mycar.setname("Brabus");
        mycar.setmake("Mercade Benze");
        mycar.setmaker("Germany");
        mycar.setbatchnumber(476);
        mycar.setclassmodel("saloon");

    }

   
}


