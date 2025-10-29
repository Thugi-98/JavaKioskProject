package challenge.Level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {

    // 속성
    private List<MenuItem> cartList = new ArrayList<>();
    private double price = 0;
    private Scanner sc = new Scanner(System.in);

    // 생성자

    // 기능
    public void addCart(MenuItem menuItem) {
        menuItem.printItem();
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인 \t 2.취소");
        while (true) {
            try {
                int i = sc.nextInt();
                if (i == 1) {
                    cartList.add(menuItem);
                    price += menuItem.getPrice();
                    System.out.println(menuItem.getName() + " 이 장바구니에 추가되었습니다.");
                    break;
                } else if (i == 2) {
                    System.out.println("장바구니 추가가 취소되었습니다.");
                    break;
                } else throw new Exception();

            } catch (Exception e) {
                System.out.println("잘못된 접근입니다. 다시 입력하세요.");
                sc.nextLine();
            }
        }
    }

    public void order() {
        if (!cartList.isEmpty()) {
            System.out.println("아래와 같이 주문하시겠습니까?");
            System.out.println("\n[ Orders ]");
            for (MenuItem menuItem : cartList) {
                menuItem.printItem();
            }
            System.out.println("\n[ Total ]");
            System.out.println("￦ " + price);
            System.out.println("\n1. 주문\t 2. 메뉴판");

            while (true) {
                try {
                    int i = sc.nextInt();
                    if (i == 1) {
                        System.out.println("주문이 완료되었습니다. 금액은 ￦ " + price + " 입니다.");
                        cartList.clear();
                        price = 0;
                        break;
                    } else if (i == 2) {
                        System.out.println("메뉴로 돌아갑니다.\n");
                        break;
                    } else throw new Exception();
                } catch (Exception e) {
                    System.out.println("잘못된 접근입니다. 다시 입력하세요.");
                }
            }
        } else throw new RuntimeException();
    }

    public void cancelOrder() {
        if (!cartList.isEmpty()) {
            cartList.clear();
            price = 0;
            System.out.println("모든 주문이 취소되었습니다.");
        } else throw new RuntimeException();
    }

    public List<MenuItem> getCartList() {
        return cartList;
    }

}
