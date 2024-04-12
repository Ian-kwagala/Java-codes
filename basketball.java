public class basketball{
    String name;
    String league;
    String numberofchampionship;
    String numberofMVP;
    int yearofstart;
    int statsoftheteam;
    String numberofplayers;
    
    
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }

    public String getleague(){
        return league;
    }
    public void setleague(String league){
        this.league=league;
    }

    public String getnumberofchampionship(){
        return numberofchampionship;
    }
    public void setnumberofchampionship(String numberofchampionship){
        //this.numberofchampionships=numberofchampionship;
    }

    public String getnumberofMVP(){
        return numberofMVP;
    }
    public void setnumberofMVP(String numberofMVP){
        this.numberofMVP=numberofMVP;
    }

    public String getnumberofplayers(){
        return numberofplayers;
    }
    public void setnumberofplayers(String numberofplayers){
        this.numberofplayers=numberofplayers;
    }

    public int getyearofstart(){
        return yearofstart;
    }
    public void setyearofstart(int yearofstart){
        this.yearofstart=yearofstart;
    }


    /* 
    public int getstatsoftheteam(){
        return statsoftheteam;
    }
    public void setstatsoftheteam(int statsoftheteam){
        this.statsoftheteam=statsoftheteam;
    }
    */


    public static void main(String[] args){

        basketball basketball=new basketball();

        basketball.setname("Golden State Warriors");
        basketball.setleague("NBA");
        basketball.setnumberofchampionship("8 titles (1998.1999,2000,2002,4)");
        basketball.setnumberofMVP("5 MVPs");
        basketball.setnumberofplayers("20 players");
        basketball.setyearofstart(1950);
        //basketball.setstatsoftheteam(98);



        System.out.println(basketball.getname());
        System.out.println(basketball.getleague());
        System.out.println(basketball.getnumberofchampionship());
        System.out.println(basketball.getnumberofMVP());
        System.out.println(basketball.getnumberofplayers());
        System.out.println(basketball.getyearofstart());
        //System.out.println(basketball.getstatoftheteam());



    }
}