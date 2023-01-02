package app;

import app.product.Product;
import app.product.ProductRepository;

import java.util.Scanner;

public class OrderApp {
    public void start() {

        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);

        Cart cart = new Cart(productRepository, menu);
        Scanner scanner = new Scanner(System.in);

        System.out.println("🍔 BurgerQueen Order Service");

        while (true) {
            menu.printMenu();
            String input = scanner.nextLine();

            if (input.equals("+")) {
                break;
            } else {
                int menuNumber = Integer.parseInt(input);

                if (menuNumber == 0) cart.printCart();
                else if (1 <= menuNumber && menuNumber <= products.length) cart.addToCart(menuNumber);
            }
//            사용자 입력 받기
//
//            if (사용자 입력이 +인 경우) {
//                주문 내역 출력
//                break;
//            }
//		    else if (사용자 입력이 0인 경우) {
//                장바구니 출력
//            }
//		    else if (사용자 입력이 1부터 메뉴 마지막 번호에 해당하는 경우) {
//                사용자가 고른 상품의 옵션을 보여주고 고르게 한 후, 장바구니에 담기
//            }
//        }


        }
    }
}
