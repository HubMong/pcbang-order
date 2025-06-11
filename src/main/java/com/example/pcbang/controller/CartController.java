package com.example.pcbang.controller;

import com.example.pcbang.entity.Menu;
import com.example.pcbang.model.CartItem;
import com.example.pcbang.repository.MenuRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final MenuRepository menuRepository;

    public CartController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    // 장바구니에 메뉴 추가
    @PostMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, HttpSession session) {
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        if (cart == null) cart = new ArrayList<>();

        Optional<Menu> menuOpt = menuRepository.findById(id);
        if (menuOpt.isPresent()) {
            Menu menu = menuOpt.get();
            Optional<CartItem> found = cart.stream().filter(i -> i.getId().equals(id)).findFirst();
            if (found.isPresent()) {
                found.get().setQuantity(found.get().getQuantity() + 1);
            } else {
                cart.add(new CartItem(menu.getId(), menu.getName(), menu.getPrice(), 1));
            }
        }

        session.setAttribute("cart", cart);
        return "redirect:/cart/view";
    }

    // 장바구니 화면 보기
    @GetMapping("/view")
    public String viewCart() {
        return "cart"; // templates/cart.html
    }

    // 장바구니 비우기
    @PostMapping("/clear")
    public String clearCart(HttpSession session) {
        session.removeAttribute("cart");
        return "redirect:/cart/view";
    }
}
