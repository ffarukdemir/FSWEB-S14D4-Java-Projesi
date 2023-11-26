package tr.com.workintech.model.RPGGame;

public class Main {

    public static void main(String[] args) {
        Troll troll= new Troll("Ork", 100, 20);
        // yukardaki satırı Monster troll= new Troll(...) diye yazsaydık;
        // aşağıda sout("troll bleeds"+((Troll)troll).bleed()) yazmalıydık
        WereWolf wereWolf= new WereWolf("KurtAdam", 100, 10);
        System.out.println("Troll attacks"+ troll.attack());
        System.out.println("werewolf attacks"+ wereWolf.attack());

        System.out.println("troll bleeds"+ troll.bleed());
        System.out.println("werewolf bleed"+ wereWolf.bleed());


    }

}
