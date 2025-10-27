package Level4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성 - 카테고리, List형 menuItem
    private String category;
    public List<MenuItem> menuItems = new ArrayList<>();

    // 생성자 - Menu 생성시 카테고리 지정 필요
    public Menu(String category) {
        this.category = category;
    }

    // 기능 - menuItem 리스트에 메뉴 추가, 메뉴 전체 혹은 개별 출력, 카테고리 반환
    public void addMenu(String name, double price, String description) {
        menuItems.add(new MenuItem(name, price, description));
    }

    public void printMenu() {
        int i = 0;
        for (MenuItem menuItem : menuItems) {
            System.out.print((i + 1) + ". ");
            menuItem.printItem();
            i++;
        }
    }

    public void printMenu(int i) {
        menuItems.get(i).printItem();
    }

    public String getCategory() {
        return category;
    }
}