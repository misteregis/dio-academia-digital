package me.dio.academia.digital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class OASController {
    /**
     * Define o mapeamento da página de índice para apontar para a IU do Swagger.
     *
     * @return Um redirecionamento para a IU do Swagger.
     */
    @GetMapping
    public String index() {
        return "redirect:swagger-ui/";
    }
}
