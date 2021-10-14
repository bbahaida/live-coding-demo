package com.bbahaida.katas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

public class JsonComparatorTest {

    @Test
    public void test1() throws IOException {

        String json1 = "{\"comment\":null,\"carrierCode\":\"BOL\",\"categoryLabel\":null,\"city\":\"SHENZHEN(44)\",\"codeCountry\":\"CN\",\"codePsl\":\"PCK\",\"dateActual\":null,\"dateEstimated\":\"2021-09-22 04:45:00+08:00\",\"fileName\":\"BLX-ALIS_STATUS_000000000000000000031085_JTIILS_JTI-A18783_FRA01A111216_20210923065835.xml\",\"refTransport\":\"JTI-A18783\",\"typeEvent\":\"Event\"}";
        String json2 = "{\"comment\":null,\"carrierCode\":\"BOL\",\"categoryLabel\":null,\"city\":\"SHENZHEN(44)\",\"codeCountry\":\"CN\",\"codePsl\":\"PCK\",\"dateActual\":null,\"dateEstimated\":\"2021-09-22 04:45:00+08:00\",\"fileName\":\"BLX-ALIS_STATUS_000000000000000000031085_JTIILS_JTI-A18783_FRA01A111216_20210923065835.xml\",\"refTransport\":\"JTI-A18783\",\"typeEvent\":\"Event\"}";

        Assertions.assertThat(JsonComparator.isEqual(json1, json2)).isTrue();
    }

    @Test
    public void test2() throws IOException {

        String json1 = "{\"comment\":null,\"sadav\":\"BOL\",\"categoryLabel\":null,\"city\":\"SHENZHEN(44)\",\"codeCountry\":\"CN\",\"codePsl\":\"PCK\",\"dateActual\":null,\"dateEstimated\":\"2021-09-22 04:45:00+08:00\",\"fileName\":\"BLX-ALIS_STATUS_000000000000000000031085_JTIILS_JTI-A18783_FRA01A111216_20210923065835.xml\",\"refTransport\":\"JTI-A18783\",\"typeEvent\":\"Event\"}";
        String json2 = "{\"comment\":null,\"carrierCode\":\"BOL\",\"categoryLabel\":null,\"city\":\"SHENZHEN(44)\",\"codeCountry\":\"CN\",\"codePsl\":\"PCK\",\"dateActual\":null,\"dateEstimated\":\"2021-09-22 04:45:00+08:00\",\"fileName\":\"BLX-ALIS_STATUS_000000000000000000031085_JTIILS_JTI-A18783_FRA01A111216_20210923065835.xml\",\"refTransport\":\"JTI-A18783\",\"typeEvent\":\"Event\"}";

        Assertions.assertThat(JsonComparator.isEqual(json1, json2)).isFalse();
    }

    @Test
    public void test3() throws IOException {

        String json1 = "{\"comment\":null,\"categoryLabel\":null,\"city\":\"SHENZHEN(44)\",\"codeCountry\":\"CN\",\"codePsl\":\"PCK\",\"dateActual\":null,\"dateEstimated\":\"2021-09-22 04:45:00+08:00\",\"fileName\":\"BLX-ALIS_STATUS_000000000000000000031085_JTIILS_JTI-A18783_FRA01A111216_20210923065835.xml\",\"refTransport\":\"JTI-A18783\",\"typeEvent\":\"Event\"}";
        String json2 = "{\"comment\":null,\"carrierCode\":\"BOL\",\"categoryLabel\":null,\"city\":\"SHENZHEN(44)\",\"codeCountry\":\"CN\",\"codePsl\":\"PCK\",\"dateActual\":null,\"dateEstimated\":\"2021-09-22 04:45:00+08:00\",\"fileName\":\"BLX-ALIS_STATUS_000000000000000000031085_JTIILS_JTI-A18783_FRA01A111216_20210923065835.xml\",\"refTransport\":\"JTI-A18783\",\"typeEvent\":\"Event\"}";

        Assertions.assertThat(JsonComparator.isEqual(json1, json2)).isFalse();
    }

    @Test
    public void test4() throws IOException {
        Assertions.assertThatThrownBy(() -> JsonComparator.isEqual(null, null))
                .isNotInstanceOf(NullPointerException.class)
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void test5() throws IOException {
        Assertions.assertThatThrownBy(() -> JsonComparator.isEqual("", ""))
                .isNotInstanceOf(NullPointerException.class)
                .isInstanceOf(IllegalArgumentException.class);
    }

}