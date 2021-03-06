package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface RecurringDepositProductApi {
    /**
     * Create a Recurring Deposit Product
     * Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId
     *
     * @param body body (required)
     * @return Call&lt;PostRecurringDepositProductsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("recurringdepositproducts")
    Call<PostRecurringDepositProductsResponse> create(
            @retrofit2.http.Body PostRecurringDepositProductsRequest body
    );

    /**
     * Delete a Recurring Deposit Product
     * Deletes a Recurring Deposit Product
     *
     * @param productId productId (required)
     * @return Call&lt;DeleteRecurringDepositProductsProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("recurringdepositproducts/{productId}")
    Call<DeleteRecurringDepositProductsProductIdResponse> delete(
            @retrofit2.http.Path("productId") Long productId
    );

    /**
     * List Recuring Deposit Products
     * Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name
     *
     * @return Call&lt;List&lt;GetRecurringDepositProductsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("recurringdepositproducts")
    Call<List<GetRecurringDepositProductsResponse>> retrieveAll();


    /**
     * Retrieve a Recurring Deposit Product
     * Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description
     *
     * @param productId productId (required)
     * @return Call&lt;GetRecurringDepositProductsProductIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("recurringdepositproducts/{productId}")
    Call<GetRecurringDepositProductsProductIdResponse> retrieveOne(
            @retrofit2.http.Path("productId") Long productId
    );

    /**
     * @return Call&lt;String&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("recurringdepositproducts/template")
    Call<String> retrieveTemplate();


    /**
     * Update a Recurring Deposit Product
     * Updates a Recurring Deposit Product
     *
     * @param productId productId (required)
     * @param body      body (required)
     * @return Call&lt;PutRecurringDepositProductsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("recurringdepositproducts/{productId}")
    Call<PutRecurringDepositProductsResponse> update(
            @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutRecurringDepositProductsRequest body
    );

}
