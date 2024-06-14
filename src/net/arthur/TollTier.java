package net.arthur;

public enum TollTier {
    Diamond(6,8),
    Netherite(10,4);
    // Advanced enum
    private final int attackMultiplier;
    private final int attackSpeed;
    TollTier(int attackMultiplier,int attackSpeed){
        this.attackMultiplier = attackMultiplier;
        this.attackSpeed = attackSpeed;

    }

    public int getAttackMultiplier() {
        return attackMultiplier;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }
}
