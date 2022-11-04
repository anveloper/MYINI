package com.ssafy.myini.apidocs.service;

import com.ssafy.myini.apidocs.request.*;
import com.ssafy.myini.apidocs.response.*;

import java.util.List;

public interface ApiDocsService {
    void createApiController(Long projectId, CreateApiControllerRequest request);
    List<ApiControllerListResponse> findApiControllerList(Long projectId);
    ApiControllerResponse findByApiControllerId(Long apiControllerId);
    void updateApiController(Long apiControllerId, UpdateApiControllerRequest request);
    void deleteApiController(Long apiControllerId);
    void createApi(Long apiControllerId, CreateApiRequest request);
    void updateApi(Long apiId, UpdateApiRequest request);
    void deleteApi(Long apiId);
    ApiInfoResponse findByApiId(Long apiId);
    void createPathVariable(Long apiId, CreatePathVariableRequest request);
    void updatePathVariable(Long pathVariableId, UpdatePathVariableRequest request);
    void deletePathVariable(Long pathVariableId);
    void createQueryString(Long apiId, CreateQueryStringRequest request);
    void updateQueryString(Long queryStringId, UpdateQueryStringRequest request);
    void deleteQueryString(Long queryStringId);
    void createCustomDto(Long projectId, CreateDtoRequest request);
    void createDto(Long apiId, CreateDtoRequest request);
    void updateDto(Long dtoId, UpdateDtoRequest request);
    void deleteDto(Long dtoId);
    DtoResponse findByDtoId(Long dtoId);
    void createDtoItem(Long dtoId, CreateDtoItemRequest request);
    void updateDtoItem(Long dtoItemId, UpdateDtoItemRequest request);
    void deleteDtoItem(Long dtoItemId);
    TypeListResponse findTypeList(Long projectId);
    List<ProjectInfoListResponse> findAll(Long projectId);
}