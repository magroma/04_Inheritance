public class Cat extends SuperCat {

    private int level; // intern verwendet

    public Cat(String name, String furColor, int age) {
        super(name, furColor, age);
    }


    public String tellYourAge() {
        return this.checkEscalationLevel();
    }

    private String checkEscalationLevel() {

        this.level++;

        switch (level) {
            case 1:
                return "This is an inappropriate question!";
            case 2:
                return "I've told you once!";
            case 3:
                return "Talk to the hand!";
            default:
                return "#!?&&%";
        }

    }

}
