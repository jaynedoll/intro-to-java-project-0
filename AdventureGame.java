public class AdventureGame {
    public static void main(String[] args) {
        System.out.println("hello world");

        String skibidi = "skibidi";
        int turnCounter = 0;
        int userChoice = -1;
        String userGuess = "";

        greetPlayer();
        
        while (!userGuess.equalsIgnoreCase(skibidi)) {
            
            giveActions(); 
            userChoice = recordUserChoice(); 
            switch (userChoice) {
                case value:
                    
                    break;
            
                default:
                    break;
            }
        // navigation options

        // record user choice
        // based on users choice do something
        //  4 actions
        //      bring out the lobster
        //      pull out phone
        //      drink matcha
        //      play guitar
        //  4 navigations
        //      left
        //      right
        //      up
        //      down
        //  sleep
        //  help
        //      display all available choices
        //  secret word
        //      game finishes, displays turn amount
        //  random kid 
        }
    }

    private static void giveActions() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'giveActions'");
    }

    private static void greetPlayer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greetPlayer'");
    }
}
