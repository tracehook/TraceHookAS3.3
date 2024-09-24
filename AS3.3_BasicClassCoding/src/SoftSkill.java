public class SoftSkill extends Skill{

    // Constructor for SoftSkill
    public SoftSkill(String name, String type, int skillLevel) {
        super(name, type, skillLevel);
    }

    // Implementation of IdentifySkill in the SoftSkill class
    public void identifySkill() {
        System.out.println(type + " of " + name + " has a level of " + skillLevel);
    }
}
