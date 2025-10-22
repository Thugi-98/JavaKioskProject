package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();                           // List 생성 및 초기화
        menuItems.add(new MenuItem(                                             // new MenuItem을 List에 삽입
                "ShackBurger ",
                6.9,
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(
                "SmokeBurger ",
                8.9,
                "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(
                "Cheeseburger",
                6.9,
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem(
                "Hamburger   ",
                5.4,
                "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);                                    // 스캐너 생성
        int input;                                                              // 숫자를 입력받을 input 생성

        int index = 1;                                                          // List 안에 있는 MenuItem 순서 출력을 위한 변수

        for (MenuItem menuItem : menuItems) {                                   // 반복문을 통해 List 안에 있는 MenuItem을 하나씩 출력
            System.out.print(index + ". ");
            menuItem.printItem();
            index++;
        }

        while (true) {                                                          // 반복문 실행

            try {
                input = sc.nextInt();                                           // 숫자 입력 받기

                if (input == 0) break;                                          // 0이 입력될 경우 프로그램 종료

                System.out.print("선택한 메뉴 : ");                               // 선택된 메뉴의 정보 출력 (이름, 가격, 설명)
                menuItems.get(input-1).printItem();

            } catch (Exception e) {                                             // 예외 발생 시 경고문구 출력
                System.out.println("잘못된 접근입니다. 다시 입력하세요.");
                sc.nextLine();                                                  // 입력받은 숫자 초기화
            }

        }

        System.out.println("프로그램을 종료합니다.");                               // 종료 메시지 출력

    }
}