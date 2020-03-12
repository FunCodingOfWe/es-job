package com.kevin.task.test;


import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import com.kevin.task.annotation.ElasticJobConfig;
import org.springframework.stereotype.Component;

/**
 * @author: kevin
 * @Date: 2020/1/22
 */

@Component
@ElasticJobConfig(
        name = "com.kevin.task.task.MySimpleJob",
        cron = "0/5 * * * * ?",
        description = "测试简单任务",
        overwrite = true,
        eventTraceRdbDataSource = "dataSource",
        shardingTotalCount = 2
)
public class MySimpleJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("执行mysimpleJob====");
    }
}
