package mate.academy.service;

import java.util.List;
import java.util.Optional;
import mate.academy.model.Order;
import mate.academy.model.ShoppingCart;
import mate.academy.model.User;

public interface OrderService {
    Order add(Order order);

    Optional<Order> get(Long id);

    List<Order> getAll();

    List<Order> getOrdersHistory(User user);

    Order completeOrder(ShoppingCart shoppingCart);
}
