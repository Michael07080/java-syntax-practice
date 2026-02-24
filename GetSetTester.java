import java.util.Scanner;

public class GetSetTester {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    GetSet player1 = new GetSet(); 



    //System.out.println(player1.username);
    System.out.println(player1.getUsername());
    player1.setUsername("Johnsmoke");
    System.out.println(player1.getUsername());
    player1.setUsername("GoldenPenguin");
    System.out.println(player1.getUsername());


    System.out.println(player1.getid());
    player1.setid(22);
    System.out.println(player1.getid());

    System.out.println(player1.getRank());
    player1.setRank("gold");
    System.out.println(player1.getRank());
}


}

class GetSet {

    //attributes
    private String username = "Drewmickymouse";
    private int id = 45;
    private String rank = "platnum";


    //getter
    public int getid(){
        return id;
    }

    //getter
    public String getUsername(){
        return username;
    }

    //getter
    public String getRank(){
        return rank;
    }

    //setter
    public void setUsername(String newusername){
        this.username = newusername;
    }

    //setter
    public void setid(int newid){
        this.id = newid;
    }

    public void setRank(String newrank){
        this.rank = newrank;
    }

}