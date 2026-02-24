import java.util.Scanner;

public class GetSetTester {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    GetSet player1 = new GetSet(); 

    System.out.println("Enter a username");
    String username2 = input.nextLine();


    System.out.println("Enter a id");
    int id2 = input.nextInt();


    

   

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

    System.out.println(player1.getid2());
    player1.setid2(id2);
    System.out.println(player1.getid2());

    System.out.println(player1.getUsername2());
    player1.setUsername2(username2);
    System.out.println(player1.getUsername2());





    if (player1.getRank().equals("gold")) {
            System.out.println("You are alsmot platnum");
        } else {
            System.out.println("you are not platnum");
        } 
    
    if (player1.getRank().equals("platnum")) {
            System.out.println("You are platnum");
        } else {
            System.out.println("you are not platnum");
        } 
    




    

}


}

class GetSet {

    //attributes
    private String username = "Drewmickymouse";
    private int id = 45;
    private String rank = "platnum";
    private String username2 = " ";
    private int id2 = ' ';
    
 


    //getter
    public int getid(){
        return id;
    }

    //getter
    public String getUsername(){
        return username;
    }


    public int getid2(){
        return id;
    }

    //getter
    public String getUsername2(){
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

    public void setUsername2(String newusername2){
        this.username = newusername2;
    }

    //setter
    public void setid2(int newid2){
        this.id = newid2;

}}