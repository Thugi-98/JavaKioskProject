package Level3;

public class MenuItem {

    // 속성
    private String name;
    private double price;
    private String explanation;

    // 생성자
    public MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    public String getName() {
        return name;
    }

    // 기능
    public void printItem() {
        System.out.print(name + " | ");
        System.out.print("￦ " + price + " | ");
        System.out.println(explanation);
    }


}