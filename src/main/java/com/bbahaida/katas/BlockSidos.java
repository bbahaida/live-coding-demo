package com.bbahaida.katas;

import java.util.ArrayList;
import java.util.List;

public class BlockSidos {

    public List<Integer[]> buildPages(int dataSize){
        int pageSize = dataSize/4;
        int pageNumber = dataSize/4 + (dataSize%4==0 ? 0 : 1);

        List<Integer[]> pages = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < pageNumber - 1; i++) {
            pages.add(new Integer[]{start, start + pageSize});
            start += pageSize+1;
        }
        pages.add(new Integer[]{start, dataSize});
        return pages;
    }
}
