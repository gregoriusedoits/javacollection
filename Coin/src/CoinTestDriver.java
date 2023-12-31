import java.util.HashSet;

public class CoinTestDriver {
    public static void main(String[ ] args) {
    //create the hashset
        HashSet<Coin> bagOfCoins = new HashSet<Coin>();
        Coin coinl = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        Coin coinl0 = new Coin(10);
        Coin coin20 = new Coin(20);
        Coin coin50 = new Coin(50);
        Coin coinl00 = new Coin(100);
        //add the coins to the bag
        bagOfCoins.add(coinl);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coinl0);
        bagOfCoins.add(coin20);
        bagOfCoins.add(coin50);
        bagOfCoins.add(coinl00);
        displayBagContents(bagOfCoins);
        displayBagDetails(bagOfCoins);
        bagOfCoins.clear();
        displayBagDetails(bagOfCoins);
    }//end method main
    
    static void displayBagContents(HashSet<Coin> bagOfCoins){
        //display the contents of the bag
        for(Coin coin: bagOfCoins)
            System.out.println(coin.getDenomination());
        //end for
    }//end method displayBagContents
    
    static void displayBagDetails(HashSet<Coin> bagOfCoins){
        if(bagOfCoins.isEmpty())
            System.out.println("There are no coins in the bag");
        else
    System.out.println("There are " + bagOfCoins.size() + " coins in the bag");
    }//end method displayBagDetails
    
    static void findCoin(HashSet<Coin> bagOfCoins, Coin coin){
        if(bagOfCoins.contains(coin))
            System.out.println("There is a coin " + coin.getDenomination() + " in the bag");
        else
            System.out.println("There is no coin " + coin.getDenomination() + " in the bag");
    }//end method findCoin
}//end class CoinTestDriver