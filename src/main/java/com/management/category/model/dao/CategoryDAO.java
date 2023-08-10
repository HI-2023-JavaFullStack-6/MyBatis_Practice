package com.management.category.model.dao;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;

public interface CategoryDAO {


    List<CategoryDTO> selectCategoryList();
}
