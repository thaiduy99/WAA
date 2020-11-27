package edu.mum.formatter;

import edu.mum.domain.Category;
import edu.mum.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class CategoryFormatter implements Formatter<Category> {
    @Autowired
    CategoryService categoryService;

    @Override
    public Category parse(String s, Locale locale) throws ParseException {
        System.out.println("Parse categoryID to Category.");
        return categoryService.getCategory(Integer.parseInt(s));
    }

    @Override
    public String print(Category category, Locale locale) {
        System.out.println("Print Category to Category name");
        return category.getName();
    }
}
