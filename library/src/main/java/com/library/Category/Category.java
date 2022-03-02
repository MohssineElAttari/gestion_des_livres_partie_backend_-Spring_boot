package com.library.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category {

    private String code;
    private String label;

    public Category(){
        super();
    }

    public Category(String code,String label){
        super();
        this.code=code;
        this.label=label;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Id
    @Column(name = "CODE")
    public String getCode(){
        return code;
    }
    @Column(name = "LABEL", nullable = false)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
