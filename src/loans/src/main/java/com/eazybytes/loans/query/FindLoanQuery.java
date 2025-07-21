package com.kurobytes.loans.query;

import lombok.Value;

@Value
public class FindLoanQuery {
    private final String mobileNumber;
}
