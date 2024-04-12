public class cardetails extends car {

    String carname;
    String color;
    String platenumber;
    int numberofseats;
    String price;
    int yearofmake;
    String enginetype;
    String transmission;

    public String getcarname() {
        return carname;
    }

    public void setcarname(String carname) {
        this.carname = carname;
    }

    public String gettransmission() {
        return transmission;
    }

    public void settransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getenginetype() {
        return enginetype;
    }

    public void setenginetype(String enginetype) {
        this.enginetype = enginetype;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getplatenumber() {
        return platenumber;
    }

    public void setplatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public int getnumberofseats() {
        return numberofseats;
    }

    public void setnumberofseats(int numberofseats) {
        this.numberofseats = numberofseats;
    }

    public String getprice() {
        return price;
    }

    public void setprice(String price) {
        this.price = price;
    }

    public int getyearofmake() {
        return yearofmake;
    }

    public void setyearofmake(int yearofmake) {
        this.yearofmake = yearofmake;
    }

  public static void main(String[] args){

         cardetails mycardetails = new cardetails();
         car mycar = new car();

         mycar.setname("LAND CRUSIER");
         mycar.setmake("TOYOTA");
         mycar.setmaker("JAPAN");
         mycar.setbatchnumber(2345572);
         mycar.setclassmodel("SUV");

        mycardetails.setcarname("LAND CRUSIER V8 VXT");
        mycardetails.setcolor("black");
        mycardetails.setplatenumber("UG 0001");
        mycardetails.setnumberofseats(8);
        mycardetails.setprice("USD 5000000");
        mycardetails.setyearofmake(2024);
        mycardetails.setenginetype("8 cylinder Disel V8");
        mycardetails.settransmission("Automatic");


        System.out.println("Kwagla Ian");
        System.out.println("2023-B071-20392");
        System.out.println("....................");
        System.out.println(mycar.getname());
        System.out.println(mycar.getmake());
        System.out.println(mycar.getmaker());
        System.out.println(mycar.getbatchnumber());
        System.out.println(mycar.getclassmodel());
        System.out.println("............................");
        System.out.println("Child class details");
        System.out.println("............................");
        System.out.println(mycardetails.getcarname());
        System.out.println(mycardetails.getcolor());
        System.out.println(mycardetails.getplatenumber());
        System.out.println(mycardetails.getnumberofseats());
        System.out.println(mycardetails.getprice());
        System.out.println(mycardetails.getyearofmake());
        System.out.println(mycardetails.getenginetype());
        System.out.println(mycardetails.gettransmission());

    }

    }

    
