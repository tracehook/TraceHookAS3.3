public class GiftSkill extends Skill {

    //Constructor for GiftSkill
    public GiftSkill(String name, String type, int skillLevel) {
        super(name, type, skillLevel);
    }

    // Implementation of IdentifySkill in the GiftSkill class
    public void identifySkill() {
        System.out.println(type + " of " + name + " has a level of " + skillLevel);
    }
}
