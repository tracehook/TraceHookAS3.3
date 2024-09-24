public class HardSkill extends Skill {
    
    // Constructor for HardSkill
    public HardSkill(String name, String type, int skillLevel) {
        super(name, type, skillLevel);
    }

    // Implementation of IdentifySkill in the HardSkill class
    public void identifySkill() {
        System.out.println(type + " of " + name + " has a level of " + skillLevel);
    }
}