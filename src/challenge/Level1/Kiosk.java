package challenge.Level1;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private List<Menu> menus;
    private Scanner sc = new Scanner(System.in);
    private Cart cart = new Cart();
    private int exitCode = 0;

    // 생성자 - List형 Menu 지정 필요
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    // 기능
    public void start() {

        while (exitCode != 1) {
            mainMenu();
        }

        System.out.println("프로그램을 종료합니다.");

    }

    void mainMenu() {
        printCategoryList();

        while (true) {
            try {
                int i = sc.nextInt();
                if (i == 0) {
                    exitCode = 1;
                    break;
                }
                else {
                    if (i == 4) cart.order();
                    else if (i == 5) cart.cancelOrder();
                    else subMenu(i);
                    printCategoryList();
                }
            } catch (Exception e) {
                System.out.println("잘못된 접근입니다. 다시 입력하세요.");
                sc.nextLine();
            }
        }

    }

    void subMenu(int i) {
        System.out.println("[ " + menus.get(i - 1).getCategory() + " ]");
        menus.get(i - 1).printMenu();
        System.out.println("0. 뒤로가기");

        while (true) {
            try {
                int j = sc.nextInt();
                if (j == 0) break;
                if (j > menus.get(i - 1).menuItems.size() || j < 0) throw new Exception();

                cart.addCart(menus.get(i - 1).menuItems.get(j - 1));
                break;

            } catch (Exception e) {
                System.out.println("잘못된 접근입니다. 다시 입력하세요.");
                sc.nextLine();
            }
        }
    }

    void printCategoryList() {
        System.out.println("[ MAIN MENU ]");
        int i = 1;
        for (Menu menu : menus) {
            System.out.println(i + ". " + menu.getCategory());
            i++;
        }
        if (!cart.getCartList().isEmpty()) {
            System.out.println("\n[ ORDER MENU ]");
            System.out.println("4. Orders\t | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel\t | 진행중인 주문을 취소합니다.");
        }
        System.out.println("0. 종료\t | 종료");
    }

}