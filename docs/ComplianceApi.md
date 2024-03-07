# ComplianceApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJob**](ComplianceApi.md#createJob) | **POST** /2/compliance/jobs | Create compliance job |
| [**getJobById**](ComplianceApi.md#getJobById) | **GET** /2/compliance/jobs/{id} | Get Compliance Job |
| [**listJobs**](ComplianceApi.md#listJobs) | **GET** /2/compliance/jobs | List Compliance Jobs |
| [**streamData**](ComplianceApi.md#streamData) | **GET** /2/tweets/compliance/stream | Tweets Compliance stream |
| [**streamTweetsLabelEvents**](ComplianceApi.md#streamTweetsLabelEvents) | **GET** /2/tweets/label/stream | Tweets Label stream |
| [**streamUsersData**](ComplianceApi.md#streamUsersData) | **GET** /2/users/compliance/stream | Users Compliance stream |


<a name="createJob"></a>
# **createJob**
> CreateComplianceJobResponse createJob(createComplianceJobRequest).execute();

Create compliance job

Creates a compliance for the given job type

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComplianceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    String type = "tweets"; // Type of compliance job to list.
    String name = "name_example"; // User-provided name for a compliance job.
    Boolean resumable = true; // If true, this endpoint will return a pre-signed URL with resumable uploads enabled.
    try {
      CreateComplianceJobResponse result = client
              .compliance
              .createJob(type)
              .name(name)
              .resumable(resumable)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#createJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateComplianceJobResponse> response = client
              .compliance
              .createJob(type)
              .name(name)
              .resumable(resumable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#createJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createComplianceJobRequest** | [**CreateComplianceJobRequest**](CreateComplianceJobRequest.md)|  | |

### Return type

[**CreateComplianceJobResponse**](CreateComplianceJobResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getJobById"></a>
# **getJobById**
> Get2ComplianceJobsIdResponse getJobById(id).complianceJobFields(complianceJobFields).execute();

Get Compliance Job

Returns a single Compliance Job by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComplianceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    String id = "id_example"; // The ID of the Compliance Job to retrieve.
    Set<String> complianceJobFields = Arrays.asList(); // A comma separated list of ComplianceJob fields to display.
    try {
      Get2ComplianceJobsIdResponse result = client
              .compliance
              .getJobById(id)
              .complianceJobFields(complianceJobFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getJobById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2ComplianceJobsIdResponse> response = client
              .compliance
              .getJobById(id)
              .complianceJobFields(complianceJobFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getJobById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the Compliance Job to retrieve. | |
| **complianceJobFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of ComplianceJob fields to display. | [optional] [enum: created_at, download_expires_at, download_url, id, name, resumable, status, type, upload_expires_at, upload_url] |

### Return type

[**Get2ComplianceJobsIdResponse**](Get2ComplianceJobsIdResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="listJobs"></a>
# **listJobs**
> Get2ComplianceJobsResponse listJobs(type).status(status).complianceJobFields(complianceJobFields).execute();

List Compliance Jobs

Returns recent Compliance Jobs for a given job type and optional job status

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComplianceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    String type = "tweets"; // Type of Compliance Job to list.
    String status = "created"; // Status of Compliance Job to list.
    Set<String> complianceJobFields = Arrays.asList(); // A comma separated list of ComplianceJob fields to display.
    try {
      Get2ComplianceJobsResponse result = client
              .compliance
              .listJobs(type)
              .status(status)
              .complianceJobFields(complianceJobFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#listJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Get2ComplianceJobsResponse> response = client
              .compliance
              .listJobs(type)
              .status(status)
              .complianceJobFields(complianceJobFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#listJobs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Type of Compliance Job to list. | [enum: tweets, users] |
| **status** | **String**| Status of Compliance Job to list. | [optional] [enum: created, in_progress, failed, complete] |
| **complianceJobFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of ComplianceJob fields to display. | [optional] [enum: created_at, download_expires_at, download_url, id, name, resumable, status, type, upload_expires_at, upload_url] |

### Return type

[**Get2ComplianceJobsResponse**](Get2ComplianceJobsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="streamData"></a>
# **streamData**
> Object streamData(partition).backfillMinutes(backfillMinutes).startTime(startTime).endTime(endTime).execute();

Tweets Compliance stream

Streams 100% of compliance data for Tweets

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComplianceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    Integer partition = 56; // The partition number.
    Integer backfillMinutes = 56; // The number of minutes of backfill requested.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweet Compliance events will be provided.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweet Compliance events will be provided.
    try {
      Object result = client
              .compliance
              .streamData(partition)
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#streamData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .compliance
              .streamData(partition)
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#streamData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **partition** | **Integer**| The partition number. | |
| **backfillMinutes** | **Integer**| The number of minutes of backfill requested. | [optional] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweet Compliance events will be provided. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweet Compliance events will be provided. | [optional] |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="streamTweetsLabelEvents"></a>
# **streamTweetsLabelEvents**
> Object streamTweetsLabelEvents().backfillMinutes(backfillMinutes).startTime(startTime).endTime(endTime).execute();

Tweets Label stream

Streams 100% of labeling events applied to Tweets

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComplianceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    Integer backfillMinutes = 56; // The number of minutes of backfill requested.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweet labels will be provided.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp from which the Tweet labels will be provided.
    try {
      Object result = client
              .compliance
              .streamTweetsLabelEvents()
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#streamTweetsLabelEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .compliance
              .streamTweetsLabelEvents()
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#streamTweetsLabelEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **backfillMinutes** | **Integer**| The number of minutes of backfill requested. | [optional] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweet labels will be provided. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp from which the Tweet labels will be provided. | [optional] |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="streamUsersData"></a>
# **streamUsersData**
> Object streamUsersData(partition).backfillMinutes(backfillMinutes).startTime(startTime).endTime(endTime).execute();

Users Compliance stream

Streams 100% of compliance data for Users

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.X;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComplianceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.twitter.com";
    
    // Configure HTTP bearer authorization: BearerToken
    configuration.token = "BEARER TOKEN";
    X client = new X(configuration);
    Integer partition = 56; // The partition number.
    Integer backfillMinutes = 56; // The number of minutes of backfill requested.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the User Compliance events will be provided.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp from which the User Compliance events will be provided.
    try {
      Object result = client
              .compliance
              .streamUsersData(partition)
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#streamUsersData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .compliance
              .streamUsersData(partition)
              .backfillMinutes(backfillMinutes)
              .startTime(startTime)
              .endTime(endTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#streamUsersData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **partition** | **Integer**| The partition number. | |
| **backfillMinutes** | **Integer**| The number of minutes of backfill requested. | [optional] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the User Compliance events will be provided. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp from which the User Compliance events will be provided. | [optional] |

### Return type

**Object**

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

