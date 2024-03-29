package com.newsapp.newsapp.data.remote;

import com.newsapp.newsapp.model.newsresponse.dto.newsresponse.NewsResponse;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RemoteService {

  @GET("v2/top-headlines")
  Single<NewsResponse> getNewsHeadlines(@Query("country") String country, @Query("page") int pageNo,
      @Query("apiKey") String apiKey);
}
