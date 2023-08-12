package com.management.category.controller;

import com.common.SearchCondition;
import com.management.category.model.dto.CategoryDTO;
import com.management.category.model.service.CategoryService;
import com.management.category.view.CategoryPrint;
import com.management.product.model.dto.ProductDTO;
import com.management.product.model.service.ProductService;
import com.management.product.view.ProductPrint;

import java.util.List;
import java.util.Map;

public class CategoryController {

    private final CategoryPrint categoryPrint;
    private final CategoryService categoryService;

    public CategoryController(){
        categoryService = new CategoryService();
        categoryPrint = new CategoryPrint();
    }

    public void selectCategoryList(Map<String, String> parameter) {

        List<CategoryDTO> selectCategoryList = categoryService.selectCategoryList(parameter);


        if(parameter != null && parameter.size() > 0){
            categoryPrint.printTeamList(selectCategoryList,parameter);
        }else {
            categoryPrint.printErrorMessage("registNewCategory");
        }
    }

    public void registNewCategory(CategoryDTO category) {

        if(categoryService.registNewCategory(category)){
            categoryPrint.printSuccessMessage("registNewCategory");
        }else {
            categoryPrint.printErrorMessage("registNewCategory");
        }

    }

    public void modifyCategoryName(CategoryDTO category) {

        if(categoryService.modifyCategoryName(category)){
            categoryPrint.printSuccessMessage("modifyCategoryName");
        }else{
            categoryPrint.printErrorMessage("modifyCategoryName");
        }

    }

    public void deleteCategory(Map<String, String> parameter) {

        if(categoryService.deleteCategory(parameter)){
            categoryPrint.printSuccessMessage("deleteCategory");
        }else{
            categoryPrint.printErrorMessage("deleteCategory");
        }
    }
}
