public class SuperCat {

    // Property | Attribut | Field
    private String name;
    private String furColor;
    protected int age;

    protected SuperCat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }
    
    protected String tellYourAttributes(String checkStr) {
        switch (checkStr) {
            case "#name":
                return this.name;
            case "#color":
                return this.furColor;
            default:
                return "ERROR";
        }
    }
    // protected String tellYourAge() {
    //     return Integer.toString(this.age);
    // }
}
