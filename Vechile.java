public class Vechile{

    String name;
    String color;

    public Vechile(String name, String color){
        this.name = name;
        this.color = color;
    }

     public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "This" + this.name  + this.color;
    }

    public static void main(String[] args){
        System.out.println("--------------------------------");
        Vechile vechile = new Vechile("Benze", "Black");
        System.out.println(vechile.toString());
        System.out.println("--------------------------------");
        System.out.println("Kwagala Ian");
        System.out.println("2023-B072-20392");

    }

}