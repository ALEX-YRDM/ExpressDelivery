package org.yrdm.delivery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yrdm.delivery.pojo.Category;

/**
 * @Author: zbq
 * @Date: 2023/5/11 下午3:40
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
