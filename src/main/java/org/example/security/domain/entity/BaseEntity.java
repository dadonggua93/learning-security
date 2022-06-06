package org.example.security.domain.entity;

import lombok.Data;
import org.example.security.constant.CommonConstant;

import javax.persistence.Column;
import java.util.Date;

@Data
public abstract class BaseEntity {

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_by")
    private Long updateBy;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "del_flag")
    private String delFlag;

    public void preInsert() {
        this.createTime = new Date();
        this.delFlag = CommonConstant.DEL_FLAG_ON;
    }

    public void preUpdate() {
        this.updateTime = new Date();
    }

    public void preInsert(Long userId) {
        this.createBy = userId;
        this.preInsert();
    }

    public void preUpdate(Long userId) {
        this.updateBy = userId;
        this.preUpdate();
    }

    public void preDelete(){
        this.delFlag = CommonConstant.DEL_FLAG_OFF;
        this.preUpdate();
    }

    public void preDelete(Long userId){
        this.delFlag = CommonConstant.DEL_FLAG_OFF;
        this.preUpdate(userId);
    }

}
