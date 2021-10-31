package com.adgile.controller;

import com.adgile.Response;
import com.adgile.dto.request.BudgetRequestDto;
import com.adgile.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/budget")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class BudgetController {

    private final BudgetService budgetService;

    @PutMapping("{id}")
    public Response<String> update(@RequestBody @Valid BudgetRequestDto.update request) {
        budgetService.update(request);
        return Response.OK;
    }

}
