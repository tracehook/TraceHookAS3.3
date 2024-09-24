public class TalentSkill extends Skill {

    //Constructor for TalentSkill
    public TalentSkill(String name, String type, int skillLevel) {
        super(name, type, skillLevel);
    }

    // Implementation of IdentifySkill in the TalentSkill class
    public void identifySkill() {
        System.out.println(type + " of " + name + " has a level of " + skillLevel);
    }
}
