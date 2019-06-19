package com.mixone.portal.admin.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//
public class AppModuleNode implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String text;
    private String parentId;


    private Integer orderIndex;

    private boolean lazyLoad = true;

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public boolean isLazyLoad() {
        return lazyLoad;
    }

    public void setLazyLoad(boolean lazyLoad) {
        this.lazyLoad = lazyLoad;
    }

    public List<AppModuleNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<AppModuleNode> nodes) {
        this.nodes = nodes;
    }

    private List<AppModuleNode> nodes = new ArrayList<AppModuleNode>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
