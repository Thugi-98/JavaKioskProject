package Level1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                                                // 스캐너 생성

        int input = 1;                                                                      // 명령어를 받을 변수 생성
        // input 값이 0이면 멈추므로 기본값을 1로 지정

        System.out.println("[ SHAKESHACK MENU ]\n" +                                        // 메뉴 설명
                "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                "0. 종료      | 종료");

        while (input != 0) {                                                                // 반복문 실행

            try {                                                                           // 예외 발생 시 대처를 위해 try 사용

                input = sc.nextInt();                                                       // 입력 받기

                switch (input) {                                                            // 명령어 별 동작 지정
                    case 1:
                        System.out.println("ShackBurger 주문완료.");
                        continue;
                    case 2:
                        System.out.println("SmokeShack 주문완료.");
                        continue;
                    case 3:
                        System.out.println("Cheeseburger 주문완료.");
                        continue;
                    case 4:
                        System.out.println("Hamburger 주문완료.");
                        continue;
                    case 0:
                        break;
                    default:
                        throw new Exception();                                              // 정해진 값 이외의 값이 들어올 경우 예외 발생시키기
                }

            } catch (Exception e) {                                                         // 예외 발생 구문
                System.out.println("잘못된 접근입니다. 다시 입력하세요.");
                sc.nextLine();                                                              // sc 초기화
            }

        }

        System.out.println("프로그램을 종료합니다.");                                           // 종료 시 출력

    }

}