package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService
{


    /**
     * 新增菜品和口味
     * @param dishDTO 菜品DTO
     */
    public void saveWithFlavor(DishDTO dishDTO);


    /**
     * 分页查询菜品
     * @param dishPageQueryDTO 分页查询菜品DTO
     * @return 分页查询结果
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 批量删除菜品
     * @param ids 菜品id列表
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品和口味
     * @param id 菜品id
     * @return 菜品VO
     */
    DishVO getByIdWithFlavor(Long id);


    /**
     * 根据ID更新菜品和口味
     * @param dishDTO 菜品DTO
     */
    void updateWithFlavor(DishDTO dishDTO);


    /**
     * 根据分类id查询菜品
     * @param categoryId 菜品分类id
     * @return 菜品列表
     */
    List<Dish> listByCategoryId(Long categoryId);
}
