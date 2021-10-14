package com.bbahaida.katas;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonComparator {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static boolean isEqual(String json1, String json2) throws IOException {
        if (json1 == null || json2 == null || "".equals(json1) || "".equals(json2)) {
            throw new IllegalArgumentException("Content should not be empty or null");
        }

        List<String> json1Fields = getFields(json1);
        List<String> json2Fields = getFields(json2);

        return json1Fields.size() == json2Fields.size() && json1Fields.containsAll(json2Fields);
    }

    private static List<String> getFields(String json) throws IOException {
        List<String> fields = new ArrayList<>();
        for (Iterator<String> it = mapper.readTree(json).fieldNames(); it.hasNext(); ) {
            String field = it.next();
            fields.add(field);
        }
        return fields;
    }
}
