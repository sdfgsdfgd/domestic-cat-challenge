package au.com.domestic.cat.kaantest.data.restaurants

import au.com.domestic.cat.kaantest.data.ZomatoApi
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest
import com.google.api.client.http.json.JsonHttpContent

abstract class ZomatoApiRequest<T>(
        client: ZomatoApi,
        requestMethod: String,
        urlTemplate: String,
        content: Any?,
        responseClass: Class<T>
) : AbstractGoogleClientRequest<T>(
        client, requestMethod, urlTemplate,
        content?.let { JsonHttpContent(client.jsonFactory, it) },
        responseClass
)
