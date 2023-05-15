package org.yrdm.delivery.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yrdm.delivery.mapper.AddressBookMapper;
import org.yrdm.delivery.pojo.AddressBook;
import org.yrdm.delivery.service.AddressBookService;

/**
 * @Author: zbq
 * @Date: 2023/5/12 下午1:03
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
