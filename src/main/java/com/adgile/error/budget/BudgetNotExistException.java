package com.adgile.error.budget;

import com.adgile.error.BusinessException;
import com.adgile.error.ErrorCode;

public class BudgetNotExistException extends BusinessException {
    public BudgetNotExistException() {
        super(ErrorCode.BUDGET_NOT_EXIST);
    }
}
