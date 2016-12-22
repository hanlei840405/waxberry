package com.fruit.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JesseHan on 2016/12/21.
 */
@Getter
@Setter
public class CategoryDto implements Serializable {
    private static final long serialVersionUID = 5986024163828798060L;
    // 自身属性
    private String code;
    private String name;
    private String imgUrl;
    private Long sequence;

    // 上级类目属性
    private String categoryCode;
    private CategoryDto category;
    private List<CategoryDto> elements = new ArrayList<>();
}
