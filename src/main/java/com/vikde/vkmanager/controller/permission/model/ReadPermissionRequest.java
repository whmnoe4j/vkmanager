package com.vikde.vkmanager.controller.permission.model;

/**
 * Created on 2017/7/26.
 *
 * @author vikde
 */
public class ReadPermissionRequest {
    private Integer permissionId;
    private Integer permissionGroupId;
    private Integer pageNumber;
    private Integer pageSize;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getPermissionGroupId() {
        return permissionGroupId;
    }

    public void setPermissionGroupId(Integer permissionGroupId) {
        this.permissionGroupId = permissionGroupId;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
