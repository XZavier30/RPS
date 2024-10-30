  class RPS {
   public static void main(Strig args[]){
     System.out.println(Config.printRules());

     Player player = new Player();
     int pChoice = player.getPcChoice();
     String pcChioceString = Config.printChoice(pChoice);

     Player npc = new Player();
     int pChoice = npc.getNpcChoice();
     String npcChoiceString = Config.printChoice(npcChoice);

     System.out.println("Player chose: " + pcChoiceString);
     System.out.println("NPC chose: " + npcChoiceString);
     System.out.println(Config.printOutcome(Config.calculateWinner(pChoice, npcChoice)));
     }
   }
}
