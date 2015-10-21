/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exotp2;

/**
 *
 * @author 1997
 */
public class Jouer {

    private int[] score = new int[10];

    public int getScore(int i) {
        return score[i];
    }

    public void setScore(int score, int i) {
        this.score[i] += score;

    }

    public int gagnant(int nbj) {
        int max = 0;
        for (int i = 0; i < nbj; i++) {
            if (score[max] < score[i]) {
                max = i;
            }

        }
        return max;
    }
}
