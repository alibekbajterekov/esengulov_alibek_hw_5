package com.company;

public class Boss {
    private int BossHp;
    private int BossDamage;
    private String BossDefense;

    public int getHp() {
        return BossHp;
    }

    public void setHp(int BossHp) {
        this.BossHp = BossHp;
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public void setDamage(int BossDamage) {
        this.BossDamage = BossDamage;
    }

    public String getDefense() {
        return BossDefense;
    }

    public void setDefense(String BossDefense) {
        this.BossDefense = BossDefense;

    }
}
