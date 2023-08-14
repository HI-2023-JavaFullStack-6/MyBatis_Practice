package com.management.category.controller;

import com.management.category.model.dto.CategoryDTO;
import com.management.category.model.service.CategoryService;
import com.management.category.view.CategoryPrint;
import com.management.product.model.dao.ProductDAO;
import com.management.product.view.ProductPrint;

import java.util.List;
import java.util.Map;

public class CategoryController {



    private final CategoryService categoryService;

    private final CategoryPrint categoryPrint;

    public CategoryController(){
        categoryService = new CategoryService();
        categoryPrint = new CategoryPrint();
    }
    public void selectCategoryList(Map<String, String> parameter) {


        List<CategoryDTO> teamList = categoryService.selectCategoryList(parameter);

        if(teamList != null && teamList.size() > 0){
            categoryPrint.printTeamList(teamList, parameter);
        }else{
            categoryPrint.printErrorMessage("selectCategoryList");
        }
    }

    public void registNewCategory(CategoryDTO category) {



        boolean result = categoryService.registNewCategory(category);
        if(result == true) {
            categoryPrint.printSuccessMessage("registNewCategory");
        }else{
            categoryPrint.printErrorMessage("registNewCategory");
        }
    }

    public void modifyCategoryName(CategoryDTO category) {


        boolean result = categoryService.modifyCategoryName(category);

        if(result == true) {
            categoryPrint.printSuccessMessage("modifyCategoryName");
        }else{
            categoryPrint.printErrorMessage("modifyCategoryName");
        }
    }

    public void deleteCategory(Map<String, String> parameter) {


        boolean result = categoryService.deleteCategory(parameter);

        if(result == true){
            categoryPrint.printSuccessMessage("deleteCategory");
        }else{
            categoryPrint.printErrorMessage("deleteCategory");
        }

    }
}
