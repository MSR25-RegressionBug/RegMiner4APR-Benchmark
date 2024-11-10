/*
 * Copyright 1999-2017 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.bvt.sql.oceanbase;

import java.util.List;

import org.junit.Assert;

import com.alibaba.druid.sql.MysqlTest;
import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;

public class OceanbaseCreateTableTest_subPartition3 extends MysqlTest {

    public void test_0() throws Exception {
        String sql = "CREATE TABLE ts (id INT, purchased DATE) " // 
                + "PARTITION BY RANGE(YEAR(purchased)) " //
                + "SUBPARTITION BY HASH(TO_DAYS(purchased)) " //
                + "( PARTITION p0 VALUES LESS THAN (1990) " //
                + "( SUBPARTITION s0, SUBPARTITION s1 ), PARTITION p1 VALUES LESS THAN (2000), PARTITION p2 VALUES LESS THAN MAXVALUE ( SUBPARTITION s2, SUBPARTITION s3 ) )"; //

        MySqlStatementParser parser = new MySqlStatementParser(sql);
        List<SQLStatement> stmtList = parser.parseStatementList();
        SQLStatement stmt = stmtList.get(0);

        String result = SQLUtils.toMySqlString(stmt);
        Assert.assertEquals("CREATE TABLE ts (\n" +
                        "\tid INT,\n" +
                        "\tpurchased DATE\n" +
                        ")\n" +
                        "PARTITION BY RANGE (YEAR(purchased))\n" +
                        "SUBPARTITION BY HASH (TO_DAYS(purchased)) (\n" +
                        "\tPARTITION p0 VALUES LESS THAN (1990) (\n" +
                        "\t\tSUBPARTITION s0,\n" +
                        "\t\tSUBPARTITION s1\n" +
                        "\t),\n" +
                        "\tPARTITION p1 VALUES LESS THAN (2000),\n" +
                        "\tPARTITION p2 VALUES LESS THAN MAXVALUE (\n" +
                        "\t\tSUBPARTITION s2,\n" +
                        "\t\tSUBPARTITION s3\n" +
                        "\t)\n" +
                        ")",
                            result);
        print(stmtList);

        Assert.assertEquals(1, stmtList.size());

        MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
        stmt.accept(visitor);

        System.out.println("Tables : " + visitor.getTables());
        System.out.println("fields : " + visitor.getColumns());
        System.out.println("coditions : " + visitor.getConditions());
        System.out.println("orderBy : " + visitor.getOrderByColumns());

        Assert.assertEquals(1, visitor.getTables().size());
        Assert.assertEquals(2, visitor.getColumns().size());
        Assert.assertEquals(0, visitor.getConditions().size());

        // Assert.assertTrue(visitor.getTables().containsKey(new TableStat.Name("t_basic_store")));

    }
}