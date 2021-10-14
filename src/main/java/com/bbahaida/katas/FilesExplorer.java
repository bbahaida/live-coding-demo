package com.bbahaida.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilesExplorer {
    public static String explore(List<String> files) {
        List<Node> nodes = files.stream()
                .map(file -> {
                    Node node = new Node();
                    node.value = "/";
                    String[] path = file.split("/");
                    StringBuilder rootPath = new StringBuilder();
                    for (int i = 0; i < path.length; i++) {
                        rootPath.append(path[i]);
                        if (i < path.length - 1) {
                            rootPath.append("/");
                        }
                    }
                    return new Node();
                })
                .collect(Collectors.toList());
        return null;
    }
}

class Node {
    String value;
    List<Node> children = new ArrayList<>();
    String rootPath;

    Node findParent(String v, String path) {
        if (value.equals(v) && rootPath.equals(path)) {
            return this;
        }
        for (int i = 0; i < children.size(); i++) {

        }
        return null;
    }

}
