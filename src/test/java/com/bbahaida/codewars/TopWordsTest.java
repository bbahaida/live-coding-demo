package com.bbahaida.codewars;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class TopWordsTest {
    @Test
    public void sampleTests() {
        /*assertEquals(Arrays.asList("e", "d", "a"),    TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
        assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        assertEquals(Arrays.asList("won't", "wont"),  TopWords.top3("  //wont won't won't "));
        assertEquals(Arrays.asList("e"),              TopWords.top3("  , e   .. "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  ...  "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  '  "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  '''  "));*/
        assertEquals(Arrays.asList("dpe", "urrfl", "qjx"),                 TopWords.top3("QJX EIh-uRrfL_jLWtBp,uRrfL,lkWatUi-uRrfL-snc Dpe QJX;PMBC lkWatUi!snc jLWtBp jLWtBp EIh QJX_uRrfL:jLWtBp EIh PMBC lkWatUi?QJX_QJX_EDek Dpe/lkWatUi uRrfL jLWtBp Dpe.EDek Dpe!jLWtBp:uRrfL.uRrfL.Dpe jLWtBp.YHpfohBLv-QJX uRrfL!PMBC EIh.uRrfL-QJX PMBC!EDek ZJBXVaOs QJX.QJX.QJX,lkWatUi jLWtBp EDek!Dpe lkWatUi QJX?YHpfohBLv/ZJBXVaOs uRrfL Dpe-jLWtBp_Dpe;lkWatUi jLWtBp Dpe uRrfL jLWtBp YHpfohBLv_snc,PMBC jLWtBp/Dpe;EIh EDek:lkWatUi,jLWtBp snc QJX PMBC?snc.QJX uRrfL EIh,QJX lkWatUi:lkWatUi EDek-Dpe QJX.Dpe?snc uRrfL uRrfL PMBC uRrfL.ZJBXVaOs!uRrfL PMBC!Dpe!uRrfL uRrfL PMBC PMBC uRrfL;EDek,jLWtBp PMBC!Dpe?Dpe Dpe ZJBXVaOs-Dpe QJX-snc Dpe:ZJBXVaOs EIh/YHpfohBLv,ZJBXVaOs.snc_jLWtBp?Dpe_Dpe PMBC:snc_uRrfL/Dpe,EIh_EIh lkWatUi ZJBXVaOs EDek Dpe QJX uRrfL,EDek PMBC uRrfL jLWtBp:uRrfL Dpe;jLWtBp YHpfohBLv snc Dpe uRrfL lkWatUi EDek uRrfL EIh Dpe-PMBC/QJX Dpe:EIh Dpe;jLWtBp_EIh!Dpe_QJX PMBC:uRrfL jLWtBp,ZJBXVaOs;ZJBXVaOs?PMBC uRrfL.ZJBXVaOs snc lkWatUi fDdvaJdMOn;QJX_YHpfohBLv fDdvaJdMOn.fDdvaJdMOn PMBC/snc-PMBC PMBC Dpe lkWatUi QJX-YHpfohBLv?PMBC?"));
        /*assertEquals(Arrays.asList("a", "of", "on"),  TopWords.top3(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n")) ));*/
    }
}
