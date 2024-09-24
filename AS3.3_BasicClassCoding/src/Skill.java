public abstract class Skill {
    
    // Declare abstract fields
    final String name;
    final String type;
    final int skillLevel;

    // Constructor for the abstract class
    public Skill(String name, String type, int skillLevel) {
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }


    // Getters for the abstract fields
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    // Abstract method to be implemented
    public abstract void identifySkill();

}