package com.bbahaida.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToCamelCaseTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void longTest() {
        String input = "You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields";
        System.out.println("input: "+input);
        assertEquals("YouHaveChosenToTranslateThisKataForYourConvenienceWeHaveProvidedTheExistingTestCasesUsedForTheLanguageThatYouHaveAlreadyCompletedAsWellAsAllOfTheOtherRelatedFields", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void longTest2() {
        String input = "left_Yellow_south_Rockstar_mountain_Ninja_left_north_mountain_south_Yellow";
        System.out.println("input: "+input);
        assertEquals("leftYellowSouthRockstarMountainNinjaLeftNorthMountainSouthYellow", ToCamelCase.toCamelCase(input));
    }
}
