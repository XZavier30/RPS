public class Config {
   public static String printRules() {
      return "Pick between ROCk, PAPER, or SCICCORS.";
}

// 0 = Draw, 1 = Plaryer Wins, -1 = NPC Wins
public static int calculatWinner(int pChoice, int npcChoice) {
   if (pChoice == npcChoice) {
      return 0; // Draw if both choices are the same
   } else if ((pChoice == 0 && npcChoice == 2) || (pChoice == 1 && npcChoice == 0) || (pChoice == 2 && npcChoice == 1)) {
      return 1; //Playar wims
   } else {
      return -1; // NPC wins
   }
}
public static String printChoice(int choice) {
      String choiceString "";
      if(choice == 0) {
         choiceString = "ROCK";
      } else if(choice == 1) {
         choiceString = "PAPER";
      } else if(choice == 2) {
         choiceString = "SCISSORS";
      }
      return choiceString;
  }
}

