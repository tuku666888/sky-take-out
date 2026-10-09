package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

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
}
