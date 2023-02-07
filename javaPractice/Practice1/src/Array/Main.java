package Array;

import java.util.*;
 
class Player
{
    String name;
    int score;
 
    public Player(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
 
    @Override
    public String toString()
    {
        return "{" +
                        "name='" + name + '\'' +
                        ", score=" + score +
                        '}';
    }
 
    public String getName() {
        return name;
    }
 
    public int getScore() {
        return score;
    }
}
class RamComparator implements Comparator<Player> {
    // override the compare() method
    public int compare(Player l1, Player l2)
    {
        if (l1.score == l2.score) {
            return 0;
        }
        else if (l1.score < l2.score) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
 
class Main
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	
    	
    	
        List<Player> players = new ArrayList<>();
 for(int i=0;i<n;i++) {
	 Player player=new Player(sc.next(),sc.nextInt());
	 players.add(player);
	 
 }
        Collections.sort(players, new RamComparator());
        
        
      
// Player  ,players, player
//       System.out.println(persons);
        for(Player player:players) {
        	System.out.println(player.getName()+" "+player.getScore());
        }
        sc.close();
    }
}

