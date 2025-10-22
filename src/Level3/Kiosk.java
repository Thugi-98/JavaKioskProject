package Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    List<MenuItem> menuItems = new ArrayList<>();                                           // List 선언

    public void start() {

        Scanner sc = new Scanner(System.in);                                                // Scanner 선언

        System.out.println("[ SHAKESHACK MENU ]");                                          // 메뉴 안내 출력문

        int index = 0;                                                                      // 메뉴를 순서대로 출력하기 위한 변수
        for (MenuItem item : menuItems) {
            System.out.print((index+1) + ". ");
            item.printItem();
            index++;
        }

        int input;                                                                          // 숫자를 입력받을 변수
        while(true) {                                                                       // 반복문 시작
            try {
                input = sc.nextInt();                                                       // 숫자 입력 받기
                if (input == 0) break;                                                      // 0을 입력 받으면 반복문 종료

                System.out.println("선택한 메뉴 : " + menuItems.get(input-1).getName());
            } catch(Exception e) {                                                          // 예외 발생 시 안내 문구 출력 후 입력 값 초기화
                System.out.println("잘못된 접근입니다. 다시 입력하세요.");
                sc.nextLine();
            }
        }

        System.out.println("프로그램을 종료합니다.");                                           // 프로그램 종료 문구 출력

    }

    public void addMenuItem(String name, double price, String description) {                // List에 아이템 추가 기능
        menuItems.add(new MenuItem(name, price, description));
    }

}
