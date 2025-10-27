package Level4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성 - List형 Menu
    private List<Menu> menus;

    // 생성자 - List형 Menu 지정 필요
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    // 기능
    public void start() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ MAIN MENU ]");

            // 반복문을 사용하여 카테고리 출력
            int i = 1;
            for (Menu menu : menus) {
                System.out.println(i + ". " + menu.getCategory());
                i++;
            }
            System.out.println("0. 종료하기");

            try {
                i = sc.nextInt();
                if (i == 0) break;

                System.out.println("[ " + menus.get(i - 1).getCategory() + " ]");
                menus.get(i - 1).printMenu();
                System.out.println("0. 뒤로가기");

                while (true) {
                    try {
                        int j = sc.nextInt();
                        if (j == 0) break;
                        if (j > menus.get(i - 1).menuItems.size() || j < 0) throw new Exception();

                        System.out.print("선택한 메뉴: ");
                        menus.get(i - 1).printMenu(j - 1);
                    } catch (Exception e) {
                        System.out.println("잘못된 접근입니다. 다시 입력하세요.");
                        sc.nextLine();
                    }
                }
            } catch (Exception e) {
                sc.nextLine();
            }

        }

        System.out.println("프로그램을 종료합니다.");

    }

}
