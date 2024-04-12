public class player extends basketball{
    String playername;
    String position;
    String height;
    String numberofpoints;
    int number;

    public String getplayername(){
        return playername;
    }
    public void setplayername(String playername){
        this.playername=playername;
    }

    public String getposition(){
        return position;
    }
    public void setposition(String position){
        this.position=position;
    }

    public String getheight(){
        return height;
    }
    public void setheight(String height){
        this.height=height;
    }

    public int getnumber(){
        return number;
    }
    public void setnumber(int number){
        this.number=number;
    }

    public String getnumberofpoints(){
        return numberofpoints;
    }
    public void setnumberofpoints(String numberofpoints){
        this.numberofpoints=numberofpoints;
    }


    

    public static void main(String[] args){

        //child class details
        player player=new player();

        player.setplayername("Ian");
        player.setposition("Big man");
        player.setheight("6'10");
        player.setnumberofpoints("3200points");
        player.setnumber(1);


        //Main class details
        basketball basketball=new basketball();

        basketball.setname("Golden State Warriors");
        basketball.setleague("NBA");
        basketball.setnumberofchampionship("8 titles (1998.1999,2000,2002,4)");
        basketball.setnumberofMVP("5 MVPs");
        basketball.setnumberofplayers("20 players");
        basketball.setyearofstart(1950);
       

        System.out.println("...............................................");


        //PARENT CLASS DETAILS
        System.out.println(basketball.getname());
        System.out.println(basketball.getleague());
        System.out.println(basketball.getnumberofchampionship());
        System.out.println(basketball.getnumberofMVP());
        System.out.println(basketball.getnumberofplayers());
        System.out.println(basketball.getyearofstart());

        System.out.println("...............................................");


        //CHILD CLASS DETAILS
        System.out.println(player.getplayername());
        System.out.println(player.getposition());
        System.out.println(player.getheight());
        System.out.println(player.getnumberofpoints());
        System.out.println(player.getnumber());
        
        //=new player("Ian", "Goalkeeper", "6'10", "10", 1);
    }

    //public player(String playername, String position, String height, String numberofpoints, int number);
}




