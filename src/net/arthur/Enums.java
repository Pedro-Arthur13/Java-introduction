package net.arthur;

public class Enums {
    public static void main(String[] args) {
        /* Enums and advanced Enums */

        //Basically enums:
        //Enums sao tipo variaveis com valores predeterminados que podem ser assigned para elas

        Difficulty gameDifficulty = Difficulty.medium;
        //we can reassign
        gameDifficulty = Difficulty.hard;

        if (gameDifficulty == Difficulty.hard){
            //o something
        }

        //Advanced enum
        TollTier tier = TollTier.Netherite;
        System.out.println(tier.getAttackSpeed());
    }
}
