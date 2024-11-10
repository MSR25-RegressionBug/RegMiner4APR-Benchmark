package com.alibaba.json.bvt.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;

public class JSONReaderScannerTest__entity_long extends TestCase {

    public void test_scanInt() throws Exception {
        StringBuffer buf = new StringBuffer();
        buf.append('[');
        for (int i = 0; i < 10; ++i) {
            if (i != 0) {
                buf.append(',');
            }
            //1000000000000
            //
            long value = (long) 1000000000000L + 1L + (long) i;
            buf.append("{\"id\":" + value + "}");
        }
        buf.append(']');

        Reader reader = new StringReader(buf.toString());

        JSONReaderScanner scanner = new JSONReaderScanner(reader);

        DefaultJSONParser parser = new DefaultJSONParser(scanner);
        List<VO> array = parser.parseArray(VO.class);
        for (int i = 0; i < array.size(); ++i) {
            long value = (long) 1000000000000L + 1L + (long) i;
            Assert.assertEquals(value, array.get(i).getId());
        }
    }

    public static class VO {

        private long id;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

    }
}
