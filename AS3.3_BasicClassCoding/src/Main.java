public class Main {
    public static void main(String[] args) {
        
        // Instantiate an instance of each of the concrete classes
        Skill hardSkill1 = new HardSkill("Programming", "Hard Skill", 8);
        Skill softSkill1 = new SoftSkill("Communication", "Soft Skill", 5);
        Skill giftSkill1 = new GiftSkill("Compassion", "Gift Skill", 10);
        Skill talentSkill1 = new TalentSkill("Organization", "Talent Skill", 2);

        // Call the abstract method using the instances of the concrete classes
        hardSkill1.identifySkill();
        softSkill1.identifySkill();
        giftSkill1.identifySkill();
        talentSkill1.identifySkill();
    }
}
