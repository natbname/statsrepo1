public class TestPikachu 
{
    public static void main(String[] args)
    {
        Pikachu pikaMain = new Pikachu();
        Pikachu pikaTarget = new Pikachu();
        Bulbasaur newBulb = new Bulbasaur();
        
        System.out.println("Bulbasaur, use use leechseed!");
        newBulb.leechSeed(pikaMain);
        System.out.println("Pika Main HP: "+ pikaMain.getHP()+"Bulbasaur HP: "+newBulb.getHP());
        
        pikaMain.quickAttack(newBulb); 
        
        while(pikaTarget.getHP() > 0)
        {
            System.out.println("Pikachu, use quick attack!");
            pikaMain.quickAttack(pikaTarget);
            System.out.println("Pika Target HP: "+ pikaTarget.getHP());
        }   
    }
}
