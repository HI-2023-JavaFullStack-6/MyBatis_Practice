package com.management.category.model.dao;


import com.management.category.model.dto.CategoryDTO;
import org.apache.ibatis.jdbc.SQL;
import com.common.SearchCondition;

import java.util.Map;

public class CategoryDAOProvider {

    // * 주석을 지우고 Provider 활용하여 내용을 작성하세요.

    public String selectCategoryList(Map<String, String> parameter) {


        return null;
    }

    public String insertCategory(CategoryDTO category) {

        // 2. Provider를 활용하여 제품분류를 등록하는 코드를 작성하세요.
        //    아래 작성된 return null은 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return null;

    }

    public String updateCategory(CategoryDTO category) {

        // 3. Provider를 활용하여 제품분류명을 수정하는 코드를 작성하세요.
        //    아래 작성된 return null은 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return null;

    }

    public String deleteCategory(Map<String, String> parameter) {

        // 4. Provider를 활용하여 제품분류를 삭제하는 코드를 작성하세요.
        //    아래 작성된 return null은 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return null;

    }
}
