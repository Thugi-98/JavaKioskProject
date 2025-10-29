package challenge.Level1;

public class MenuItem {

    // 속성 - 이름, 가격, 설명
    private String name;
    private double price;
    private String description;

    // 생성자 - 이름, 가격, 설명 지정 필요
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 기능 - 아이템 속성 출력
    public void printItem() {
        System.out.print(name + "\t| ");
        System.out.print("￦ " + price + " | ");
        System.out.println(description);
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

}