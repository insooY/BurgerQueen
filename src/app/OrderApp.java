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


        System.out.println("ð BurgerQueen Order Service");
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
//            ėŽėĐė ėë Ĩ ë°ęļ°
//
//            if (ėŽėĐė ėë Ĩėī +ėļ ęē―ė°) {
//                ėĢžëŽļ ëīė­ ėķë Ĩ
//                break;
//            }
//		    else if (ėŽėĐė ėë Ĩėī 0ėļ ęē―ė°) {
//                ėĨë°ęĩŽë ėķë Ĩ
//            }
//		    else if (ėŽėĐė ėë Ĩėī 1ëķí° ëĐëī ë§ė§ë§ ëēíļė íīëđíë ęē―ė°) {
//                ėŽėĐėę° ęģ ëĨļ ėíė ėĩėė ëģīėŽėĢžęģ  ęģ ëĨīęē í í, ėĨë°ęĩŽëė ëīęļ°
//            }
//        }


        }
    }
}
