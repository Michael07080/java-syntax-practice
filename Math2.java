// lesson on accumulation and increment, decrement









    class ScoreBoard {

    int playerHealth = 100;
    int playerXp = 0;
    int playerLevel = 0;
    String name;

    static String game = "Fortnite";

    public ScoreBoard(String name) {
        this.name = name;
    }

   
    
    

    

        

    void gainXp(int amount) {
        playerXp = playerXp + amount; // accumuation, long way of doing it.
        System.out.println("Player Name: " + name + " Xp gained: " + amount);
    }

    void heal() {
        playerHealth += 50; //compound addition, compound accumulation
    }

    void damage() {
        playerHealth -= 10; // compound subtraction
    }

    void levelUp() {
        playerLevel ++; // increment
    }

    void levelDown() {
        playerLevel --; // decrement
    }

    void getName() {
        System.out.println(game);
    }


    
        

}



        

        
    




public class Math2 {
    public static void main(String[] args) {

        ScoreBoard player1 = new ScoreBoard("John");
        ScoreBoard player2 = new ScoreBoard("Ken");

        player1.gainXp(100);
        player1.gainXp(200);
        player1.heal(); 
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();
        player1.heal();



        player2.gainXp(4550);
        player2.gainXp(200);
        player2.levelUp();
        player2.levelUp();
        player2.levelUp();
        player2.levelUp();
        player2.damage();

        System.out.println("Player1 Xp: " + player1.playerXp);
        System.out.println("Player1 Level: " + player1.playerLevel);
        System.out.println("Player1 Health: " + player1.playerHealth);

        System.out.println("Player2 Xp: " + player2.playerXp);
        System.out.println("Player2 Level: " + player2.playerLevel);
        System.out.println("Player2 Health: " + player2.playerHealth);
        
    }
    
}
