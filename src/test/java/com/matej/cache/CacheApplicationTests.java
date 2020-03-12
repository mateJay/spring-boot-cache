package com.matej.cache;

import com.matej.cache.entity.BaseUserEntity;
import com.matej.cache.service.BaseUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CacheApplicationTests {

    @Resource
    private BaseUserService baseUserService;
	@Test
	void contextLoads() {
	}

	@Test
    void update() {
        BaseUserEntity update = new BaseUserEntity();
        update.setId(1002L);
        update.setLoginMobile("119");
	    baseUserService.update(update);
    }


}
