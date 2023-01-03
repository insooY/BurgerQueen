package app;

import app.discount.Discount;
import app.discount.discountCondition.CozDiscountCondition;
import app.discount.discountCondition.DiscountCondition;
import app.discount.discountCondition.KidDiscountCondition;
import app.discount.discountPolicy.FixedAmountDiscountPolicy;
import app.discount.discountPolicy.FixedRateDiscountPolicy;
import app.product.Product;
import app.product.ProductRepository;

import java.util.Scanner;

public class OrderApp {

    private ProductRepository productRepository;
    private Menu menu;
    private Cart cart;
    private Order order;

    public OrderApp(ProductRepository productRepository, Menu menu, Cart cart, Order order) {
        this.productRepository = productRepository;
        this.menu = menu;
        this.cart = cart;
        this.order = order;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
//        ProductRepository productRepository = new ProductRepository();
//        Product[] products = productRepository.getAllProducts();
//        Menu menu = new Menu(products);
//
//        Cart cart = new Cart(productRepository, menu);
//        Scanner scanner = new Scanner(System.in);


        System.out.println("🍔 BurgerQueen Order Service");
//
//        Order order = new Order(cart, new Discount(
//                new DiscountCondition[]{
//                new CozDiscountCondition(new FixedRateDiscountPolicy(10)),
//                new KidDiscountCondition(new FixedAmountDiscountPolicy(500))
//                })
//            );

        while (true) {
            menu.printMenu();
            String input = scanner.nextLine();

            if (input.equals("+")) {
                order.makeOrder();
                break;
            } else {
                int menuNumber = Integer.parseInt(input);

                if (menuNumber == 0) cart.printCart();
                else if (1 <= menuNumber && menuNumber <= productRepository.getAllProducts().length) cart.addToCart(menuNumber);
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
