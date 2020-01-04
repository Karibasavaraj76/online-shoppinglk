package net.lk.shoppingbackendlk.dao;

import java.util.List;

import net.lk.shoppingbackendlk.dto.Category;

public interface CategoryDAO {
   
	List<Category> list();
	Category get(int id);
}
