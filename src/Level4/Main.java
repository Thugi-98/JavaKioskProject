package Level4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 카테고리 별로 Menu 객체 생성
        Menu burgers = new Menu("BURGERS");
        Menu drinks = new Menu("DRINKS");
        Menu desserts = new Menu("DESSERTS");

        // 버거 메뉴 카테고리에 음식 추가
        burgers.addMenu("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgers.addMenu("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgers.addMenu("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        burgers.addMenu("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        // 카테고리 별 Menu들을 List화
        List<Menu> menus = new ArrayList<>();
        menus.add(burgers);
        menus.add(drinks);
        menus.add(desserts);

        // 키오스크 객체 생성
        Kiosk kiosk = new Kiosk(menus);

        kiosk.start();

    }
}