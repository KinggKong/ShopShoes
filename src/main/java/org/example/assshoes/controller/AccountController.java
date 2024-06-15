package org.example.assshoes.controller;


import jakarta.servlet.http.HttpSession;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.assshoes.dto.AccountDTO;
import org.example.assshoes.service.impl.AccountService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AccountController {
    AccountService accountService;
    HttpSession session;

    @GetMapping("/login")
    public String login() {
        if (session.getAttribute("auth") != null) {
            return "redirect:/";
        }
        return "login/login";
    }

//    @GetMapping("/login/oauth2/code/google")
//    public String loginGoogle(OAuth2AuthenticationToken oAuth2AuthenticationToken) {
//        AccountDTO accountDTO = new AccountDTO();
//        accountDTO.setUsername((String) oAuth2AuthenticationToken.getPrincipal().getAttributes().get("name"));
//        accountDTO.setEmail((String) oAuth2AuthenticationToken.getPrincipal().getAttributes().get("email"));
//        System.out.println(accountDTO.getName());
//        System.out.println(accountDTO.getEmail());
//        return null;
//    }

    @PostMapping("")
    public String postLogin(Model model, @RequestParam("login-email") String email, @RequestParam("login-password") String password, @RequestParam(value = "remember", required = false) Boolean remember) {
        AccountDTO loginUser = accountService.login(email, password);
        if (loginUser != null) {
            model.addAttribute("loginAccount", loginUser);
            session.setAttribute("auth", loginUser);
            return "redirect:/";
        }
        return "login/login";
    }

    @GetMapping("/logout")
    public String logout() {
        session.invalidate();
        return "redirect:/users/login";
    }

    @GetMapping("/register")
    public String register() {
        return "login/register";
    }


}
