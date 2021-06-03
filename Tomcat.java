public class Tomcat {
    // Property | Attribut | Field
    private String name;
    private String furColor;
    private int age;

    public Tomcat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String tellYourAttributes(String checkStr) {
        switch (checkStr) {
            case "#name":
                return this.name;
            case "#color":
                return this.furColor;
            default:
                return "ERROR";
        }
    }
    public String tellYourAge() {
        return Integer.toString(this.age);
    }
}
