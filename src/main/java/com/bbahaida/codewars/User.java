package com.bbahaida.codewars;
//https://www.codewars.com/kata/51fda2d95d6efda45e00004e/train/java
public class User {
    public int rank = -8;
    public int progress;
    public void incProgress(int kataRank) {
        if(kataRank < -8 || kataRank > 8 || kataRank == 0) {throw new IllegalArgumentException();}
        int newProgress = progress + computeProgress(kataRank);
        rankUp(newProgress);
        progress = newProgress % 100;
    }

    private void rankUp(int newProgress) {
        if (rank == 8) {
            return;
        }
        int rankProgress = newProgress/ 100;
        if (rank == -1 && rankProgress > 0){
            rank = 0;
        }
        this.rank = Math.min(rank + rankProgress, 8);
    }

    private int computeProgress(int kataRank) {
        int zeroGapTolerance = kataRank > 0 && rank < 0 ? 1 : 0;
        int diff = Math.abs(Math.abs(kataRank) + zeroGapTolerance - Math.abs(rank));
        if (rank >= kataRank) {
            switch (diff) {
                case 0: return 3;
                case 1: return 1;
                default: return 0;
            }
        }

        return 10 * diff * diff;
    }
}
