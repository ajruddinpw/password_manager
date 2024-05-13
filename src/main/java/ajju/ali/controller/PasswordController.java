package ajju.ali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ajju.ali.entity.PasswordEntity;
import ajju.ali.service.PasswordService;

import java.util.List;

@Controller
@RequestMapping("/passwords")
public class PasswordController {

    private PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @GetMapping("/list")
    public String listPasswords(Model model) {

        List<PasswordEntity> thePasswords = passwordService.findAll();

        model.addAttribute("passwords", thePasswords);

        return "/passwords/list-passwords";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

        PasswordEntity passwordEntity = new PasswordEntity();

        model.addAttribute("passwordEntity", passwordEntity);

        return "passwords/password-form";
    }

    @PostMapping("/save")
    public String savePassword(@ModelAttribute("passwordEntity") PasswordEntity thePasswordEntity) {

        passwordService.save(thePasswordEntity);

        return "redirect:/passwords/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("passwordId") int theId, Model model) {

        PasswordEntity passwordEntity = passwordService.findById(theId);

        model.addAttribute("passwordEntity", passwordEntity);

        return "passwords/password-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("passwordId") int theId) {

        PasswordEntity passwordEntity = passwordService.findById(theId);

        passwordService.deleteById(theId);

        return "redirect:/passwords/list";
    }
}















