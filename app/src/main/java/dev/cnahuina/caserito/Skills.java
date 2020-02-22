package dev.cnahuina.caserito;

public class Skills {
    private String skill ;
    private String description;
    private int image;


    public Skills(String skill, String description, int image) {
        this.skill = skill;
        this.description = description;
        this.image = image;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
