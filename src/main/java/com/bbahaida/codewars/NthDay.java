package com.bbahaida.codewars;

public class NthDay {
    public static String getDay(int day, boolean isLeap) {
        for (Month m : Month.values()) {
            int n = day - m.getDays(isLeap);
            if (n > 0) {
                day = day - m.getDays(isLeap);
            } else {
                return String.format("%s, %d", m.name(), day);
            }
        }
        throw new IllegalArgumentException();
    }
    enum Month {
        January {
            @Override
            int getDays(boolean isLeap) {
                return 31;
            }
        },
        February{
            @Override
            int getDays(boolean isLeap) {
                return isLeap ? 29 : 28;
            }
        },
        March{
            @Override
            int getDays(boolean isLeap) {
                return 31;
            }
        },
        April{
            @Override
            int getDays(boolean isLeap) {
                return 30;
            }
        },
        May{
            @Override
            int getDays(boolean isLeap) {
                return 31;
            }
        },
        June{
            @Override
            int getDays(boolean isLeap) {
                return 30;
            }
        },
        July{
            @Override
            int getDays(boolean isLeap) {
                return 31;
            }
        },
        August{
            @Override
            int getDays(boolean isLeap) {
                return 31;
            }
        },
        September{
            @Override
            int getDays(boolean isLeap) {
                return 30;
            }
        },
        October{
            @Override
            int getDays(boolean isLeap) {
                return 31;
            }
        },
        November{
            @Override
            int getDays(boolean isLeap) {
                return 30;
            }
        },
        December{
            @Override
            int getDays(boolean isLeap) {
                return 31;
            }
        };

        abstract int getDays(boolean isLeap);
    }

}
