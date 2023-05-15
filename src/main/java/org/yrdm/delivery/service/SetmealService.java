package org.yrdm.delivery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yrdm.delivery.dto.SetmealDto;
import org.yrdm.delivery.pojo.Setmeal;

import java.util.List;

/**
 * @Author: zbq
 * @Date: 2023/5/11 下午3:41
 */
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

    public SetmealDto getByIdWithDish(Long id);

    public void updateWithDish(SetmealDto setmealDto);
}
