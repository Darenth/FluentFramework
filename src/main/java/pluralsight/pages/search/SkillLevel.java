package pluralsight.pages.search;

public enum SkillLevel {
    BEGINNER("Beginner"), INTERMEDIATE("Intermediate"), ADVANCED("Advanced");

    private String level;

    SkillLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return level;
    }
}
