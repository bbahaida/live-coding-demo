package com.bbahaida.katas;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FilesExplorerTest {

    @Test
    public void test1() {
        String e1 = "apps/src/root/game/file1.java";
        String actual = FilesExplorer.explore(List.of(e1));
        String expected = "--> apps --> src --> root --> game --> file1.java";
        assertThat(actual).isEqualTo(expected);
    }

}