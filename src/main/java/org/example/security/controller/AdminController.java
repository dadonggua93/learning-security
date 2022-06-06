package org.example.security.controller;

import org.example.security.constant.SecurityConstant;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("hasAnyRole(" + SecurityConstant.ROLE_ADMIN + ")")
@RestController
@RequestMapping("/admin")
public class AdminController {


    @GetMapping
    public String info() {
        return "admin detail";
    }


}
