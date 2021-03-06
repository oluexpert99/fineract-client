package org.mifos.fineract.services;

import org.mifos.fineract.models.GetFieldConfigurationEntityResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

import java.util.List;

public interface EntityFieldConfigurationApi {
    /**
     * Retrieves the Entity Field Configuration
     * It retrieves all the Entity Field Configuration
     *
     * @param entity entity (required)
     * @return Call&lt;List&lt;GetFieldConfigurationEntityResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("fieldconfiguration/{entity}")
    Call<List<GetFieldConfigurationEntityResponse>> getAddresses(
            @retrofit2.http.Path("entity") String entity
    );

}
