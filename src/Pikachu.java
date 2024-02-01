public class Pikachu extends Pokemon
{
    public Pikachu()
    {
        setHP(70);
    }
    
    public void quickAttack(Pokemon newPokemon)
    {
        int currentHP = newPokemon.getHP();
        int resultingHP = currentHP - 10;
        newPokemon.setHP(resultingHP);
    }
    
    public void electroBall(){} //attk does 60 dmg
       
}
