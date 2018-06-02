package com.ml.diamond.intercepter;


import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.parser.CCJSqlParserManager;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Connection;
import java.util.Properties;

@Slf4j
@Intercepts({@Signature(method = "prepare", type = StatementHandler.class, args = {Connection.class, Integer.class})})
public class CityInterceptor implements Interceptor {

    CCJSqlParserManager parserManager = new CCJSqlParserManager();

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();

        Connection conn = (Connection) args[0];
        log.info("当前数据 {}{}", conn.getSchema(), conn.getCatalog());
        conn.setCatalog("JiangSu_NanJing");
        log.info("{}{}", conn.getSchema(), conn.getCatalog());
//        conn.prepareCall("EXEC USE AnHui_HeFeiNew");
//        conn.prepareCall("EXEC USE JiangSu_NanJing");

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
