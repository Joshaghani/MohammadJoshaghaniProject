package com.test.myproject.data.network

import com.test.myproject.presentation.base.GlobalProperties
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.RedirectResponseException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.delete
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.patch
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.client.request.setBody
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.JsonConvertException
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.Serializable


class ApiConnection(
    val url: String,
    val client: HttpClient,
    val type: TypeMethod = TypeMethod.POST,
    val input: Any? = null,
    val parameters: List<Pair<String, Any?>>? = null,
    private val authorization: String? = null,
) {
    enum class TypeMethod {
        GET, POST, PUT, DELETE, PATCH, /*UPLOAD*/
    }

    suspend inline fun <reified T : Any> callApi(): Flow<ApiResult<T>> {

        return flow {

            emit(ApiResult.Loading)

//            var checkNet = false
//            MainScope().async {
//                checkNet = InternetAvailable().isInternetAvailable()
//            }.await()
//
//            if (!checkNet) {
//                emit(ApiResult.Error(CallErrors.NetworkNotAvailable))
//                return@flow
//            }

//            if (isVpnActive(GlobalProperties.currentActivity)) {
//                emit(ApiResult.Error(CallErrors.IsVPNActive))
//                return@flow
//            }


            try {
                var result: HttpResponse? = null
                when (type) {
                    TypeMethod.GET -> result = get()
                    TypeMethod.POST -> result = post()
                    TypeMethod.PUT -> result = put()
                    TypeMethod.DELETE -> result = delete()
                    TypeMethod.PATCH -> result = patch()
//                    TypeMethod.UPLOAD -> result = uploadFile()
                }

                emit(ApiResult.Success(result.body()))

            } catch (e: RedirectResponseException) {
                // 3xx  responses
                emit(ApiResult.Error(CallErrors.Redirection))
            } catch (e: ClientRequestException) {
                // 4xx  responses
                if (e.response.status.value == 401) {
                    emit(ApiResult.Error(CallErrors.Unauthorized))
                } else {
                    emit(ApiResult.Error(CallErrors.ClientError))
                }
            } catch (e: ServerResponseException) {
                // 5xx  responses
                emit(ApiResult.Error(CallErrors.ServerError))
            } catch (e: JsonConvertException) {

//                YandexMetrica.reportEvent(GlobalProperties.JSON_FAILD_CONVERTER + "\n" + url)

                emit(ApiResult.Error(CallErrors.ErrorException))

            } catch (e: Exception) {
                emit(ApiResult.Error(CallErrors.ErrorException))
            }
        }


    }


    suspend fun get(): HttpResponse {
        return client.get(url) {
            contentType(ContentType.Application.Json)
            authorization?.let {
                headers {
                    append("Authorization", it)
                }
            }
            input?.let {
                setBody(it)
            }

            parameters?.forEach {
                parameter(it.first, it.second)
            }
        }
    }

    suspend fun post(): HttpResponse {
        return client.post(url) {
            contentType(ContentType.Application.Json)
            authorization?.let {
                headers {
                    append("Authorization", it)
                }
            }

            input?.let {
                setBody(it)
            }

            parameters?.forEach {
                parameter(it.first, it.second)
            }

        }

    }

//    suspend fun uploadFile(): HttpResponse {
//
//        return client.post(url) {
//
//            setBody(MultiPartFormDataContent(formData {
//
//                files?.forEach {
//                    append(it.name, it.mpFile, Headers.build {
//                        append(HttpHeaders.ContentType, it.typeFile)
//                        append(
//                            HttpHeaders.ContentDisposition,
//                            "filename=${it.name}.${it.typeFile.split("/").last()}"
//                        )
//                    })
//                }
//            }))
//
//            parameters?.forEach {
//                parameter(it.first, it.second)
//            }
//
//            contentType(ContentType.Application.Json)
//            authorization?.let {
//                headers {
//                    append("Authorization", it)
//                }
//            }
//
//            onUpload { bytesSentTotal, contentLength ->
//                println("Sent $bytesSentTotal bytes from $contentLength")
//            }
//        }
//    }


    suspend fun put(): HttpResponse {
        return client.put(url) {
            contentType(ContentType.Application.Json)
            authorization?.let {
                headers {
                    append("Authorization", it)
                }
            }
            input?.let {
                setBody(it)
            }

            parameters?.forEach {
                parameter(it.first, it.second)
            }
        }
    }

    suspend fun delete(): HttpResponse {
        return client.delete(url) {
            contentType(ContentType.Application.Json)
            authorization?.let {
                headers {
                    append("Authorization", it)
                }
            }
            input?.let {
                setBody(it)
            }
            parameters?.forEach {
                parameter(it.first, it.second)
            }
        }
    }

    suspend fun patch(): HttpResponse {
        return client.patch(url) {
            contentType(ContentType.Application.Json)
            authorization?.let {
                headers {
                    append("Authorization", it)
                }
            }
            input?.let {
                setBody(it)
            }
            parameters?.forEach {
                parameter(it.first, it.second)
            }
        }
    }

}
