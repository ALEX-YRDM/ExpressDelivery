package org.yrdm.delivery;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: zbq
 * @Date: 2023/5/10 下午10:43
 */
@Slf4j
@SpringBootApplication
@ServletComponentScan
@MapperScan("org.yrdm.delivery.mapper")
@EnableTransactionManagement
public class DeliveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeliveryApplication.class,args);
        log.info("project start success...");
    }
}
