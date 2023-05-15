package org.yrdm.delivery.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yrdm.delivery.mapper.EmployeeMapper;
import org.yrdm.delivery.pojo.Employee;
import org.yrdm.delivery.service.EmployeeService;

/**
 * @Author: zbq
 * @Date: 2023/5/11 上午9:12
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
