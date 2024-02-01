public class Bulbasaur extends Pokemon
{
    
    
    public Bulbasaur()
    {
        setHP(70);
    }
    
    public void leechSeed(Pikachu target)
    {
        int currentHP = target.getHP();
        int resultingHP = currentHP - 20;
        target.setHP(resultingHP);
        
        int thisCurrentHP = this.getHP(); //I HATE THIS DOT SO MUCH. AUGGGH
        this.setHP(thisCurrentHP + 20); //cant go over 70. modify
        target.setHP(resultingHP); 
        
    }
    
}
